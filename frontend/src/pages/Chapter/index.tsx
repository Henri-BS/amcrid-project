import QuestForm from 'components/Form/index ';
import React from 'react';
import { useParams } from 'react-router-dom';
import './styles.css';

function Chapter() {
const params = useParams();

  return (
    <>
      <div className="container">
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
          <div className="quest-container"><QuestForm questionId={`${params.questionId}`} /></div>
        </div>
      </div>
    </>
  );
}

export default Chapter;