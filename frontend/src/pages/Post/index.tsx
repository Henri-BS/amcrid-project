import { ArticlePost } from "components/ArticleLayout";
import { useParams } from "react-router-dom";

function Post() {

  const params = useParams();

  return (
    <>
      <div className="container">
        <ArticlePost id={`${params.postId}`} />
      </div>
    </>
  );
}

export default Post;