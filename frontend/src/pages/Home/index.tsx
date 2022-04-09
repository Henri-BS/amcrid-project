
import { PaginationLeft, PaginationRight } from 'components/Pagination';
import './styles.css'
import ArticleNav from 'components/ArticleNav';
import Article from 'components/Article';
import QuestCard from 'components/QuestCard';

export default function Home() {
  return (
    <>
      <div className="container">

        <div className="row">
          <div className="col-1 p-0">
            <PaginationLeft />
          </div>

          <div className="col-10 article-scroll-container ">
            <div className="article-item"><ArticleNav /></div>
            <div className="article-item"><ArticleNav /></div>
            <div className="article-item"><ArticleNav /></div>
            <div className="article-item"><ArticleNav /></div>
            <div className="article-item"><ArticleNav /></div>
            <div className="article-item"><ArticleNav /></div>
            <div className="article-item"><ArticleNav /></div>

          </div>

          <div className="col-1 p-0">
            <PaginationRight />
          </div>
        </div>

        <div className="quest-nav-container">
          <div className=" row">
            <div className="col-4">
              <QuestCard />
            </div>
            <div className="col-8">
              <Article />
            </div>
          </div>
        </div>
      </div>
    </>
  );
}