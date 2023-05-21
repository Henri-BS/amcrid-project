import { Link } from 'react-router-dom';
import { Chapter } from 'types/chapter';
import './styles.css'
import { useEffect, useState } from 'react';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { Props, Quiz } from 'types/quiz';
import { QuizCard } from 'components/QuizzGame';

type ChapterProps = {
    chapter: Chapter;
}

export function ChapterCard({ chapter }: ChapterProps) {

    return (
        <div>
            <img className="cl-quest-card-image" src={chapter.image} alt={chapter.title} />
            <div className="cl-card-bottom-container">
                <h3>{chapter.title}</h3>

                <div className="cl-card-info">
                    <label htmlFor="touch" >
                        <span>Etapas</span>
                    </label>
                    <nav>
                        <input type="checkbox" id="touch" />
                        <ul className=" list-unstyled slide">
                            <li>  <b>1</b> - Quizz Princípios Básicos da Segurança da Informação</li>
                            <li>  <b>2</b> - Quizz Confiabilidade e Integridade</li>
                            <li>  <b>3</b> - Quizz Autenticidade e Disponibilidade</li>
                        </ul>
                    </nav>
                    <hr />
                </div>

                <Link to={`/chapter/${chapter.id}`} className="btn btn-primary cl-form-btn">
                    Acessar
                </Link>
            </div>
        </div>
    );

}



export function ChapterDashboard({ id: chapterId }: Props) {

    const [chapter, setChapter] = useState<Chapter>();
    useEffect(() => {
        axios.get(`${BASE_URL}/chapter/${chapterId}`)
            .then((response) => {
                setChapter(response.data);
            })
    }, [chapterId]);

    return (
        <>
            <div className="dashboard-container">
                <div className="row p-0">
                    <img className="bg-img-container col-4" src={chapter?.image} alt={chapter?.title} />
                    <div className="description-container col-8">            <div className="title-container">Capítulo: {chapter?.title}</div>
                        {chapter?.description}</div>
                </div>
            </div>
        </>
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
        <>
        <div className="title-container">Quizzes</div>
      <div className=" nav-list-container">
        {quizList?.map(x => (
          <div key={x.chapterId} className="nav-list-item">
            <QuizCard quiz={x} />
          </div>
        ))}
      </div>
      </>
    );
  }
  