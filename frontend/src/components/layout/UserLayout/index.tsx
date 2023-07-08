import axios from 'axios';
import '../styles.css';
import { useEffect, useState } from 'react';
import { FollowPage, UserPostPage } from 'types/user';
import { BASE_URL } from 'utils/requests';
import { Props } from 'types/page';
import { CampaignUserPage, UserBadgePage } from 'types/badge';
import { CampaignPage } from 'types/campaign';
import { CampaignUserMdCard, FollowerSmallCard, FollowingSmallCard, UserPostCard } from 'components/cards/UserCard';
import { PostCard } from 'components/cards/PostCard';
import { PostPage } from 'types/post';
import { CampaignMdCard } from 'components/cards/CampaignCard';
import { useParams } from 'react-router-dom';
import { PostAddForm } from 'components/forms/PostForm';


export function BadgeListByUser({ id: userId }: Props) {
    const [badgeList, setBadgeList] = useState<UserBadgePage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/user-badge/list-by-user/${userId}`)
            .then((response) => {
                setBadgeList(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <div className="row">
                    {badgeList?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-6 col-lg-4 mb-2">
                            <abbr title={x.badge.description}>
                                <div className="sm-card-container dark-card ">
                                    <img src={x.badge.image} alt={x.badge.name} className="sm-card-image" />
                                    <div className="sm-card-title"><h6>{x.badge.name}</h6>
                                        <ul className="sm-card-info ">
                                            <li> Xp: {x.badge.xp}</li>
                                        </ul>
                                    </div>
                                </div>
                            </abbr>
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}

export function ListSavedPostsByUser({ id: userId }: Props) {

    const [postPage, setPostPage] = useState<UserPostPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/user-post/list-by-user/${userId}?size=12`)
            .then((response) => {
                setPostPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className="user-body-container">
                <h3>Publicações Salvas</h3>
                <div className="row">
                    {postPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <UserPostCard userPost={x} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );

}

export function ListPostsCreatedByUser({ id: userId }: Props) {
    const params = useParams();
    const [postList, setPostList] = useState<PostPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/post/list-by-user/${userId}?size=12`)
            .then((response) => {
                setPostList(response.data);
            });
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <h3>Publicações Criadas  <div data-bs-target="#addPostModal" data-bs-toggle="modal" className="menu-options-item btn cl-btn">
                    Adicionar Publicação <i className="fa fa-plus" />
                </div>
                </h3>
                <div className="row">
                    {postList?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <PostCard post={x} />
                        </div>
                    ))}
                </div>
            </div>
            <div className="modal fade" role="dialog" id="addPostModal">
                <div className="modal-dialog" role="document">
                    <div className="modal-content">
                        <PostAddForm id={`${params.userId}`} />
                    </div>
                </div>
            </div>
        </>
    );
}

export function ListSavedCampaignByUser({ id: userId }: Props) {

    const [campaignPage, setCampaignPage] = useState<CampaignUserPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign-user/list-by-user/${userId}`)
            .then((response) => {
                setCampaignPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <h3>Campanhas que Participo</h3>
                <div className="row">
                    {campaignPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <CampaignUserMdCard campaignUser={x} />
                        </div>
                    ))}
                </div>
            </div>

        </>
    );

}

export function ListCreatedCampaignByUser({ id: userId }: Props) {

    const [campaignPage, setCampaignPage] = useState<CampaignPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign/user/${userId}`)
            .then((response) => {
                setCampaignPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <h3>Campanhas Criadas <div data--bstarget="#addCampaignModal" data-bs-toggle="modal" className="menu-options-item btn cl-btn">
                    Adicionar Campanha <i className="fa fa-plus" />
                </div>
                </h3>
                <div className="row">
                    {campaignPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-4">
                            <CampaignMdCard campaign={x} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
}

export function FollowerUserList({ id: userId }: Props) {

    const [followPage, setFollowPage] = useState<FollowPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/follow/list-by-follower/${userId}`)
            .then((response) => {
                setFollowPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <div className="row">
                    {followPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-4 col-lg-3 mb-2">
                            <FollowingSmallCard follow={x} />
                        </div>
                    ))}
                </div>
            </div>

        </>
    );

}

export function FollowingUserList({ id: userId }: Props) {

    const [followPage, setFollowPage] = useState<FollowPage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/follow/list-by-following/${userId}`)
            .then((response) => {
                setFollowPage(response.data);
            })
    }, [userId]);

    return (
        <>
            <div className='user-body-container'>
                <div className="row">
                    {followPage?.content.map(x => (
                        <div key={x.id} className="col-12 col-md-6 col-lg-4">
                            <FollowerSmallCard follow={x} />
                        </div>
                    ))}
                </div>
            </div>
        </>
    );

}