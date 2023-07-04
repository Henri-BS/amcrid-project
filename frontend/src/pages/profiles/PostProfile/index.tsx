import axios from "axios";
import { PostEditForm } from "components/forms/PostForm";
import { PostCard, PostLayout } from "components/layout/PostLayout";
import Pagination from "components/shared/Pagination";
import { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { PostPage } from "types/post";
import { BASE_URL } from "utils/requests";

export function Post() {

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

export function ArticleList() {

  const [pageNumber, setPageNumber] = useState(0);
  const [postPage, setPostPage] = useState<PostPage>({
      content: [],
      number: 0
  });

  useEffect(() => {
      axios.get(`${BASE_URL}/post?page=${pageNumber}&size=8&sort=id`)
          .then(response => {
              const data = response.data as PostPage;
              setPostPage(data);
          });

  }, [pageNumber]);

  const handlePageChange = (newPageNumber: number) => {
      setPageNumber(newPageNumber);
  }

  return (
      <>
          <div className="container">
              <div><Pagination 
               page={postPage}
               onChange={handlePageChange}/>
               </div>
              <div className="list-container row">
                  {postPage.content?.map(post => (
                      <div key={post.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                          <PostCard post={post} />
                      </div>
                  ))}
              </div>
          </div>
      </>
  );
}
