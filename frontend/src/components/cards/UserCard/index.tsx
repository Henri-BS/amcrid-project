import axios from "axios";
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { CampaignUserProps } from "types/campaign";
import { Conquest } from "types/conquest";
import { Props } from "types/page";
import { FollowProps, User, UserPostProps, UserProps } from "types/user";
import { BASE_URL } from "utils/requests";
import "../styles.css";

export function UserLgCard({ id: userId }: Props) {

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
                <li className="user-item mb-2"><b>Campanhas Finalizadas: </b> {conquest?.principalQuest}</li>
                <li className="user-item mb-2"><b>Publicações Lidas: </b> {conquest?.secondaryQuest}</li>
                <li className="user-item mb-2"><b>Capítulos Finalizados: </b> {conquest?.chapterCompleted}</li>
                <li className="user-item mb-2"><b>Total de Badges: </b> {conquest?.totalBadges}</li>
                <li className="user-item mb-2"><b>Total de Xp: </b> {conquest?.totalXp}</li>
            </ul>
        </div>
    );


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

export function UserPostCard({ userPost }: UserPostProps) {

    return (
        <Link to={`/post/${userPost.post.id}`} >
            <img className="card-md-image " src={userPost.post.image} alt={userPost.post.title} />
            <div className="card-md-container dark-card">
                <div className="card-md-title">
                    <h3>{userPost.post.title}</h3>
                </div>
                <abbr title={userPost.post.summary}>
                    <p className="text-center">Sumário <i className="fas fa-eye" /></p>
                </abbr>
            </div>
        </Link>
    );
}

export function CampaignUserMdCard({ campaignUser }: CampaignUserProps) {
    return (
        <div>
            <Link to={`/campaign/${campaignUser.campaign.id}`} >
                <img className="card-md-image" src={campaignUser.campaign.image} alt={campaignUser.campaign.name} />
                <div className="card-md-container dark-card">
                    <div className="card-md-title">
                        <h3>{campaignUser.campaign.name}</h3>
                    </div>
                </div>
            </Link>
        </div>
    );
}

export function FollowingSmallCard({ follow }: FollowProps) {

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

export function FollowerSmallCard({ follow }: FollowProps) {

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