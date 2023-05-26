import './styles.css';
import { useParams } from 'react-router-dom';
import { ChapterDashboard, ListQuizzesByChapter } from 'components/layout/ChapterLayout';
import { ChapterEditForm } from 'components/form/ChapterForm';

export function Chapter() {
  const params = useParams();

  return (
    <>
    <div className="container">
    <div className="menu-options-container">
          <button data-bs-target="#editChapterModal" data-bs-toggle="modal" className="btn cl-form-btn">
            Editar Post
          </button>
          </div>
      <ChapterDashboard id={`${params.chapterId}`} />      
      <ListQuizzesByChapter id={`${params.chapterId}`} />
    </div>

    <div className="modal fade" role="dialog" id="editChapterModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <ChapterEditForm id={`${params.chapterId}`} />
          </div>
        </div>
      </div>

  </>
  );
}
