import UserCard, { UserCardConquests } from 'components/layout/UserLayout';
import React from 'react';
import { useParams } from 'react-router-dom';
import './styles.css';
import { PostAddForm } from 'components/form/PostForm';
import { ChapterAddForm } from 'components/form/ChapterForm';



function Profile() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="menu-options-container">
          <button data-bs-target="#addPostModal" data-bs-toggle="modal" className="btn cl-form-btn">
            Adcionar Post
          </button>
          <button data-bs-target="#addChapterModal" data-bs-toggle="modal" className="btn cl-form-btn">
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
    </>
  );

}

export default Profile;