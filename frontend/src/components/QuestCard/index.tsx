import { Link } from 'react-router-dom';
import './styles.css'
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
   <p className="mb-3">Etapas:</p>
    <li className="mb-2"><b>1</b> - Quizz Princípios Básicos da Segurança da Informação</li>
    <li className="mb-2"><b>2</b> - Quizz Confiabilidade e Integridade</li>
    <li className="mb-2"><b>3</b> - Quizz Autenticidade e Disponibilidade</li>
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
