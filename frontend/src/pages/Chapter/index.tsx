import QuizGame from 'components/QuizzGame';
import React from 'react';
import './styles.css';
import { useParams } from 'react-router-dom';

function Chapter() {

const params = useParams();

  return (
    <>
      <div className="container">
       <QuizGame id={`${params.quizId}`} />
      </div>
    </>
  );
}

export default Chapter;