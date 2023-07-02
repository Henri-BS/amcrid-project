import axios from 'axios';
import './styles.css';
import { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Conquest } from 'types/conquest';
import { FollowPage, FollowProps, User, UserPostPage, UserPostProps, UserProps } from 'types/user';
import { BASE_URL } from 'utils/requests';
import { Props } from 'types/quiz';
import { CampaignUserPage, UserBadgePage } from 'types/badge';
import { CampaignPage, CampaignUser, CampaignUserProps } from 'types/campaign';
import { CampaignMdCard } from '../ChapterLayout';

export function UserCard({ id: userId }: Props) {

    const [user, setUser] = useState<User>();
    useEffect(() => {
        axios.get(`${BASE_URL}/user/${userId}`)
            .then(response => {
                setUser(response.data);
            });
    }, [userId]);

    return (
        <div >

            <div className="user-card-container row m-0">
                <img className="user-card-image col-2" src={user?.image} alt={user?.userName} />
                <div className="col-10">
                    <h5>{user?.userName}</h5>
                    <h6>Minha Biografia</h6>
                </div>
            </div>
        </div>
    );
}

export function BadgeListByUser({ id: userId }: Props) {
    const [badgeList, setBadgeList] = useState<UserBadgePage>({content: [], number: 0});
    useEffect(() => {
        axios.get(`${BASE_URL}/badge/by-user/${userId}`)
            .then((response) => {
                setBadgeList(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <div className="row">
                    {badgeList?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                        <abbr title={x.badge.name}>
                            <img className="badge-item" src={x.badge.image} alt={x.badge.name} />
                        </abbr>
                    </div>
                ))}
            </div>  
            </div>
        </>
    );
}

export function ListSavedPostsByUser({ id: userId }: Props) {

    const [postPage, setPostPage] = useState<UserPostPage>({content: [], number: 0});
    useEffect(() => {
        axios.get(`${BASE_URL}/user/list-post/${userId}?size=12`)
            .then((response) => {
                setPostPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className="user-body-container">
                <h3>Publicações Salvas</h3>
                <div className="row">
                    {postPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <CampaignPostCard userPost={x} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
    function CampaignPostCard({ userPost }: UserPostProps) {

        return (
            <Link to={`/post/${userPost.post.id}`} >
                <div className="article-card-container dark-card">
                    <h3>{userPost.post.title}</h3>
                    <hr />
                    <p>"{userPost.post.summary}"</p>
                </div>
            </Link>
        );
    }
}

export function ListSavedCampaignByUser({ id: userId }: Props) {

    const [campaignPage, setCampaignPage] = useState<CampaignUserPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign-user/list-user/${userId}`)
            .then((response) => {
                setCampaignPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <h3>Campanhas que Participo</h3>
                <div className="row">
                    {campaignPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <CampaignUserMdCard campaignUser={x} />
                        </div>
                    ))}
                </div>
            </div>

        </>
    );
    function CampaignUserMdCard({ campaignUser }: CampaignUserProps) {
        return(
        <div>
            <img className="cl-quest-card-image" src={campaignUser.campaign.image} alt={campaignUser.campaign.name} />
            <div className="card-md-container dark-card">
                <h3>{campaignUser.campaign.name}</h3>
                <Link to={`/campaign/${campaignUser.campaign.id}`} className="btn btn-primary cl-form-btn">
                    Acessar
                </Link>
            </div>
        </div>
        );
    }
}

export function ListCreatedCampaignByUser({ id: userId }: Props) {

    const [campaignPage, setCampaignPage] = useState<CampaignPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/user/${userId}`)
            .then((response) => {
                setCampaignPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <h3>Campanhas Criadas</h3>
                <div className="row">
                    {campaignPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <CampaignMdCard campaign={x} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}

export function FollowerUserList({ id: userId }: Props) {

    const [followPage, setFollowPage] = useState<FollowPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/follow/follower/${userId}`)
            .then((response) => {
                setFollowPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <div className="row">
                    {followPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-3 mb-2">
                            <FollowSmallCard follow={x} />
                        </div>
                    ))}
                </div>
            </div>

        </>
    );
    function FollowSmallCard({ follow }: FollowProps){

        return (
            <Link to={`/profile/${follow?.following.id}`}>
                <div className="sm-card-container dark-card">
                    <img className="sm-card-image" src={follow?.following.image} alt={follow?.following.userName} />
                    <div className="sm-card-title">
                        <h6>{follow?.following.userName}</h6>
                        <ul className="sm-card-info" >
                            <li>TotalXp: {follow?.following.conquest.totalXp}</li>
                        </ul>
                    </div>
                </div>
            </Link>
        );
    }
}

export function FollowingUserList({ id: userId }: Props) {

    const [followPage, setFollowPage] = useState<FollowPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/follow/following/${userId}`)
            .then((response) => {
                setFollowPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <div className="row">
                    {followPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <FollowSmallCard follow={x} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
    function FollowSmallCard({ follow }: FollowProps){

        return (
            <Link to={`/profile/${follow?.follower.id}`}>
                <div className="sm-card-container dark-card">
                    <img className="sm-card-image" src={follow?.follower.image} alt={follow?.follower.userName} />
                    <div className="sm-card-title">
                        <h6>{follow?.follower.userName}</h6>
                        <ul className="sm-card-info" >
                            <li>TotalXp: {follow?.follower.conquest.totalXp}</li>
                        </ul>
                    </div>
                </div>
            </Link>
        );
    }
    
}

export function UserCardConquests({ id: conquestId }: Props) {

    const params = useParams();

    const [conquest, setConquest] = useState<Conquest>();
    useEffect(() => {
        axios.get(`${BASE_URL}/conquest/${conquestId}`)
            .then(response => {
                setConquest(response.data);
            });
    }, [conquestId]);

    return (
        <div className='user-body-container'>
            <ul className="list-unstyled">
                <CampaingUserStats id={`${params.userId}`} />
                <li className="user-item mb-2"><b>Quests Principais Finalizadas: </b> {conquest?.principalQuest}</li>
                <li className="user-item mb-2"><b>Quests Secundárias Finalizadas: </b> {conquest?.secondaryQuest}</li>
                <li className="user-item mb-2"><b>Capítulos Finalizados: </b> {conquest?.chapterCompleted}</li>
                <li className="user-item mb-2"><b>Total de Badges: </b> {conquest?.totalBadges}</li>
                <li className="user-item mb-2"><b>Total de Xp: </b> {conquest?.totalXp}</li>
            </ul>
        </div>
    );

    function CampaingUserStats({ id: userId }: Props) {
        const [user, setUser] = useState<CampaignUser>();
        useEffect(() => {
            axios.get(`${BASE_URL}/campaign-user/find-by-user/${userId}`)
                .then((response) => {
                    setUser(response.data);
                });
        }, [userId]);
        return (
            <div>
                <li className="user-item mb-2"><b>Total de Capítulos das Minhas Campanhas: </b> {user?.chapterQuantity}</li>
                <li className="user-item mb-2"><b>Total de Postagens das Minhas Campanhas: </b> {user?.postQuantity}</li>
            </div>
        );
    }
}

export function UserSmallCard({ user }: UserProps) {

    return (
        <Link to={`/profile/${user?.id}`}>
            <div className="sm-card-container dark-card">
                <img className="sm-card-image" src={user?.image} alt={user?.userName} />
                <div className="sm-card-title">
                    <h6>{user?.userName}</h6>
                    <ul className="sm-card-info" >
                        <li>E-mail: {user?.email}</li>
                    </ul>
                </div>
            </div>
        </Link>
    );
}

