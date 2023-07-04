import axios from 'axios';
import moment from 'moment';
import { useEffect, useState } from 'react';
import { Post, PostProps } from 'types/post';
import { BASE_URL } from 'utils/requests';
import '../styles.css';
import { Link } from 'react-router-dom';
import { Props } from 'types/page';


export function PostLayout({ id: postId }: Props) {

    const [post, setPost] = useState<Post>();

    useEffect(() => {
        axios.get(`${BASE_URL}/post/${postId}`)
            .then(response => {
                setPost(response.data);
            });
    }, [postId]);


    return (
        <>
            <div className="row ">
                <div className="col-xl-6 article-header">                    
                <h2 className="mb-3">{post?.title}</h2>

                    <img className="article-image" src={post?.image} alt={post?.title} />
                    <div className="article-summary">
                        <i>"{post?.summary}"</i>
                    </div>
                </div>
                <div className="col-xl-6 article-card-info">
                    <ul className="list-unstyled">
                        <li><b>Data de publicação: </b>{moment(post?.createdDate).format("DD/MM/YYYY - hh:mm")}</li>
                        <li><b>Autor: </b>{post?.createdBy}</li>
                    </ul>
                </div>
            </div>

            <div className="article-content">
                <p>{post?.body}</p>
            </div>
        </>
    )
}

export function PostCard({ post }: PostProps) {
    return (

        <Link  to={`/post/${post.id}`} >
            <img className="card-md-image " src={post.image} alt={post.title} />
            <div className="card-md-container dark-card">
                <h3>{post.title}</h3>
                <abbr title={post.summary}>
                <p className="text-center">Sumário <i className="fas fa-eye" /></p>
                </abbr>
            </div>
        </Link>
    );
}