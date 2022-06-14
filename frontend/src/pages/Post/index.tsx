import { ArticlePost } from "components/Article";
import { useParams } from "react-router-dom";

export default function Post() {

const params = useParams();

    return (
      <>
  <div className="container">
  <ArticlePost postId={`${params.postId}`}/>
  </div>
      </>
    );
  }