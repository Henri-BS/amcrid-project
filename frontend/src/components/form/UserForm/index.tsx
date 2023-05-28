import axios, { AxiosRequestConfig } from "axios";
import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom"
import { Props } from "types/quiz";
import { User } from "types/user";
import { BASE_URL } from "utils/requests";

export function UserAddForm() {
    const navigate = useNavigate();

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        const userName = (event.target as any).userName.value;
        const email = (event.target as any).email.value;
        const password = (event.target as any).password.value;
        const image = (event.target as any).image.value;

        const config: AxiosRequestConfig = {
            method: 'POST',
            baseURL: BASE_URL,
            url: `/user/add`,
            data: {
                userName: userName,
                email: email,
                password: password,
                image: image
            }
        }
        axios(config).then((response) => {
            navigate(`/`);
        })
    }
    return (
        <>
            <form onSubmit={handleSubmit} className="form-container">
                <div className="modal-header">
                    <div className="modal-title" id="itemLabel">Cadastrar usuário</div>
                    <button type="submit" data-bs-dismiss="modal" className="btn">Adicionar</button>
                    <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true"><i className="fa fa-times" /></span>
                    </button>
                </div>
                <div className="form-card">
                    <div className="form-group">
                        <label htmlFor="userName">Nome de usuário: </label>
                        <input id="userName" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="id">Email: </label>
                        <input id="email" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="password">Senha: </label>
                        <input id="password" type="password" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="image">Imagem: </label>
                        <input id="image" />
                    </div>
                </div>
            </form>
        </>
    );
}


export function UserEditForm({ id: userId }: Props) {
    const navigate = useNavigate();    
    
    const [user, setUser] = useState<User>();
    useEffect(() => {
     axios.get(`${BASE_URL}/user/${userId}`)
        .then((response) => {
            setUser(response.data);
        })
    }, [userId]);

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        const userName = (event.target as any).userName.value;
        const image = (event.target as any).image.value;

        const config: AxiosRequestConfig = {
            method: 'PUT',
            baseURL: BASE_URL,
            url: `/user/edit`,
            data: {
                id: userId,
                userName: userName,
                image: image
            }
        }
        axios(config).then((response) => {
            navigate(`/`);
        })
    }
    return (
        <>
            <form onSubmit={handleSubmit} className="form-container">
                <div className="modal-header">
                    <div className="modal-title" id="itemLabel">Editar usuário</div>
                    <button type="submit" data-bs-dismiss="modal" className="btn">Editar</button>
                    <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true"><i className="fa fa-times" /></span>
                    </button>
                </div>
                <div className="form-card">
                    <div className="form-group">
                        <label htmlFor="userName">Nome de usuário: </label>
                        <input id="userName" defaultValue={user?.userName}/>
                    </div>
                    <div className="form-group">
                        <label htmlFor="image">Imagem: </label>
                        <input id="image"  defaultValue={user?.image}/>
                    </div>
                </div>
            </form>
        </>
    );
}