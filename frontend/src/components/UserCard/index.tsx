
import './styles.css'
function UserCard() {

    const user = {
        id: 1,
        image: "https://ih1.redbubble.net/image.1426571880.2339/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg",
        userName: "User05",
        quests: 20,
        posts: 30,
        badge: "https://cdn1.iconfinder.com/data/icons/detective-2/64/police_badge-badge-police-shield-256.png"
    };

    return (
        <div className="cl-max-container">
            <div className="cl-user-cont">
                <div className="row">
                    <div className="cl-user-box-container col-6">
                        <img className="cl-user-card-image" src={user.image} alt={user.userName} />
                        <div className="cl-user-card-container ">
                            <h3>{user.userName}</h3>
                            <div className="cl-user-badge-container">
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>
                                <div className="badge-item"><img className="badge-item" src={user.badge} alt={user.userName} /></div>

                            </div>
                            <hr />
                            <ul className="list-unstyled">
                                <li className="mb-2"><b>Quests finalizadas: </b>{user.quests}</li>
                                <li className="mb-2"><b>Artigos Lidos: </b>{user.posts}</li>
                                <li className="mb-2"><b>Total de Conquistas: </b>23</li>
                                <li className="mb-2"></li>
                            </ul>
                        </div>
                    </div>

                    <div className="cl-user-box-container col-6">
                        <h2>Informações</h2>
                        <hr />
                        <ul className="list-unstyled">
                            <li className="mb-2"><b>Data Nascimento:</b> 11/02/2999</li>
                            <li className="mb-2"><b>Ocupação:</b> Engenheiro e Uber</li>
                            <li className="mb-2"><b>Localidade:</b> São Paulo</li>
                            <li className="mb-2"><b>Data Nascimento:</b>11/02/2999</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    );

}
export default UserCard;
