import { PostEditForm } from "components/form/PostForm";
import { ArticlePost } from "components/layout/ArticleLayout";
import { useParams } from "react-router-dom";

function Post() {

  const params = useParams();

  return (
    <>
      <div className="container">
      <div className="menu-options-container">
          <button data-bs-target="#editPostModal" data-bs-toggle="modal" className="btn cl-form-btn">
            Editar Post
          </button>
        </div>
        <ArticlePost id={`${params.postId}`} />
      </div>
      <div className="modal fade" role="dialog" id="editPostModal">  
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <PostEditForm id={`${params.postId}`} />
          </div>
        </div>
      </div>
    </>
  );
}

export default Post;