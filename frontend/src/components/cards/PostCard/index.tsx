import { Link } from "react-router-dom";
import { PostProps } from "types/post";
 import "../styles.css";


export function PostCard({ post }: PostProps) {
    return (

        <Link  to={`/post/${post.id}`} >
            <img className="card-md-image" src={post.image} alt={post.title} />
            <div className="card-md-container dark-card">
            <div className="card-md-title">
                <h3>{post.title}</h3>
                </div>
                <abbr title={post.summary}>
                <p className="text-center">Sumário <i className="fas fa-eye" /></p>
                </abbr>
            </div>
        </Link>
    );
}