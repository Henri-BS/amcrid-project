
import { Link, useParams } from "react-router-dom";
import "./styles.css"
import { useState, useEffect } from "react";
import { Option, Props, Question, Quiz } from "types/quiz";
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

  const params = useParams();

  const [question, setQuestion] = useState<Question[]>();
  useEffect(() => {
    axios.get(`${BASE_URL}/question/quiz/${quizId}`)
      .then((response) => {
        setQuestion(response.data);
      });
  }, [quizId]);

  return (
    <>
      <div className="menu-options-container">
        <h2 className="menu-options-item ">Quizz</h2>
          <button type="submit" className="menu-options-item  cl-form-btn-container btn cl-form-btn">Iniciar</button>
          <button type="submit" className="menu-options-item cl-form-btn-container btn cl-form-btn">Concluir</button>
      </div>
      {question?.map(x => (
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
  const params = useParams();
  const [optionList, setOptionList] = useState<Option[]>();

  useEffect(() => {
      axios.get(`${BASE_URL}/option/question/${question.id}`)
          .then((response) => {
              setOptionList(response.data);
          });
  }, [question.id]);


  return (
    <>
        <div className="quest-container" >
          {question.title}
          <form className="cl-form-container">
                <div className="card-form-container">
                    <div className="form-group cl-form-group">
                        <hr />
                        <ul>
                            {optionList?.map(x => (
                                <li key={x.id}>
                                    <OptionCard option={x} />
                                </li>
                            ))}
                        </ul>
                        <hr />
                    </div>
                </div>
            </form >        
            </div>
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