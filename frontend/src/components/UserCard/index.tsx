
import axios from 'axios';
import { useEffect, useState } from 'react';
import { User } from 'types/user';
import { BASE_URL } from 'utils/requests';
import './styles.css'

type Props = {
    userId: string;
}

const  usertest ={
    id: 1,
    image: "https://ih1.redbubble.net/image.1426571880.2339/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg",
    userName: "XIII",
    quests: 20,
    posts: 30,
    badge: "https://cdn1.iconfinder.com/data/icons/detective-2/64/police_badge-badge-police-shield-256.png"
};

function UserCard({userId}: Props) {
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
                <img className="cl-user-card-image" src={user?.image} alt={user?.userName} />
                <div className="cl-user-card-container ">
                    <h3>{user?.userName}</h3>
                    <div className="cl-user-badge-container">
                        <div className="badge-item"><img className="badge-item" src={usertest.badge} alt={user?.userName} /></div>
                        <div className="badge-item"><img className="badge-item" src={usertest.badge} alt={user?.userName} /></div>
                        <div className="badge-item"><img className="badge-item" src={usertest.badge} alt={user?.userName} /></div>
                        <div className="badge-item"><img className="badge-item" src={usertest.badge} alt={user?.userName} /></div>
                        <div className="badge-item"><img className="badge-item" src={usertest.badge} alt={user?.userName} /></div>
                        <div className="badge-item"><img className="badge-item" src={usertest.badge} alt={user?.userName} /></div>
                       
                    </div>
                    <hr />
                    <ul className="list-unstyled">
                        <li className="mb-2"><b>Quests Principais Finalizadas: </b>4344</li>
                        <li className="mb-2"><b>Quests Secundárias Finalizadas: </b>44123</li>
                        <li className="mb-2"><b>Capítulos Finalizados: </b>5</li>
                        <li className="mb-2"><b>Total de Badges: </b>23</li>
                        <li className="mb-2"><b>Total de Xp: </b>258</li>

                    </ul>
                </div>
            </div>
        </div>
    );
}
export default UserCard;



export function MiniUserCard() {
    return (
        <div className="user-minicard-container">
            <img className="user-minicard-image" src={usertest.image} alt={usertest.userName} />

            <div className="user-minicard-text">
                <h6>{usertest.userName}</h6>
                <ul className="user-minicard-info">
                    <li>Xp: 38120</li>
                    <li>Badges: 38</li>
                </ul>
            </div>
        </div>
    );
}