
import axios from 'axios';
import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
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
        <div className="cl-max-container">
            <div className="cl-user-box-container ">
                <img className="cl-user-card-image"
                    src={user?.image}
                    alt={user?.userName} />
                <div className="cl-user-card-container ">
                    <h3>{user?.userName}</h3>

                    <div className="cl-user-badge-container">
                        <div className="badge-item">
                            <img className="badge-item" src="https://cdn1.iconfinder.com/data/icons/detective-2/64/police_badge-badge-police-shield-256.png" alt={user?.userName} />
                        </div>
                    </div>

                    <hr />
                    
                    <ul className="list-unstyled">
                        <li className="mb-2"><b>Quests Principais Finalizadas: </b>4152</li>
                        <li className="mb-2"><b>Quests Secundárias Finalizadas: </b>44123</li>
                        <li className="mb-2"><b>Capítulos Finalizados: </b>5</li>
                        <li className="mb-2"><b>Total de Badges: </b>23</li>
                        <li className="mb-2"><b>Total de Xp: </b>6231</li>
                    </ul>
                </div>
            </div>
        </div>
    );
}
export default UserCard;

export function UserCardStatistics() {

    return (
        <div>UserCardStatistics</div>

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