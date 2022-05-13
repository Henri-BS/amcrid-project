import { Link } from 'react-router-dom';
import './styles.css'
import Bronze from 'assets/img/bronze.svg'
import Prata from 'assets/img/prata.svg'
import Ouro from 'assets/img/ouro.svg'

function RankingDetails() {

    const top = {
        id: 1,
        user1: "https://ih1.redbubble.net/image.1426571880.2339/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg",
        user2: "https://i.pinimg.com/originals/01/65/e8/0165e8cbbae722d2326abd74efd9df46.jpg",
        user3: "https://i.pinimg.com/originals/fc/f2/9b/fcf29b175770dba5aa539c82fd3b064e.jpg",

    };

    return (
        <>
            <div className="rank-nav-options">
                <Link to="/ranking" className="options-btn">
                    XP
                </Link>
                <Link to="/ranking" className="options-btn">
                    Principais
                </Link>
                <Link to="/ranking" className="options-btn">
                    Secundárias
                </Link>

                <Link to="/ranking" className="options-btn">
                    Capítulos
                </Link>

                <Link to="/ranking" className="options-btn">
                    Badges
                </Link>


            </div>
            <div className="rank-user-container">
                <article className="rank-user-card">
                    <div className="rank-user-card-image">
                        <img src={top.user2} alt="user2" />
                    </div>
                    <img className="rank-user-card-icon" src={Prata} alt='prata' />      
                    <div className="rank-user-card-content">
                        <ul className="list-unstyled">
                            <li>Usuário: Anny</li>
                            <li>Xp Total: 6345</li>
                        </ul>
                    </div>
                </article>

                <article className="rank-user-card">
                    <div className="rank-user-card-image">
                        <img src={top.user1} alt="user1" />
                    </div>
                    <img className="rank-user-card-icon" src={Ouro} alt='ouro' />      
                    <div className="rank-user-card-content">

                        <ul className="list-unstyled">
                            <li>Usuário: VIII</li>
                            <li>Xp Total: 6790</li>
                        </ul>
                    </div>
                </article>

                <article className="rank-user-card">
                    <div className="rank-user-card-image">
                        <img src={top.user3} alt="user3" />
                    </div>
                    <img className="rank-user-card-icon" src={Bronze} alt='bronze' />      
                    <div className="rank-user-card-content">
                        <ul className="list-unstyled">
                            <li>Usuário: Jack</li>
                            <li>Xp Total: 5950</li>
                        </ul>
                    </div>
                </article>
            </div>
        </>
    );
}
export default RankingDetails;
