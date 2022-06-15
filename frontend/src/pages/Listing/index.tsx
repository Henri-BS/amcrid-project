import axios from "axios";
import ArticleCard from "components/ArticleCard";
import Pagination from "components/Pagination";
import ChapterCard from "components/ChapterCard";
import { MiniUserCard } from "components/UserCard";
import { useEffect, useState } from "react";
import { ChapterPage } from "types/chapter";
import { PostPage } from "types/post";
import { UserPage } from "types/user";
import { BASE_URL } from "utils/requests";
import "./styles.css"

export function ArticleList() {

    const [postPage, setPostPage] = useState<PostPage>({
        content: [],
        first: true,
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 10,
        number: 0,
        numberOfElements: 0,
        empty: true
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/post?page=0&sort=createdDate`)
            .then(response => {
                const data = response.data as PostPage;
                setPostPage(data);
            });

    }, []);

    return (
        <>
            <div className="container">
                <div><Pagination /></div>
                <div className="list-container row">
                    {postPage.content?.map(post => (
                        <div key={post.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                            <ArticleCard post={post} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}

export function ChapterList() {

    const [chapterPage, setChapterPage] = useState<ChapterPage>({
        content: [],
        first: true,
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 10,
        number: 0,
        numberOfElements: 0,
        empty: true

    });

    useEffect(() => {
        axios.get(`${BASE_URL}/chapter?page=0&size=10`)
            .then(response => {
                const data = response.data as ChapterPage;
                setChapterPage(data);
            });
    }, []);



    return (
        <>
            <div className="container">
                <div><Pagination /></div>
                <div className="list-container row">
                    {chapterPage.content?.map(chapter => (
                        <div key={chapter.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                            <ChapterCard chapter={chapter}/>
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}

export function UserList() {

    const [page, setPage] = useState<UserPage>({
        content: [],
        first: true,
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 10,
        number: 0,
        numberOfElements: 0,
        empty: true
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/user?page=0&size=10&sort=userName`)
            .then(response => {
                const data = response.data as UserPage;
                setPage(data);
            });
    }, []);


    return (
        <>
            <div className="container">
                <div><Pagination /></div>
                <div className="list-container row">
                    {page.content?.map(user => (
                        <div key={user.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                            <MiniUserCard user={user} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}