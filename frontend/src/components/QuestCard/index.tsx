import QuestScore from 'components/QuestScore';
import { Link } from 'react-router-dom';

function QuestCard() {

const quest = {
        id: 1,
        image: "https://s3.wp.wsu.edu/uploads/sites/609/2019/10/ITSrollout-1188x792.jpg",
        title: "Segurança da Informação",
        answers: 20,
        score: 4.5
};

return (
<div>
    <img className="cl-quest-card-image" src={quest.image} alt={quest.title} />
    <div className="cl-card-bottom-container">  <h3>{quest.title}</h3>
 <QuestScore />
 <Link to="cl/game/1">
     <div className="btn btn-primary cl-form-btn">
Acessar 
</div>
     </Link>
 </div>
</div>
);

}
export default QuestCard;
