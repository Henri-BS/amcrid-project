import axios from "axios";
import { PostEditForm } from "components/form/PostForm";
import { PostLayout } from "components/layout/ArticleLayout";
import { useNavigate, useParams } from "react-router-dom";
import { BASE_URL } from "utils/requests";

function Post() {

  const params = useParams();
  const navigate = useNavigate();
  const deletePost = () => {
    axios.delete(`${BASE_URL}/post/delete/${params.postId}`)
      .then((response) => {
        navigate(`/post-list`)
      })
  }

  return (
    <>
      <div className="container">
        <div className="menu-options-container user-body-container">
          <button data-bs-target="#editPostModal" data-bs-toggle="modal" className="btn cl-btn mx-2">
            <i className="fa fa-edit"/> Editar Post
          </button>
          <button data-bs-target="#deletePostModal" data-bs-toggle="modal" className="btn cl-btn">
          <i className="fa fa-trash"/> Deletar Post
          </button>
        </div>
        <PostLayout id={`${params.postId}`} />
      </div>

      <div className="modal fade" role="dialog" id="editPostModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <PostEditForm id={`${params.postId}`} />
          </div>
        </div>
      </div>

      <div className="modal fade" role="dialog" id="deletePostModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <div className="modal-header">
              <div className="modal-title" id="itemLabel">Deseja deletar está publicação</div>
                <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true"><i className="fa fa-times" /></span>
                </button>
            </div>
            <div className="modal-footer">
              <button onClick={() => deletePost()} data-bs-dismiss="modal" className="btn">
                Deletar
              </button>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}

export default Post;