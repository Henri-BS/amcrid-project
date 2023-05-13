
import OptionSelector from "components/QuestForm/index ";
import { useParams } from "react-router-dom";
import "./styles.css"

function QuizzGame() {

  const params = useParams();

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
        <div className="quest-container">
          <OptionSelector questionId={`${params.questionId}`} />
        </div>
        <div className="quest-container">
          <OptionSelector questionId={`${params.questionId}`} />
        </div>
        <div className="quest-container">
          <OptionSelector questionId={`${params.questionId}`} />
        </div>
      </div>
    </>
  );
}

export default QuizzGame;