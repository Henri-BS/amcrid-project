import axios from 'axios';
import { useEffect, useState } from 'react';
import { Question } from 'types/question';
import { BASE_URL } from 'utils/requests';
import './styles.css'

type Props = {
    questionId: string
}

function QuestForm({ questionId }: Props) {

    const [question, setQuestion] = useState<Question>();

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
                                <li> <b>A</b> - {question?.optionA}</li>
                                <li> <b>B</b> - {question?.optionB}</li>
                                <li> <b>C</b> - {question?.optionC}</li>
                                <li> <b>D</b> - {question?.optionD}</li>
                                <li> <b>E</b> - {question?.optionE}</li>
                                <hr />
                            </ul>
                        </div>
                    </form >
                </div>
            </div>
        </>
    );
}

export default QuestForm;