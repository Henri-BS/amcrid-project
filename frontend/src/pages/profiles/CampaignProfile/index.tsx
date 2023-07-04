import { useParams } from 'react-router-dom';
import {  ListChaptersByCampaing } from 'components/layout/ChapterLayout';
import { ListBadgesByCampaign, ListPostersByCampaign, ListUsersByCampaign } from 'components/layout/CampaignLayout';
import axios from 'axios';
import { CampaignMdCard } from 'components/cards/CampaignCard';
import Pagination from 'components/shared/Pagination';
import { useState, useEffect } from 'react';
import { CampaignPage } from 'types/campaign';
import { BASE_URL } from 'utils/requests';

export function CampaignProfile() {
  const params = useParams();

  return (
    <>
      <div className="container">
        <ListChaptersByCampaing id={`${params.campaignId}`} />        
        <ListUsersByCampaign id={`${params.campaignId}`} />
        <ListPostersByCampaign id={`${params.campaignId}`} />
        <ListBadgesByCampaign id={`${params.campaignId}`} />
      </div>
    </>
  );
}

export function CampaignList() {

  const [pageNumber, setPageNumber] = useState(0);
  const [campaignPage, setCampaignPage] = useState<CampaignPage>({ content: [], number: 0});

  useEffect(() => {
      axios.get(`${BASE_URL}/campaign/list?${pageNumber}&size=10`)
          .then(response => {
              setCampaignPage(response.data);
          });
  }, [pageNumber]);

  const handlePageChange = (newPageNumber: number) => {
      setPageNumber(newPageNumber);
  }

  return (
      <>
          <div className="container">
              <div>
                  <Pagination page={campaignPage} onChange={handlePageChange} />
              </div>
              <div className="list-container row">
                  {campaignPage.content?.map(x => (
                      <div key={x.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                          <CampaignMdCard campaign={x}/>
                      </div>
                  ))}
              </div>
          </div>
      </>
  );
}