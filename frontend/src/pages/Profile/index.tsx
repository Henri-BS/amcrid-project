import UserCard from 'components/UserCard';
import React from 'react';
import './styles.css';



export default function Profile() {
  return (
    <>
<div className="container">
< UserCard user={{
          id: 0,
          email: '',
          userName: '',
          password: '',
          image: ''
        }} />
  </div>
    </>
  );
}