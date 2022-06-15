import { ArticlePost } from "components/Article";
import { useParams } from "react-router-dom";

 function Post() {

const params = useParams();

    return (
      <>
  <div className="container">
  <ArticlePost postId={`${params.postId}`}/>
  </div>
      </>
    );
  }
  
  export default Post;