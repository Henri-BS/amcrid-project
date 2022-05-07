
import Pagination, { PaginationLeft, PaginationRight } from 'components/Pagination';
import './styles.css'
import ArticleNav from 'components/ArticleCard';
import { ArticleChapter } from 'components/Article';
import QuestCard from 'components/QuestCard';
import { Link } from 'react-router-dom';

export default function Home() {
  return (
    <>
      <div className="container">
      <h2>Artigos</h2>
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
        <Link to='/quest/1'>
        <h2>Capítulos</h2>
        </Link>
      <Pagination/>
        <div className="row quest-chapter-container">
            <div className=" col-sm-6 col-md-6 xl-3" >
              <QuestCard />
              </div>  
              <div className="col-sm-6 col-md-6 col-xl-9">
              <ArticleChapter /> 
              </div>
              </div>
              </div>
    </>
  );
}