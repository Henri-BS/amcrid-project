import Form from 'components/Form/index ';
import React from 'react';
import './styles.css';


export default function Quest() {
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
    <div className="quest-container"><Form /></div>
    <div className="quest-container"><Form /></div>
    <div className="quest-container"><Form /></div>
      </div>
      </div>
    </>
  );
}