import axios from 'axios';
import { useEffect, useState } from 'react';
import { Post } from 'types/post';
import { formatLocalDate } from 'utils/format';
import { BASE_URL } from 'utils/requests';
import './styles.css';



type Props = {
    postId: string;
}

export function ArticlePost({postId}: Props) {

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
                <div className="col-xl-7 article-header">
                    <img className="article-image" 
                    src={post?.image} 
                    alt={post?.title} />
                    <div className="article-summary">
                        <i>{post?.summary}</i>
                    </div>
                </div>
                <div className="col-xl-5 article-card-info">
                    <h2 className="mb-3">{post?.title}</h2>
                    <ul className="list-unstyled">
                        <li><b>Data de publicação: </b>{post?.createdDate}</li>
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

export function ArticleChapter() {
    return (
        <>
            <div className="article-container">
                <div className="article-content">
                    <h2>"Princípios Básicos da Segurança da Informação"</h2>
                    <p>Neste capítulo você será apresentado a missões que iram testar os seus conhecimentos a cerca dos princípios básicos da segurança da informação, para  executar este capítulo com êxito é nescessário compreender as características de cada um dos príncipios.</p>
                </div>
            </div>
        </>
    );
}

