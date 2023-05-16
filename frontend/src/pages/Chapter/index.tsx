import {QuizCard, QuizGame} from 'components/QuizzGame';
import React, { useState, useEffect } from 'react';
import './styles.css';
import { useParams } from 'react-router-dom';
import { Props, Quiz } from 'types/quiz';
import { BASE_URL } from 'utils/requests';
import axios from 'axios';

export function Chapter() {
  const params = useParams();
return(
  <div className="container">
    <ListQuizzesByChapter id={`${params.chapterId}`} />
  </div>
);
}


export function ListQuizzesByChapter({ id: chapterId }: Props) {

  const [quizList, setQuizList] = useState<Quiz[]>();
  useEffect(() => {
    axios.get(`${BASE_URL}/quiz/chapter/${chapterId}`)
      .then((response) => {
        setQuizList(response.data);
      });
  }, [chapterId]);

  return (
    <div className="row">
      {quizList?.map(x => (
        <div key={x.chapterId} className="col-sm-6 col-lg-4 col-xl-4 mb-3">
          <QuizCard quiz={x}/>
        </div>
      ))}
    </div>
  );
}

