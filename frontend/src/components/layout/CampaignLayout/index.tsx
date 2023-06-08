import { Link } from 'react-router-dom';
import { Campaign, CampaignBadge, CampaignPost, CampaignPostPage, CampaignUser } from 'types/campaign';
import { useEffect, useState } from 'react';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { Props } from 'types/quiz';
import { CampaignBadgePage, CampaignUserPage } from 'types/badge';
import { PostCard } from '../ArticleLayout';


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

export function ListBadgesByCampaign({ id: campaignId }: Props) {
    const [badgePage, setBadgePage] = useState<CampaignBadgePage>({content:[], number:0});
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/badges/${campaignId}`)
            .then((response) => {
                setBadgePage(response.data);
            })
    }, [campaignId]);

    return (
        <>
        <div className="title-container">Conquistas</div>
            <div className="nav-list-container">
                {badgePage.content?.map(x => (
                    <div key={x.campaignId} className="nav-list-item">
                        <BadgeCard badge={x} />
                    </div>
                ))}
            </div>
        </>
    );
}

export function ListUsersByCampaign({id: campaignId}: Props) {
    const[userPage, setUserPage] = useState<CampaignUserPage>({content: [], number: 0})
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/users/${campaignId}`)
        .then((response) => {
            setUserPage(response.data);
        });
    }, [campaignId]);

    return(
        <>
        <div className="title-container">Membros</div>
        <div className="nav-list-container">
            {userPage.content?.map(x => (
                <div key={x.campaignId} className="nav-list-item">
                    <UserSmCard campaignUser={x}/>
                </div>
            ))}
        </div>
        </>
    );
}

export function ListPostersByCampaign({id: campaignId}: Props) {
    const[postPage, setPostPage] = useState<CampaignPostPage>({content: [], number: 0})
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/posters/${campaignId}`)
        .then((response) => {
            setPostPage(response.data);
        });
    }, [campaignId]);

    return(
        <>
        <div className="title-container">Biblioteca</div>
        <div className="nav-list-container">
            {postPage.content?.map(x => (
                <div key={x.campaignId} className="nav-list-item">
                    <CampaignPostCard campaignPost={x}/>
                </div>
            ))}
        </div>
        </>
    );
}

type CampaignUserProps = {
    campaignUser: CampaignUser;
}

export function UserSmCard({ campaignUser }: CampaignUserProps) {

    return (
        <Link to={`/profile/${campaignUser.user?.id}`}>
            <div className="sm-card-container">
                <img className="sm-card-image" src={campaignUser.user?.image} alt={campaignUser.user?.userName} />
                <div className="sm-card-title">
                    <h6>{campaignUser.user?.userName}</h6>
                    <ul className="sm-card-info" >
                        <li>Total XP: {campaignUser.user?.conquest?.totalXp}</li>
                    </ul>
                </div>
            </div>
        </Link>
    );
}

type BadgeProps = {
    badge: CampaignBadge;
}

export function BadgeCard({badge}: BadgeProps){
return(
    <>
    <div className="sm-card-container">
        <img src={badge.badge.image} alt={badge.badge.name} className="sm-card-image" />
          <div className="sm-card-title"><h6>{badge.badge.name}</h6>
          <ul className="sm-card-info ">
          <li> Xp: {badge.badge.xp}</li>
          </ul></div>
        </div>
    </>
);
    }


    type PostProps = {
        campaignPost: CampaignPost;
    }
    
    export function CampaignPostCard({campaignPost}: PostProps){
        return (

            <Link to={`/post/${campaignPost.post.id}`} >
                <div className="article-card-container">
                    <h3>{ campaignPost.post.title}</h3>                 
                    <hr />               
                    <p>"{campaignPost.post.summary}"</p>
                </div>
            </Link>
        );
        }
    