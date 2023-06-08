import axios, { AxiosRequestConfig } from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { Chapter } from "types/campaign";
import { Props } from "types/quiz";
import { BASE_URL } from "utils/requests";

export function ChapterAddForm() {
    const navigate = useNavigate();

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        const title = (event.target as any).title.value;
        const description = (event.target as any).description.value;
        const image = (event.target as any).image.value;

        const config: AxiosRequestConfig = {
            method: 'POST',
            baseURL: BASE_URL,
            url: `/chapter/add`,
            data: {
                title: title,
                description: description,
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
                    <div className="modal-title" id="itemLabel">Adicionar novo capítulo</div>
                    <button type="submit" data-bs-dismiss="modal" className="btn">Adicionar</button>
                    <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true"><i className="fa fa-times" /></span>
                    </button>
                </div>

                <div className="form-card">
                    <div className="form-group">
                        <label htmlFor="title">Título: </label>
                        <input id="title" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="id">Descrição: </label>
                        <input id="description" />
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

export function ChapterEditForm({ id: chapterId }: Props) {
    const navigate = useNavigate();

    const [chapter, setChapter] = useState<Chapter>();
    useEffect(() => {
        axios.get(`${BASE_URL}/chapter/${chapterId}`)
            .then((response) => {
                setChapter(response.data);
            })
    }, [chapterId]);

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        const title = (event.target as any).title.value;
        const description = (event.target as any).description.value;
        const image = (event.target as any).image.value;

        const config: AxiosRequestConfig = {
            method: 'PUT',
            baseURL: BASE_URL,
            url: `/chapter/edit`,
            data: {
                chapterId: chapterId,
                title: title,
                description: description,
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
                    <div className="modal-title" id="itemLabel">Editar capítulo</div>
                    <button type="submit" data-bs-dismiss="modal" className="btn">Editar</button>
                    <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true"><i className="fa fa-times" /></span>
                    </button>
                </div>

                <div className="form-card">
                    <div className="form-group">
                        <label htmlFor="title">Título: </label>
                        <input id="title" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="id">Descrição: </label>
                        <input id="description" />
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


