
import { Link, useParams } from "react-router-dom";
import "./styles.css"
import { useState, useEffect } from "react";
import { Option, Props, Question, QuestionPage, Quiz } from "types/quiz";
import { BASE_URL } from "utils/requests";
import axios from "axios";

export function QuizCard({ quiz }: QuizProps) {

  return (
    <>
      <Link to={`/quiz/${quiz.id}`} >
        <div className="card-md-container">
          <div className="card-md-title">{quiz.title}</div>
          <div className="card-md-list">
            <li className="card-md-item ">Descrição:
              <p className="card-md-content">{quiz.description}</p>
            </li>
            <li className="card-md-item ">Quantidade de Questões:
              <p className="card-md-content">{quiz.questionQuantity}</p>
            </li>
          </div>
        </div>
      </Link>
    </>
  );
}

export function QuizGame({ id: quizId }: Props) {

  const [question, setQuestion] = useState<QuestionPage>({
    content: [],
    number: 0
  });
  useEffect(() => {
    axios.get(`${BASE_URL}/question/quiz/${quizId}?size=1`)
      .then((response) => {
        setQuestion(response.data);
      });
  }, [quizId]);


  const [quiz, setQuiz] = useState<Quiz>();
  useEffect(() => {
    axios.get(`${BASE_URL}/quiz/${quizId}`)
      .then((response) => {
        setQuiz(response.data);
      })
  }, [quizId])

  return (
    <>
    <h2>Quiz {quiz?.title}</h2>
      <div className="menu-options-container">
        <button type="submit" className="menu-options-item  cl-form-btn-container btn cl-form-btn">Iniciar</button>
        <button type="submit" className="menu-options-item cl-form-btn-container btn cl-form-btn">Concluir</button>
      </div>
      {question?.content.map(x => (
        <QuestionCard question={x} />
      ))}
    </>
  );
}

type QuizProps = {
  quiz: Quiz;
}

export function QuizProfile() {
  const params = useParams();

  return (
    <div className="container">
      <QuizGame id={`${params.quizId}`} />
    </div>
  );
}

type QuestionProps = {
  question: Question;
}

export function QuestionCard({ question }: QuestionProps) {

  const [optionList, setOptionList] = useState<Option[]>();
  useEffect(() => {
    axios.get(`${BASE_URL}/option/question/${question.id}`)
      .then((response) => {
        setOptionList(response.data);
      });
  }, [question.id]);

  const [questionProf, setQuestionProf] = useState<Question>();
  useEffect(() => {
    axios.get(`${BASE_URL}/question/${question.id}`)
      .then((response) => {
        setQuestionProf(response.data)
      })
  }, [question.id]);

  return (
    <>        <form className="form ">      

    <div className="row">
      <div className="quest-container col-6" >        
      {questionProf?.title}      
      </div>
          <div className="card-form-container col-6">
            <div className="form-group">
              <ul>
              <h3>{optionList?.length} Alternativas</h3>
                {optionList?.map(x => (
                  <li key={x.id} >
                    <OptionCard option={x} />
                  </li>
                ))}
              </ul>
            </div>
          </div>
      </div>        
</form >
    </>
  );
}

type OptionProps = {
  option: Option;
}

export function OptionCard({ option }: OptionProps) {

  return (
    <>
      <div>
        {option.choice}
      </div>
    </>
  );
}