
import OptionSelector from "components/QuestForm/index ";
import { Link, useParams } from "react-router-dom";
import "./styles.css"
import { useState, useEffect } from "react";
import { Props, Question, Quiz } from "types/quiz";
import { BASE_URL } from "utils/requests";
import axios from "axios";

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
        <div className="menu-options-item  cl-form-btn-container">
          <button type="submit" className="btn cl-form-btn">Iniciar</button>
        </div>
        <div className="menu-options-item cl-form-btn-container">
          <button type="submit" className="btn cl-form-btn">Concluir</button>
        </div>
      </div>
      <div className="quizz-container">
        {question?.map(x => (
          <div className="quest-container" key={x.quizId}>

          </div>
        ))}
      </div>
    </>
  );
}

type QuizProps = {
  quiz: Quiz;
}

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