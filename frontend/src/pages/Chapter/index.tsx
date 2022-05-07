import Form from 'components/Form/index ';
import React from 'react';
import './styles.css';


export default function Quest() {
  return (
    <>
    <div className="quest-container">
      <div className="row">
        <div className="col-sm-6 col-md-4 col-lg-4">
          <Form />
        </div>
        <div className="col-sm-6 col-md-4 col-lg-4">
          <Form />
        </div>
        <div className="col-sm-6 col-md-4 col-lg-4">
          <Form />
        </div>
      </div> 
      </div>
    </>
  );
}