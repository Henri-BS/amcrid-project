import Form from 'components/Form/index ';
import React from 'react';
import './styles.css';


export default function Quest() {
  return (
    <>
    <div className="container">
      <h2>Quizz</h2>
    <div className="quizz-container">
    <div className="quest-container"><Form /></div>
    <div className="quest-container"><Form /></div>
    <div className="quest-container"><Form /></div>
      </div>
      </div>
    </>
  );
}