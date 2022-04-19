import { Link } from 'react-router-dom';

function QuestCard() {

const quest = {
        id: 1,
        image: "https://wallpaperaccess.com/full/2655771.jpg",
        title: "Os Princípios Básicos da Segurança da Informação",
        answers: 20,
};

return (
<div>
    <img className="cl-quest-card-image" src={quest.image} alt={quest.title} />
    <div className="cl-card-bottom-container">  <h3>{quest.title}</h3>
<div className="cl-card-info">
<ul className="list-unstyled">
   <p>Etapas:</p>
    <li>1 - Quizz Princípios Básicos da Segurança da Informação</li>
    <li>2 - Quizz Confiabilidade e Integridade</li>
    <li>3 - Quizz Autenticidade e Disponibilidade</li>
</ul>
</div>
 <Link to="/quest/1">
     <div className="btn btn-primary cl-form-btn">
Acessar 
</div>
     </Link>
 </div>
</div>
);

}
export default QuestCard;
