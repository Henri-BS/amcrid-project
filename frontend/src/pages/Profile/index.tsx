import UserCard from 'components/UserCard';
import React from 'react';
import { useParams } from 'react-router-dom';
import './styles.css';



 function Profile() {
  const params = useParams();

  return (
    <>
      <div className="container">
        < UserCard userId={`${params.userId}`} />
      </div>
    </>
  );

}

export default Profile;