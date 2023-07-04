import '../styles.css';
import TerceiroLugar from 'assets/img/terceiro.svg'
import SegundoLugar from 'assets/img/segundo.svg'
import PrimeiroLugar from 'assets/img/primeiro.svg'
import { useEffect, useState } from 'react';
import { ConquestPage } from 'types/conquest';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';

export function RankingDetails() {

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
                            <img src={item.userImage} alt={item.userName} />
                        </div>
                        <div className="rank-user-card-content">
                            <ul className="list-unstyled">
                                <li>Usuário: {item.userName}</li>
                                <li>Xp Total: {item.totalXp}</li>
                            </ul>
                        </div>
                    </article>
                ))}
            </div>
        </>
    );
}
export function RankingTable() {

    const [page, setPage] = useState<ConquestPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/conquest?page=&size=10&sort=totalXp,desc`)
        .then(response => {
            setPage(response.data);

        });
    }, []);


    return (
        <>
            <div className="table-responsive">
                <table className="container table-sm table-dark ">
                    <thead >
                        <tr className="striped-rows">
                            <th className="table-box">Usuário</th>
                            <th className="table-box">Xp Total</th>
                            <th className="table-box">Quests Principais</th>
                            <th className="table-box">Quests Secundárias</th>
                            <th className="table-box">Capítulos Concluídos</th>
                            <th className="table-box">Badges Ganhos</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                              <tr key={item.id}>
                                <td className="table-box">{item.userName}</td>
                                <td className="table-box">{item.totalXp}</td>
                                <td className="table-box">{item.principalQuest}</td>
                                <td className="table-box">{item.secondaryQuest}</td>
                                <td className="table-box">{item.chapterCompleted}</td>
                                <td className="table-box">{item.totalBadges}</td>
                            </tr> 
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    );
}

