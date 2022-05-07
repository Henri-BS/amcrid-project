import RankingDetails from 'components/RankingDetails';
import RankingTable from 'components/RankingTable';
import React from 'react';
import './styles.css'

export default function Ranking() {
  return (
    <>
      <div className="container">
        <RankingDetails />
        <div className="datatable-container">
          <RankingTable />
        </div>
      </div>
    </>
  );
}