
import Pagination from 'components/Pagination';
import './styles.css'
import ArticleNav from 'components/ArticleNav';
import Article from 'components/Article';
import QuestCard from 'components/QuestCard';

export default function Home() {
  return (
    <>
      <div className="container">
          <Pagination />
          <div className="article-nav-continer row flex-row">
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
              <ArticleNav />
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
              <ArticleNav />
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
              <ArticleNav />
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
              <ArticleNav />
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