import axios from "axios";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { CampaignProps, ChapterProps, Chapter, Campaign } from "types/campaign";
import { Props } from "types/page";
import { BASE_URL } from "utils/requests";
import "../styles.css";

export function CampaignCard({ campaign }: CampaignProps) {
    return (
        <>
            <div className="row quest-chapter-container">
                <div className="col-sm-6 col-md-3 xl-3">
                    <Link to={`/campaign/${campaign.id}`}>
                        <img className="card-md-image" src={campaign.image} alt={campaign.name} />
                        <div className="card-md-container dark-card">
                            <div className="card-md-title">
                                <h3>{campaign.name}</h3>
                            </div>
                        </div>
                    </Link>
                </div>
                <div className="article-container col-sm-6 col-md-9 col-xl-9">
                    <div className="article-content">
                        <h2>"{campaign.name}"</h2>
                        <p>{campaign.description}</p>
                        <div className="cl-card-info">
                            <label htmlFor="touch" >
                                <span>Etapas</span>
                            </label>
                            <nav>
                                <input type="checkbox" id="touch" />
                                <ul className="list-unstyled slide">
                                    <li>  <b>1</b> - Quizz Princípios Básicos da Segurança da Informação</li>
                                    <li>  <b>2</b> - Quizz Confiabilidade e Integridade</li>
                                    <li>  <b>3</b> - Quizz Autenticidade e Disponibilidade</li>
                                </ul>
                            </nav>
                            <hr />
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}

export function CampaignLgCard({ id: camapaignId }: Props) {

    const [campaign, setCampaign] = useState<Campaign>();
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/${camapaignId}`)
            .then((response) => {
                setCampaign(response.data);
            })
    }, [camapaignId]);

    return (
        <>
            <div className="card-lg-container row m-0">
                <img className="card-lg-image col-12 col-lg-5" src={campaign?.image} alt={campaign?.name} />
                <div className=" description-container col-12 col-lg-7">
                    <div className="title-container">Campanha: {campaign?.name}</div>
                    {campaign?.description}
                </div>
            </div>
        </>
    );
}

export function CampaignMdCard({ campaign }: CampaignProps) {
    return (
        <Link to={`/campaign/${campaign.id}`} >
            <img className="card-md-image" src={campaign.image} alt={campaign.name} />
            <div className="card-md-container dark-card">
                <div className="card-md-title">
                    <h3>{campaign.name}</h3>
                </div>
            </div>
        </Link>

    );
}

export function ChapterCard({ chapter }: ChapterProps) {

    return (
        <>
            <Link to={`/chapter/${chapter.id}`} className="">
                <img className="card-md-image" src={chapter.image} alt={chapter.title} />
                <div className="card-md-container dark-card">
                    <div className="card-md-title">
                        <h3>{chapter.title}</h3>
                    </div>
                </div>
            </Link>
        </>
    );

}

export function ChapterLgCard({ chapter }: ChapterProps) {

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
            <div className="card-lg-container row m-0">
                <img className="card-lg-image col-12 col-lg-5" src={chapter?.image} alt={chapter?.title} />
                <div className=" description-container col-12 col-lg-7">
                    <div className="title-container">Capítulo: {chapter?.title}</div>
                    {chapter?.description}
                </div>
            </div>
        </>
    );
}