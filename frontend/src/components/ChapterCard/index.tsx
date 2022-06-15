import { Link } from 'react-router-dom';
import { Chapter } from 'types/chapter';
import './styles.css'

type Props = {
    chapter: Chapter;
}

function ChapterCard({chapter}: Props) {

    return (
        <div>
            <img className="cl-quest-card-image" 
            src={chapter.image} 
            alt={chapter.title} />
            <div className="cl-card-bottom-container">  
            <h3>{chapter.title}</h3>

                <div className="cl-card-info">
                    <label htmlFor="touch" >
                        <span>Etapas</span>
                    </label>
                    <nav>
                        <input type="checkbox" id="touch" />
                        <ul className=" list-unstyled slide">
                            <li>  <b>1</b> - Quizz Princípios Básicos da Segurança da Informação</li>
                            <li>  <b>2</b> - Quizz Confiabilidade e Integridade</li>
                            <li>  <b>3</b> - Quizz Autenticidade e Disponibilidade</li>
                        </ul>
                    </nav>  
                    <hr/>
                </div>
          
                <Link to={`/chapter/${chapter.id}`}>
                    <div className="btn btn-primary cl-form-btn">
                        Acessar
                    </div>
                </Link>
            </div>
        </div>
    );

}
export default ChapterCard;
