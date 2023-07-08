import { Link } from 'react-router-dom';
import { CampaignBadgeProps, CampaignPostPage, CampaignPostProps, CampaignUserProps } from 'types/campaign';
import { useEffect, useState } from 'react';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { Props } from 'types/page';
import { CampaignBadgePage, CampaignUserPage } from 'types/badge';


export function ListBadgesByCampaign({ id: campaignId }: Props) {
    const [badgePage, setBadgePage] = useState<CampaignBadgePage>({ content: [], number: 0 });
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign-badge/list/${campaignId}`)
            .then((response) => {
                setBadgePage(response.data);
            })
    }, [campaignId]);

    return (
        <>
            <div className="title-container">Conquistas</div>
            <div className="nav-list-container">
                {badgePage.content?.map(x => (
                    <div key={x.campaignId} className="nav-list-item">
                        <BadgeCard badge={x} />
                    </div>
                ))}
            </div>
        </>
    );

    function BadgeCard({ badge }: CampaignBadgeProps) {
        return (
            <>
                <div className="sm-card-container dark-card">
                    <img src={badge.badge.image} alt={badge.badge.name} className="sm-card-image" />
                    <div className="sm-card-title"><h6>{badge.badge.name}</h6>
                        <ul className="sm-card-info ">
                            <li> Xp: {badge.badge.xp}</li>
                        </ul>
                    </div>
                </div>
            </>
        );
    }
}

export function ListUsersByCampaign({ id: campaignId }: Props) {
    const [userPage, setUserPage] = useState<CampaignUserPage>({ content: [], number: 0 })
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign-user/list-by-campaign/${campaignId}`)
            .then((response) => {
                setUserPage(response.data);
            });
    }, [campaignId]);

    return (
        <>
            <div className="title-container">Membros</div>
            <div className="nav-list-container">
                {userPage.content?.map(x => (
                    <div key={x.id} className="nav-list-item">
                        <CampaignUserSmCard campaignUser={x} />
                    </div>
                ))}
            </div>
        </>
    );

    function CampaignUserSmCard({ campaignUser }: CampaignUserProps) {
        return (
            <Link to={`/profile/${campaignUser.user?.id}`}>
                <div className="sm-card-container dark-card">
                    <img className="sm-card-image" src={campaignUser.user?.image} alt={campaignUser.user?.userName} />
                    <div className="sm-card-title">
                        <h6>{campaignUser.user?.userName}</h6>
                        <ul className="sm-card-info" >
                            <li>Total XP: {campaignUser.user?.conquest?.totalXp}</li>
                        </ul>
                    </div>
                </div>
            </Link>
        );
    }

}

export function ListPostersByCampaign({ id: campaignId }: Props) {
    const [postPage, setPostPage] = useState<CampaignPostPage>({ content: [], number: 0 })
    useEffect(() => {
        axios.get(`${BASE_URL}/campaign-post/list/${campaignId}`)
            .then((response) => {
                setPostPage(response.data);
            });
    }, [campaignId]);

    return (
        <>
            <div className="title-container">Biblioteca</div>
            <div className="nav-list-container">
                {postPage.content?.map(x => (
                    <div key={x.campaignId} className="nav-list-item">
                        <CampaignPostCard campaignPost={x} />
                    </div>
                ))}
            </div>
        </>
    );

    function CampaignPostCard({ campaignPost }: CampaignPostProps) {
        return (

            <Link to={`/post/${campaignPost.post.id}`} >
                <img className="card-md-image " src={campaignPost.post.image} alt={campaignPost.post.title} />
                <div className="card-md-container dark-card">
                    <div className="card-md-title">
                        <h3>{campaignPost.post.title}</h3>
                    </div>
                    <abbr title={campaignPost.post.summary}>
                        <p className="text-center">Sumário <i className="fas fa-eye" /></p>
                    </abbr>
                </div>
            </Link>
        );
    }

}



