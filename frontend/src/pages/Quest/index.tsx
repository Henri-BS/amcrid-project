import Article from 'components/Article';
import Form from 'components/Form/index ';
import React from 'react';
import './styles.css';


export default function Quest() {
  return (
    <>
    <div className="quest-container">
      <div className="row">
        <div className="col-sm-6 col-md-4 col-lg-3">
          <Form />
        </div>
        <div className="col-sm-6 col-md-8 col-lg-9">
          <Article />
        </div>
      </div>
      </div>
    </>
  );
}