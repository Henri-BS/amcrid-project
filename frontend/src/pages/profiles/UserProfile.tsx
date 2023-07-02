import { BadgeListByUser, FollowerUserList, FollowingUserList, ListSavedPostsByUser, UserCard, UserCardConquests, ListCreatedCampaignByUser, ListSavedCampaignByUser, } from 'components/layout/UserLayout';
import { useNavigate, useParams } from 'react-router-dom';
import './styles.css';
import { BASE_URL } from 'utils/requests';
import axios from 'axios';
import { Link } from 'react-router-dom';
import { ListPostsCreatedByUser } from 'components/layout/ArticleLayout';

export function UserProfile() {
  const params = useParams();
  const navigate = useNavigate();


  const deleteUser = () => {
    axios.get(`${BASE_URL}/user/delete/${params.userId}`)
      .then((response) => {
        navigate(`/`);
      });
  }

  return (
    <>
      < UserCard id={`${params.userId}`} />

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
      <div className="modal fade" role="dialog" id="deletePostModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <div className="modal-header">
              <div className="modal-title" id="itemLabel">Deseja deletar sua conta ?</div>
              <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                <span aria-hidden="true"><i className="fa fa-times" /></span>
              </button>
            </div>
            <div className="modal-footer">
              <button onClick={() => deleteUser()} data-bs-dismiss="modal" className="btn">
                Deletar
              </button>
            </div>
          </div>
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
          <ListPostsCreatedByUser id={`${params.userId}`}/>
          <ListSavedPostsByUser id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}