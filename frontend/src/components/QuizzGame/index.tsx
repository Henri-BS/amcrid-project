
import OptionSelector from "components/QuestForm/index ";
import { useParams } from "react-router-dom";
import "./styles.css"
import { useState, useEffect } from "react";
import { Props, Question } from "types/quiz";
import { BASE_URL } from "utils/requests";
import axios from "axios";

function QuizGame({ id: quizId }: Props) {

  const params = useParams();

  const [question, setQuestion] = useState<Question[]>();
  useEffect(() => {
    axios.get(`${BASE_URL}/question/${quizId}`)
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
          <OptionSelector questionId={`${params.questionId}`} />
        </div>
        ))}
      </div>
    </>
  );
}

export default QuizGame;