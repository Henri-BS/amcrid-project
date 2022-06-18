
import axios from 'axios';
import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { Conquest } from 'types/conquest';
import { User } from 'types/user';
import { BASE_URL } from 'utils/requests';
import './styles.css'

type Props = {
    userId: string;
}

function UserCard({ userId }: Props) {

    const [user, setUser] = useState<User>();
    useEffect(() => {
        axios.get(`${BASE_URL}/user/${userId}`)
            .then(response => {
                setUser(response.data);
            });
    }, [userId]);

    return (
           <div>
                <img className="user-card-image"
                    src={user?.image}
                    alt={user?.userName} />
                <div className="user-card-container ">
                    <h3>{user?.userName}</h3>

                    <div className="user-badge-container">
                        <div className="badge-item">
                            <img className="badge-item" src="https://cdn1.iconfinder.com/data/icons/detective-2/64/police_badge-badge-police-shield-256.png" alt={user?.userName} />
                        </div>
                    </div>

                    <hr />
                    
                </div>
            </div>
    );
}
export default UserCard;

type MyConquests = {
    conquestId: string;
}

export function UserCardConquests({conquestId}: MyConquests) {
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

type Cons = {
    user: User
}

export function MiniUserCard({ user }: Cons) {

    return (
        <Link to={`/profile/${user?.id}`}>
            <div className="user-minicard-container">
                <img className="user-minicard-image" src={user?.image} alt={user?.userName} />
                <div className="user-minicard-username">
                    <h6>{user?.userName}</h6>
                    <ul className="user-minicard-info" >
                        <li>E-mail: {user?.email}</li>
                    </ul>
                </div>
            </div>
        </Link>
    );
}