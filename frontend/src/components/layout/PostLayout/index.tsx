import axios from 'axios';
import moment from 'moment';
import { useEffect, useState } from 'react';
import { Post, PostProps } from 'types/post';
import { BASE_URL } from 'utils/requests';
import { Link } from 'react-router-dom';
import { Props } from 'types/page';
import '../styles.css';

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
            <div className="row dashboard-container m-0">
                <div className="col-12 col-lg-5 box-lf-container">
                    <h2 className="mb-3">{post?.title}</h2>
                    <img className="dashboard-image p-0" src={post?.image} alt={post?.title} />
                </div>
                <div className="col-12 col-lg-7 ">
                        <i>"{post?.summary}"</i>
                    <hr></hr>
                    <ul className="list-unstyled">
                        <li><b>Data de publicação: </b>{moment(post?.createdDate).format("DD/MM/YYYY - hh:mm")}</li>
                        <li><b>Autor: </b>{post?.createdBy}</li>
                    </ul>
                </div>
            </div>

            <div className="user-body-container">
                <p>{post?.body}</p>
            </div>
        </>
    )
}

