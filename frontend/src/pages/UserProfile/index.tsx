import UserCard, { UserCardConquests } from 'components/layout/UserLayout';
import React from 'react';
import { useParams } from 'react-router-dom';
import './styles.css';
import { PostAddForm } from 'components/form/PostForm';
import { ChapterAddForm } from 'components/form/ChapterForm';
import { UserEditForm } from 'components/form/UserForm';



function Profile() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="menu-options-container row">
        <button data-bs-target="#editUserModal" data-bs-toggle="modal" className="btn cl-form-btn menu-options-item col-4">
            Editar Usuário
          </button>
          <button data-bs-target="#addPostModal" data-bs-toggle="modal" className="btn cl-form-btn menu-options-item col-4">
            Adcionar Post
          </button>
          <button data-bs-target="#addChapterModal" data-bs-toggle="modal" className="btn cl-form-btn menu-options-item col-4">
            Adicionar Capítulo
          </button>
        </div>
        <div className="max-container">
          <div className="user-box-container ">
            < UserCard id={`${params.userId}`} />
            < UserCardConquests conquestId={`${params.userId}`} />
          </div>
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
    </>
  );

}

export default Profile;