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
                    <label htmlFor="touch" >
                        <span>Etapas</span>
                    </label><nav>

                        <input type="checkbox" id="touch" />
                        <ul className=" list-unstyled slide">
                            <li>  <b>1</b> - Quizz Princípios Básicos da Segurança da Informação</li>
                            <li>  <b>2</b> - Quizz Confiabilidade e Integridade</li>
                            <li>  <b>3</b> - Quizz Autenticidade e Disponibilidade</li>
                        </ul>
                    </nav>
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
