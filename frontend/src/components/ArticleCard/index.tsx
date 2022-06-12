import { Link } from "react-router-dom";
import { Post } from "types/post";
import "./styles.css"

type Props = {
    post: Post;
}

function ArticleCard({ post }: Props) {


    return (

        <Link to={`/post/${post.id}`} >
            <div className="article-card-container">
                <h3>{post.title}</h3>                 
                <div className="viewed-container" >{post.views} views</div>
                <hr />               
                <p>"{post.summary}"</p>
            </div>
        </Link>
    );
}

export default ArticleCard;