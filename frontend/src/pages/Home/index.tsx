
import Pagination, { PaginationLeft, PaginationRight } from 'components/Pagination';
import './styles.css'
import ArticleNav from 'components/ArticleCard';
import { ArticleChapter } from 'components/Article';
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
        <h1>Capítulos</h1>
      <Pagination/>
        <div className="row ">

            <div className=" col-sm-6 col-md-3 xl-3" >
              <QuestCard />
              </div>  
              <div className="col-sm-6 col-md-9 col-xl-9">
              <ArticleChapter /> 
              </div>
              </div>
              </div>
    </>
  );
}