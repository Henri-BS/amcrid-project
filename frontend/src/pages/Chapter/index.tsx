import './styles.css';
import { useParams } from 'react-router-dom';
import { ChapterDashboard, ListQuizzesByChapter } from 'components/layout/ChapterLayout';

export function Chapter() {
  const params = useParams();

  return (
    <>
    <div className="container">
      <ChapterDashboard id={`${params.chapterId}`} />      
      <ListQuizzesByChapter id={`${params.chapterId}`} />
    </div>
  </>
  );
}
