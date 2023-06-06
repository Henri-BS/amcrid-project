import { useParams } from 'react-router-dom';
import { ListChaptersByCampaing } from 'components/layout/ChapterLayout';
import { ListBadgesByCampaign } from 'components/layout/CampaignLayout';

export function CampaignProfile() {
  const params = useParams();

  return (
    <>
    <div className="container">
      <ListBadgesByCampaign  id={`${params.campaignId}`}/> 
      <ListChaptersByCampaing id={`${params.campaignId}`} />
    </div>
  </>
  );
}
