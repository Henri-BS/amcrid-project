import {RankingDetails, RankingTable} from 'components/layout/RankingLayout';
import React from 'react';
import './styles.css'

export function Ranking() {
  
  return (
    <>
      <div className="container">
        <div className="rank-details-container">
        <RankingDetails  />
        </div>

        <div className="datatable-container">
          <RankingTable />
        </div>
      </div>
    </>
  );
}