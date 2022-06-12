import { ArticlePost } from "components/Article";
import { useParams } from "react-router-dom";

export default function Post() {

    return (
      <>
  <div className="container">
  <ArticlePost />
  </div>
      </>
    );
  }