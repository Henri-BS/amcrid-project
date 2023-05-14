import axios from 'axios';
import { useEffect, useState } from 'react';
import { Option } from 'types/quiz';
import { BASE_URL } from 'utils/requests';
import './styles.css'

type Props = {
    questionId: string
}

function OptionSelector({ questionId }: Props) {

    const [option, setOption] = useState<Option[]>();

    useEffect(() => {
        axios.get(`${BASE_URL}/quiz/${questionId}?size=3`)
            .then(response => {
                setOption(response.data);
            })
    }, [questionId]);

    useEffect(() => {
        axios.get(`${BASE_URL}/option/question/${questionId}`)
            .then((response) => {
                setOption(response.data);
            });
    }, [questionId]);

    return (
        <>
            <form className="cl-form-container">
                <div className="card-form-container">
                    <div className="form-group cl-form-group">
                        <hr />
                        <ul>
                            {option?.map(x => (
                                <input type='checkbox' key={x.id}> <b>A</b> - {x.choice}/</input>
                            ))}
                            <hr />
                        </ul>
                    </div>
                </div>
            </form > 
        </>
    );
}

export default OptionSelector;