import { Link } from "react-router-dom";
import "./styles.css"

function ArticleCard() {
    const article = {
        title: 'Princípios Básicos da Segurança da Informação',
        summary: 'Porque é importante criar um esforço para seguir e manter os quatro princípios da Segurança da Informação e como eles influenciam na segurança e na privacidade nos meios digitais e na vida real ?',
        viewed: 13,
    };

    return (

                       <Link to="/post/1" >
            <div className="article-card-container">
                <h3>{article.title}</h3>
                <hr /> 
                <p>"{article.summary}"</p>
                <div className="viewed-container" >{article.viewed} views</div>
            </div>
           </Link> 
    );
}

export default ArticleCard;