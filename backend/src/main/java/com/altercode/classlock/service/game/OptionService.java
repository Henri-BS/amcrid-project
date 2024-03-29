package com.altercode.classlock.service.game;

import com.altercode.classlock.dto.game.OptionDTO;
import com.altercode.classlock.entity.game.Option;
import com.altercode.classlock.entity.game.Question;
import com.altercode.classlock.repository.game.OptionRepository;
import com.altercode.classlock.repository.game.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OptionService {

    @Autowired
    private OptionRepository optionRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public List<OptionDTO> findOptionByQuestion(Question question) {
        List<Option> list = optionRepository.findOptionByQuestion(question);
        return list.stream().map(OptionDTO::new)
                .limit(10L)
                .collect(Collectors.toList());
    }

    public OptionDTO findOptionById(Long id) {
        Option find = optionRepository.findById(id).orElseThrow();
        return new OptionDTO(find);
    }

    public OptionDTO saveOption(OptionDTO dto) {
        Question question = questionRepository.findById(dto.getQuestionId()).orElseThrow();

        Option add = new Option();
        add.setChoice(dto.getChoice());
        add.setQuestion(question);

        return new OptionDTO(optionRepository.saveAndFlush(add));
    }

    public OptionDTO updateOption(OptionDTO dto) {
        Option edit = optionRepository.findById(dto.getId()).orElseThrow();

        edit.setId(edit.getId());
        edit.setChoice(dto.getChoice());
        return new OptionDTO(optionRepository.save(edit));
    }

    public void deleteOption(Long id) {
        this.optionRepository.deleteById(id);
    }
}
