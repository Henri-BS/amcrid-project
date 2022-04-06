import { Link } from "react-router-dom";
import "./styles.css"
function ArticleNav() {
    const article = {
        title: "Controle Parental",
        abstract: "Entenda a importância e os benefícios do controle parental nos meios digitais",
        viewed: 13,
    };

    return (

                       <Link to="/post/1" >
            <div className="article-card-container">
                <h3>{article.title}</h3>
                <hr /> 
                <p>"{article.abstract}"</p>
                <div className="viewed-container" >{article.viewed} views</div>
            </div>
           </Link> 
    );
}

export default ArticleNav;