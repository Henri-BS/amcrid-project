import axios, { AxiosRequestConfig } from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { Props } from "types/quiz";
import { User } from "types/user";
import { BASE_URL } from "utils/requests";

export function PostAddForm({id: userId}: Props){
const navigate = useNavigate();

const[user, setUser] = useState<User>();
useEffect(() => {
    axios.get(`${BASE_URL}/user/${userId}`)
    .then((response) => {
setUser(response.data);
    });
}, [userId]);

const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    const title = (event.target as any).title.value;
    const summary = (event.target as any).summary.value;
    const body = (event.target as any).body.value;
    const image = (event.target as any).image.value;

    const config: AxiosRequestConfig = {
        method: 'POST',
        baseURL: BASE_URL,
        url: `/post/add`,
        data: {
title: title,
summary: summary,
 body: body,
 image: image
        }
    }
    axios(config).then((response) => {
navigate(`/user/${userId}`);
    })
}

return(
    <>
    <form onSubmit={handleSubmit} className="form-container">
    
            <div className="modal-header">
              <div className="modal-title" id="itemLabel">Adicionar novo post</div>
              <button type="submit" className="btn">Adicionar</button>
              <button className="close" data-bs-dismiss="modal" aria-label="Close">
                <span aria-hidden="true"><i className="fa fa-times" /></span>
              </button>
            </div>
    
<div className="form-card">
    <div className="form-group">
        <label htmlFor="title">Título: </label>
        <input id="title" />
    </div>
    <div className="form-group">
        <label htmlFor="id">Resumo: </label>
        <input id="summary" />
    </div>
    <div className="form-group">
        <label htmlFor="image">Imagem: </label>
        <input id="image" />
    </div>
    <div className="form-group body-conatiner">
        <input id="body" />
    </div>
</div>
    </form>
    </>
);
}
