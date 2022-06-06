import axios from "axios";
import { useEffect, useState } from "react";
import { ConquestPage } from "types/conquest";
import { BASE_URL } from "utils/requests";

function RankingTable() {

    const [page, setPage] = useState<ConquestPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/user/conquests?page=&size=10&sort=totalXp,desc`)
        .then(response => {
            setPage(response.data);

        });
    }, []);


    return (
        <>
        
            <div className="table-responsive">
                <table className=" container table-sm table-dark ">
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
                                <td className="table-box">username</td>
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
export default RankingTable;
