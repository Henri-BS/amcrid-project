import axios from "axios";
import Pagination from "components/shared/Pagination";
import {CampaignMdCard} from "components/layout/ChapterLayout";
import { UserSmallCard } from "components/layout/UserLayout";
import { useEffect, useState } from "react";
import { CampaignPage } from "types/campaign";
import { PostPage } from "types/post";
import { UserPage } from "types/user";
import { BASE_URL } from "utils/requests";
import "./styles.css";
import { PostCard } from "components/layout/ArticleLayout";

export function ArticleList() {

    const [pageNumber, setPageNumber] = useState(0);
    const [postPage, setPostPage] = useState<PostPage>({
        content: [],
        number: 0
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/post?page=${pageNumber}&size=8&sort=createdDate`)
            .then(response => {
                const data = response.data as PostPage;
                setPostPage(data);
            });

    }, [pageNumber]);

    const handlePageChange = (newPageNumber: number) => {
        setPageNumber(newPageNumber);
    }

    return (
        <>
            <div className="container">
                <div><Pagination 
                 page={postPage}
                 onChange={handlePageChange}/>
                 </div>
                <div className="list-container row">
                    {postPage.content?.map(post => (
                        <div key={post.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                            <PostCard post={post} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}

export function ChapterList() {

    const [pageNumber, setPageNumber] = useState(0);
    const [campaignPage, setCampaignPage] = useState<CampaignPage>({ content: [], number: 0});

    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/list?${pageNumber}&size=10`)
            .then(response => {
                setCampaignPage(response.data);
            });
    }, [pageNumber]);

    const handlePageChange = (newPageNumber: number) => {
        setPageNumber(newPageNumber);
    }

    return (
        <>
            <div className="container">
                <div>
                    <Pagination page={campaignPage} onChange={handlePageChange} />
                </div>
                <div className="list-container row">
                    {campaignPage.content?.map(x => (
                        <div key={x.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                            <CampaignMdCard campaign={x}/>
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}

export function UserList() {

    const [pageNumber, setPageNumber] = useState(0);
    const [page, setPage] = useState<UserPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/user?page=${pageNumber}&size=8&sort=userName`)
            .then(response => {
                setPage(response.data);
            });
    }, [pageNumber]);

    const handlePageChange = (newPageNumber: number) => {
        setPageNumber(newPageNumber);
    }

    return (
        <>
            <div className="container">
              <Pagination page={page} onChange={handlePageChange}/>
                <div className="list-container row">
                    {page.content?.map(user => (
                        <div key={user.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                            <UserSmallCard user={user} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}