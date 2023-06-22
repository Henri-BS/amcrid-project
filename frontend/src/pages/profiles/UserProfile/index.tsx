import { UserCard,  } from 'components/layout/UserLayout';
import { useNavigate, useParams } from 'react-router-dom';
import './styles.css';
import { PostAddForm } from 'components/form/PostForm';
import { ChapterAddForm } from 'components/form/ChapterForm';
import { UserEditForm } from 'components/form/UserForm';
import { BASE_URL } from 'utils/requests';
import axios from 'axios';

function Profile() {
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
        <div className="menu-options-container row">
          <button data-bs-target="#editUserModal" data-bs-toggle="modal" className="btn cl-form-btn menu-options-item col-3">
            Editar Usuário
          </button>
          <button data-bs-target="#deleteUserModal" data-bs-toggle="modal" className="btn cl-form-btn menu-options-item col-3">
            Deletar Usuário
          </button>
          <button data-bs-target="#addPostModal" data-bs-toggle="modal" className="btn cl-form-btn menu-options-item col-3">
            Adcionar Post
          </button>
          <button data--bstarget="#addChapterModal" data-bs-toggle="modal" className="btn cl-form-btn menu-options-item col-3">
            Adicionar Capítulo
          </button>

        </div>


          <div className="user-box-container ">
            < UserCard id={`${params.userId}`} />
          </div>
          
        </div>
      

      <div className="modal fade" role="dialog" id="addPostModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <PostAddForm id={`${params.userId}`} />
          </div>
        </div>
      </div>

      <div className="modal fade" role="dialog" id="addChapterModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <ChapterAddForm />
          </div>
        </div>
      </div>

      <div className="modal fade" role="dialog" id="editUserModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <UserEditForm id={`${params.userId}`} />
          </div>
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

export default Profile;