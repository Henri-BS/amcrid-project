
import axios from 'axios';
import { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Conquest } from 'types/conquest';
import { User } from 'types/user';
import { BASE_URL } from 'utils/requests';
import './styles.css'
import { Props } from 'types/quiz';
import { UserBadge } from 'types/badge';

function UserCard({ id: userId }: Props) {
    const params = useParams();

    const [user, setUser] = useState<User>();
    useEffect(() => {
        axios.get(`${BASE_URL}/user/${userId}`)
            .then(response => {
                setUser(response.data);
            });
    }, [userId]);

    return (
        <div>
            <img className="user-card-image" src={user?.image} alt={user?.userName} />
            <div className="user-card-container ">
                <h3>{user?.userName}</h3>
                <BadgeListByUser id={`${params.userId}`} />
                <hr />
            </div>
        </div>
    );
}
export default UserCard;

export function BadgeListByUser({ id: userId }: Props) {
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
                    <div className="badge-item" key={x.id}>
                        <img className="badge-item" src={x.badgeImage} alt={x.badgeName} />
                    </div>
                ))}
            </div>
        </>
    );
}

type MyConquests = {
    conquestId: string;
}

export function UserCardConquests({ conquestId }: MyConquests) {
    const [conquest, setConquest] = useState<Conquest>();
    useEffect(() => {
        axios.get(`${BASE_URL}/conquest/${conquestId}`)
            .then(response => {
                setConquest(response.data);
            });
    }, [conquestId]);

    return (
        <div>
            <ul className="list-unstyled">
                <li className="mb-2"><b>Quests Principais Finalizadas: </b>{conquest?.principalQuest}</li>
                <li className="mb-2"><b>Quests Secundárias Finalizadas: </b>{conquest?.secondaryQuest}</li>
                <li className="mb-2"><b>Capítulos Finalizados: </b>{conquest?.chapterCompleted}</li>
                <li className="mb-2"><b>Total de Badges: </b>{conquest?.totalBadges}</li>
                <li className="mb-2"><b>Total de Xp: </b>{conquest?.totalXp}</li>
            </ul>
        </div>
    );
}

type UserProps = {
    user: User;
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