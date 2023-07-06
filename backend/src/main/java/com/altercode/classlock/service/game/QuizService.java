package com.altercode.classlock.service.game;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.dto.game.QuizDTO;
import com.altercode.classlock.dto.game.ResultDTO;
import com.altercode.classlock.entity.campaign.Chapter;
import com.altercode.classlock.entity.game.Quiz;
import com.altercode.classlock.entity.game.Result;
import com.altercode.classlock.repository.campaign.ChapterRepository;
import com.altercode.classlock.repository.game.QuestionRepository;
import com.altercode.classlock.repository.game.QuizRepository;
import com.altercode.classlock.repository.game.ResultRepository;
import com.altercode.classlock.repository.game.UserAnswerRepository;
import com.altercode.classlock.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAnswerRepository answerRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private ResultRepository resultRepository;


    public Page<QuizDTO> findAllQuizzes(Pageable pageable) {
        Page<Quiz> result = quizRepository.findAll(pageable);

        int questionQuantity;
        for (Quiz q : result) {
            questionQuantity = q.getQuestions().size();
            q.setQuestionQuantity(questionQuantity);
        }
        return result.map(QuizDTO::new);
    }

    public QuizDTO findQuizById(Long id) {
        Quiz find = quizRepository.findById(id).orElseThrow();
        return new QuizDTO(find);
    }

    public List<QuizDTO> findQuizzesByChapter(Chapter chapter) {
        List<Quiz> list = quizRepository.findQuizzesByChapter(chapter);
        return list.stream().map(QuizDTO::new).collect(Collectors.toList());
    }


    public QuizDTO saveQuiz(QuizDTO dto) {
        Chapter chapter = chapterRepository.findById(dto.getChapterId()).orElseThrow();

        Quiz add = new Quiz();
        add.setTitle(dto.getTitle());
        add.setDescription(dto.getDescription());
        add.setImage(dto.getImage());
        add.setChapter(chapter);

        return new QuizDTO(quizRepository.saveAndFlush(add));
    }


    public QuizDTO updateQuiz(QuizDTO dto) {
        Chapter chapter = chapterRepository.findById(dto.getChapterId()).orElseThrow();
        Quiz edit = quizRepository.findById(dto.getId()).orElseThrow();

        edit.setId(edit.getId());
        edit.setTitle(dto.getTitle());
        edit.setDescription(dto.getDescription());
        edit.setImage(dto.getImage());
        edit.setChapter(chapter);
        return new QuizDTO(quizRepository.save(edit));
    }

    public void deleteQuiz(Long id) {
        this.quizRepository.deleteById(id);
    }




    public void saveScore(Result result) {
        Result saveResult = new Result();
        saveResult.setTotalCorrect(result.getTotalCorrect());
        resultRepository.save(saveResult);
    }

    public List<ResultDTO> getTopScore() {
        List<Result> scoreList = resultRepository.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
        return scoreList.stream().map(x -> new ResultDTO()).collect(Collectors.toList());
    }


}
