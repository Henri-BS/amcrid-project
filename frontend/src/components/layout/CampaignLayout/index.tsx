import { Link } from 'react-router-dom';
import { Campaign, Chapter } from 'types/chapter';
import './styles.css'
import { useEffect, useState } from 'react';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { Props, Quiz } from 'types/quiz';
import { QuizCard } from 'components/game/QuizzGame';


type CampaignProps = {
    campaign: Campaign;
}

export function CampaignCard({ campaign }: CampaignProps) {
    return (
        <>
            <div className="row quest-chapter-container">
                <div className="col-sm-6 col-md-3 xl-3">
                    <img className="cl-quest-card-image" src={campaign.image} alt={campaign.name} />
                    <div className="cl-card-bottom-container">
                        <h3>{campaign.name}</h3>

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

                        <Link to={`/campaign/${campaign.id}`} className="btn btn-primary cl-form-btn">
                            Acessar
                        </Link>
                    </div>
                </div>
                <div className="article-container col-sm-6 col-md-9 col-xl-9">
                    <div className="article-content">
                        <h2>"{campaign.name}"</h2>
                        <p>{campaign.description}</p>
                    </div>
                </div>
            </div>
        </>
    );
}

type ChapterProps = {
    chapter: Chapter;
}


export function ChapterCard({ chapter }: ChapterProps) {

    return (
        <>
            <img className="cl-quest-card-image" src={chapter.image} alt={chapter.title} />
            <div className="cl-card-bottom-container">
                <h3>{chapter.title}</h3>

                <Link to={`/chapter/${chapter.id}`} className="btn btn-primary cl-form-btn">
                    Acessar
                </Link>
            </div>
        </>
    );

}

export function ArticleChapter({ chapter }: ChapterProps) {

    return (
        <>
            <div className="article-container">
                <div className="article-content">
                    <h2>"{chapter.title}"</h2>
                    <p>{chapter.description}</p>
                </div>
            </div>
        </>
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