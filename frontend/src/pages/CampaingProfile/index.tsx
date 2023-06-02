import { useParams } from 'react-router-dom';
import { ListChaptersByCampaing } from 'components/layout/ChapterLayout';

export function CampaignProfile() {
  const params = useParams();

  return (
    <>
    <div className="container">
      <ListChaptersByCampaing id={`${params.campaignId}`} />
    </div>
  </>
  );
}
