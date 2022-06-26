
import Pagination, { PaginationLeft, PaginationRight } from 'components/Pagination';
import './styles.css'
import { ArticleChapter } from 'components/Article';
import ChapterCard from 'components/ChapterCard';
import { Link } from 'react-router-dom';
import ArticleCard from 'components/ArticleCard';
import { useEffect, useState } from 'react';
import { PostPage } from 'types/post';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { ChapterPage } from 'types/chapter';

function Home() {

  const [pageNumber, setPageNumber] = useState(0);
  const [page, setPage] = useState<PostPage>({
    content: [],
    first: true,
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 0,
    number: 0,
    numberOfElements: 0,
    empty: true
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/post?${pageNumber}&size=10&sort=createdDate`)
      .then(response => {
        const data = response.data as PostPage;
        setPage(data);
      });
  }, [pageNumber]);


  const [chapterPage, setChapterPage] = useState<ChapterPage>({
    content: [],
    first: true,
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 0,
    number: 0,
    numberOfElements: 0,
    empty: true
  });


  useEffect(() => {
    axios.get(`${BASE_URL}/chapter?page=${pageNumber}&size=1&sort=id`)
      .then(response => {
        const data = response.data as ChapterPage;
        setChapterPage(data);
      })
  }, [pageNumber]);

  const handlePageChange = (newPageNumber: number) => {
    setPageNumber(newPageNumber);
  }

  return (
    <>
      <div className="container">

        <Link to="/article-list">
          <h2>Artigos</h2>
        </Link>
        <div className="article-max-container">
          <div className="d-flex">
            <div className="article-scroll-container">
              {page.content?.map(article => (
                <div key={article.id} className="article-item">
                  <ArticleCard post={article} />
                </div>
              ))}
            </div>
          </div>
        </div>


        <Link to="/chapter-list">
          <h2>Capítulos</h2>
        </Link>
        <Pagination
          page={chapterPage}
          onChange={handlePageChange}
        />
        <div className="row quest-chapter-container">
          {chapterPage.content?.map(chapter => (
            <div key={chapter.id} className=" col-sm-6 col-md-3 xl-3" >
              <ChapterCard chapter={chapter} />
            </div>
          ))}
          {chapterPage.content?.map(chapter => (
            <div key={chapter.id} className="col-sm-6 col-md-9 col-xl-9">
              <ArticleChapter chapter={chapter} />
            </div>
          ))}
        </div>
      </div>
    </>
  );
}

export default Home;