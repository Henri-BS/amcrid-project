
import Pagination, { PaginationLeft, PaginationRight } from 'components/Pagination';
import './styles.css'
import { ArticleChapter } from 'components/Article';
import QuestCard from 'components/QuestCard';
import { Link } from 'react-router-dom';
import ArticleCard from 'components/ArticleCard';

function Home() {
  return (
    <>
      
      <div className="container">
        <Link to="/article-list">
      <h2>Artigos</h2>
      </Link>
        <div className="article-max-container">
          <div className="d-flex">
            <div className="pagination-page-container">
              <PaginationLeft />
            </div>

            <div className="article-scroll-container">
              <div className="article-item"><ArticleCard /></div>
              <div className="article-item"><ArticleCard /></div>
              <div className="article-item"><ArticleCard /></div>
              <div className="article-item"><ArticleCard /></div>
            </div>

            <div className="pagination-page-container">
              <PaginationRight />
            </div>
          </div>
        </div>
        <Link to="/quest-list">
        <h2>Capítulos</h2>
        </Link>
      <Pagination/>
        <div className="row quest-chapter-container">
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

export default Home;