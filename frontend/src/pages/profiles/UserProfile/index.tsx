import '../styles.css';
import { BadgeListByUser, FollowerUserList, FollowingUserList, ListSavedPostsByUser, ListCreatedCampaignByUser, ListSavedCampaignByUser, ListPostsCreatedByUser } from 'components/layout/UserLayout';
import { useNavigate, useParams } from 'react-router-dom';
import { BASE_URL } from 'utils/requests';
import axios from 'axios';
import { Link } from 'react-router-dom';
import { UserLgCard, UserCardConquests, UserSmallCard } from 'components/cards/UserCard';
import Pagination from 'components/shared/Pagination';
import { useState, useEffect } from 'react';
import { UserPage } from 'types/user';

export function UserProfile() {
  const params = useParams();
  

  return (
    <>
      < UserLgCard id={`${params.userId}`} />

      <div className="user-card-container mx-0 mt-2 p-2 row">
        

        <Link to={`/profile/campaigns/${params.userId}`} className="btn cl-btn menu-options-item col-6">
          Campanhas
        </Link>
        <Link to={`/profile/posters/${params.userId}`} className="btn cl-btn menu-options-item col-6">
          Biblioteca
        </Link>
        <Link to={`/profile/conquests/${params.userId}`} className="btn cl-btn menu-options-item col-6" >
          Conquistas
        </Link>
        <Link to={`/profile/stats/${params.userId}`} className="btn cl-btn menu-options-item col-6">
          Estatísticas
        </Link>
        <Link to={`/profile/following/${params.userId}`} className="btn cl-btn menu-options-item col-6">
          Seguindo
        </Link>
        <Link to={`/profile/followers/${params.userId}`} className="btn cl-btn menu-options-item col-6">
          Seguidores
        </Link>
      
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
        <Pagination page={page} onChange={handlePageChange} />
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

export function CampaignsByUser() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="user-box-container ">
          <UserProfile />
          <ListCreatedCampaignByUser id={`${params.userId}`} />
          <ListSavedCampaignByUser id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}

export function ConquestsByUser() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="user-box-container ">
          <UserProfile />
          <UserCardConquests id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}

export function BadgeByUser() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="user-box-container ">
          <UserProfile />
          <BadgeListByUser id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}

export function Followers() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="user-box-container ">
          <UserProfile />
          <FollowerUserList id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}

export function Following() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="user-box-container ">
          <UserProfile />
          <FollowingUserList id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}

export function PostersByUser() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="user-box-container ">
          <UserProfile />
         
          <ListPostsCreatedByUser id={`${params.userId}`} />
          <ListSavedPostsByUser id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}