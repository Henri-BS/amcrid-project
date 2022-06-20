import axios from 'axios';
import { useEffect, useState } from 'react';
import { Question } from 'types/question';
import { BASE_URL } from 'utils/requests';
import './styles.css'

type Props = {
    questionId: string 
}

function QuestForm({questionId}: Props) {

    const[question, setQuestion] = useState<Question>();

useEffect(() => {
    axios.get(`${BASE_URL}/quizz/${questionId}?size=3`)
    .then(response => {
        setQuestion(response.data);
    })
}, [questionId]);

    return (
        <>
            <div className="cl-form-container">
                <div className="card-form-container">
                    <h3>{question?.title}</h3>
                    <form className="cl-form">
                        <div className="form-group cl-form-group">
                               <hr />  
                               <ul>
                                <li>A - {question?.optionA}</li>
                                <li>B - {question?.optionB}</li>
                                <li>C - {question?.optionC}</li>
                                <li>D - {question?.optionD}</li>
                                <li>E - {question?.optionE}</li>
                                <hr />
                            </ul>
                        </div>
                        <div className="form-group cl-form-group">
                            <label htmlFor="score">Selecione sua resposta</label>
                            <select className="form-control" id="score">
                                <option>A</option>
                                <option>B</option>
                                <option>C</option>
                                <option>D</option>
                                <option>E</option>
                            </select>
                        </div>
                    </form >
                </div>
            </div>
        </>
    );
}

export default QuestForm;