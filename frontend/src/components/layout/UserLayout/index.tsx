import axios from 'axios';
import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { Conquest } from 'types/conquest';
import { User, UserProps } from 'types/user';
import { BASE_URL } from 'utils/requests';
import './styles.css'
import { Props } from 'types/quiz';
import { UserBadge } from 'types/badge';
import { Post } from 'types/post';
import { PostCard } from '../ArticleLayout';
import { Campaign, CampaignPage } from 'types/campaign';
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
                <img className="user-card-image col-4" src={user?.image} alt={user?.userName} />
                <div className="col-10">
                    <h2>{user?.userName}</h2>
                    <BadgeListByUser id={userId} />
                </div>
            </div>
        </div>
    );

    function BadgeListByUser({ id: userId }: Props) {
        const [badgeList, setBadgeList] = useState<UserBadge[]>();
        useEffect(() => {
            axios.get(`${BASE_URL}/badge/by-user/${userId}`)
                .then((response) => {
                    setBadgeList(response.data);
                })
        }, [userId]);

        return (
            <>
                <div className="user-badge-container">
                    {badgeList?.map(x => (
                        <div key={x.id}>
                            <abbr title={x.badge.name}>
                                <img className="badge-item" src={x.badge.image} alt={x.badge.name} />
                            </abbr>
                        </div>
                    ))}
                </div>
            </>
        );
    }
}

export function PostListByUser({ id: userId }: Props) {

    const [postPage, setPostPage] = useState<Post[]>();
    useEffect(() => {
        axios.get(`${BASE_URL}/user/posters/${userId}`)
            .then((response) => {
                setPostPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <div className="row">
                    {postPage?.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <PostCard post={x} />
                        </div>
                    ))}
                </div>
            </div>

        </>
    );
}

export function CampaignListByUser({ id: userId }: Props) {

    const [campaignPage, setCampaignPage] = useState<CampaignPage>({content: [], number: 0});
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/user/${userId}`)
            .then((response) => {
                setCampaignPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
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

export function UserCardConquests({ id: conquestId }: Props) {
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
                <li className="user-item mb-2"><b>Quests Principais Finalizadas: </b> {conquest?.principalQuest}</li>
                <li className="user-item mb-2"><b>Quests Secundárias Finalizadas: </b> {conquest?.secondaryQuest}</li>
                <li className="user-item mb-2"><b>Capítulos Finalizados: </b> {conquest?.chapterCompleted}</li>
                <li className="user-item mb-2"><b>Total de Badges: </b> {conquest?.totalBadges}</li>
                <li className="user-item mb-2"><b>Total de Xp: </b> {conquest?.totalXp}</li>
            </ul>
        </div>
    );
}

export function MiniUserCard({ user }: UserProps) {

    return (
        <Link to={`/profile/${user?.id}`}>
            <div className="sm-card-container">
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

