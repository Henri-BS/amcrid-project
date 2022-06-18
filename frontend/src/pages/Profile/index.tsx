import UserCard, { UserCardConquests } from 'components/UserCard';
import React from 'react';
import { useParams } from 'react-router-dom';
import './styles.css';



function Profile() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <div className="max-container">
          <div className="user-box-container ">
            < UserCard userId={`${params.userId}`} />
            < UserCardConquests userId={`${params.userId}`}/>
          </div>
        </div>
      </div>
    </>
  );

}

export default Profile;