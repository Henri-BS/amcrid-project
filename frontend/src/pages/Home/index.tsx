
import Pagination, { PaginationLeft, PaginationRight } from 'components/Pagination';
import './styles.css'
import ArticleNav from 'components/ArticleNav';
import Article from 'components/Article';
import QuestCard from 'components/QuestCard';

export default function Home() {
  return (
    <>
      <div className="container">
        <div className="article-max-container">
          <div className="d-flex">

            <div className="pagination-page-container">
              <PaginationLeft />
            </div>

            <div className="article-scroll-container">
              <div className="article-item"><ArticleNav /></div>
              <div className="article-item"><ArticleNav /></div>
              <div className="article-item"><ArticleNav /></div>
              <div className="article-item"><ArticleNav /></div>
            </div>

            <div className="pagination-page-container">
              <PaginationRight />
            </div>

          </div>

        </div>

        <div className="quest-max-container">
      <div className="d-flex">
            <div className="quest-chapter-container" >
              <QuestCard />
              
              </div><Article /> 
            </div>
            <Pagination/>
          </div>
      </div>
    </>
  );
}