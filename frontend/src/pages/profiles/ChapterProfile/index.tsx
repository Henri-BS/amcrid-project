import { useNavigate, useParams } from 'react-router-dom';
import { ChapterDashboard, ListQuizzesByChapter } from 'components/layout/ChapterLayout';
import { ChapterEditForm } from 'components/form/ChapterForm';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';

export function Chapter() {
  const params = useParams();
const navigate = useNavigate();

  const deleteChapter = () => {
axios.delete(`${BASE_URL}/chapter/delete/${params.chapterId}`)
.then((response) => {
  navigate(`/`)
})
}

  return (
    <>
    <div className="container">
    <div className="menu-options-container">
          <button data-bs-target="#editChapterModal" data-bs-toggle="modal" className="btn cl-form-btn">
            Editar Capítulo
          </button>
          <button data-bs-target="#deleteChapterModal" data-bs-toggle="modal" className="btn cl-form-btn">
            Deletar Capítulo
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

      <div className="modal fade" role="dialog" id="deleteChapterModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <div className="modal-header">
              <div className="modal-title" id="chapterLabel">Deseja deletar este capítulo</div>
                <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true"><i className="fa fa-times" /></span>
                </button>
            </div>
            <div className="modal-footer">
              <button onClick={() => deleteChapter()} data-bs-dismiss="modal" className="btn">
                Deletar
              </button>
            </div>
          </div>
        </div>
      </div>
  </>
  );
}
