import { CampaignListByUser, PostListByUser, UserCard, UserCardConquests, } from 'components/layout/UserLayout';
import { useNavigate, useParams } from 'react-router-dom';
import './styles.css';
import { BASE_URL } from 'utils/requests';
import axios from 'axios';

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
      <div className="container">
        <div className="user-box-container ">
          < UserCard id={`${params.userId}`} />

        </div>
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

function UserSelector() {
  return (
    <div className="user-card-container mx-0 mt-2 p-2 row">
      <button className="btn cl-btn menu-options-item col-6">
        Campanhas
      </button>
      <button className="btn cl-btn menu-options-item col-6">Biblioteca</button>
      <button className="btn cl-btn menu-options-item col-6" >
        Conquistas
      </button>

      <button className="btn cl-btn menu-options-item col-6">
        Estatísticas
      </button>
      <button className="btn cl-btn menu-options-item col-6">
        Seguindo
      </button>
      <button className="btn cl-btn menu-options-item col-6">
        Seguidores
      </button>
    </div>
  );
}

export function CampaignsByUser() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="user-box-container ">
          <UserCard id={`${params.userId}`} />
          <UserSelector />
          <CampaignListByUser id={`${params.userId}`} />
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
          <UserCard id={`${params.userId}`} />
          <UserSelector />
          <UserCardConquests id={`${params.userId}`} />
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
          <UserCard id={`${params.userId}`} />
          <UserSelector />
          <PostListByUser id={`${params.userId}`} />
        </div>
      </div>
    </>
  );
}