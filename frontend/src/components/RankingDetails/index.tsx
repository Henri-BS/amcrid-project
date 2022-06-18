import './styles.css'
import TerceiroLugar from 'assets/img/terceiro.svg'
import SegundoLugar from 'assets/img/segundo.svg'
import PrimeiroLugar from 'assets/img/primeiro.svg'
import { useEffect, useState } from 'react';
import { ConquestPage } from 'types/conquest';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';

function RankingDetails() {

    const [page, setPage] = useState<ConquestPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/conquest?page=0&size=3&sort=totalXp,desc`)
            .then(response => {
                setPage(response.data);

            });
    }, []);

    return (
        <>
            <div className="rank-nav-options">

                <div className="options-btn">
                    <img className="options-btn-image" src={PrimeiroLugar} alt="ouro" />
                </div>
                <div className="options-btn">
                    <img className="options-btn-image" src={SegundoLugar} alt="prata" />
                </div>
                <div className="options-btn">
                    <img className="options-btn-image" src={TerceiroLugar} alt="bronze" />
                </div>


            </div>
            <div className="rank-user-container">
                {page.content?.map(item => (
                    <article key={item.id} className="rank-user-card">
                        <div className="rank-user-card-image">
                            <img src={item.user.image} alt={item.user.userName} />
                        </div>
                        <div className="rank-user-card-content">
                            <ul className="list-unstyled">
                                <li>Usuário: {item.user?.userName}</li>
                                <li>Xp Total: {item.totalXp}</li>
                            </ul>
                        </div>
                    </article>
                ))}
            </div>
        </>
    );
}
export default RankingDetails;
