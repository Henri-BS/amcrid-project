import RankingDetails from 'components/RankingDetails';
import RankingTable from 'components/RankingTable';
import React from 'react';

export default function Ranking() {
  return (
    <>
<div className="container">
    <RankingDetails />
<RankingTable />
</div>
    </>
  );
}