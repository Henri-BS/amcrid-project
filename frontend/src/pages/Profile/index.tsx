import UserCard, { UserCardConquests } from 'components/layout/UserLayout';
import React from 'react';
import { useParams } from 'react-router-dom';
import './styles.css';
import { PostAddForm } from 'components/form/PostForm';



function Profile() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="menu-options-container">
          <button data-bs-target="#addPostModal" data-bs-toggle="modal" className="btn cl-form-btn">
            Adcionar Post
          </button>
        </div>
        <div className="max-container">
          <div className="user-box-container ">
            < UserCard id={`${params.userId}`} />
            < UserCardConquests conquestId={`${params.userId}`}/>
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
    </>
  );

}

export default Profile;