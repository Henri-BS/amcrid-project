import { useParams } from 'react-router-dom';
import {  ListChaptersByCampaing } from 'components/layout/ChapterLayout';
import { ListBadgesByCampaign, ListPostersByCampaign, ListUsersByCampaign } from 'components/layout/CampaignLayout';

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
