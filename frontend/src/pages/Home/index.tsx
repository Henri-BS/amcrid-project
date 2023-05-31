
import Pagination from 'components/shared/Pagination';
import './styles.css'
import { CampaignCard } from 'components/layout/ChapterLayout';
import { Link } from 'react-router-dom';
import { PostCard } from 'components/layout/ArticleLayout';
import { useEffect, useState } from 'react';
import { PostPage } from 'types/post';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import {CampaignPage } from 'types/chapter';

function Home() {

  const [pageNumber, setPageNumber] = useState(0);
  const [page, setPage] = useState<PostPage>({
    content: [],
    number: 0

  });

  useEffect(() => {
    axios.get(`${BASE_URL}/post?${pageNumber}&size=10&sort=createdDate`)
      .then(response => {
        const data = response.data as PostPage;
        setPage(data);
      });
  }, [pageNumber]);


  const [campaignPage, setCampaignPage] = useState<CampaignPage>({
    content: [],
    number: 0
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/campaign/list?page=${pageNumber}&size=1&sort=id`)
      .then((response) => {
        setCampaignPage(response.data);
      })
  }, [pageNumber]);

  const handlePageChange = (newPageNumber: number) => {
    setPageNumber(newPageNumber);
  }

  return (
    <>
      <div className="side-menu">
      </div>
      <div className="container">
        <Link to="/post-list">
          <h2>Artigos</h2>
        </Link>
        <div className="article-max-container">
          <div className="d-flex">
            <div className="nav-list-container">
              {page.content?.map(article => (
                <div key={article.id} className="nav-list-item">
                  <PostCard post={article} />
                </div>
              ))}
            </div>
          </div>
        </div>


        <Link to="/chapter-list">
          <h2>Capítulos</h2>
        </Link>
        <Pagination page={campaignPage} onChange={handlePageChange}
        />
        <div className="row quest-chapter-container">
          {campaignPage.content?.map(campaign => (
            <div key={campaign.id}>
              <CampaignCard campaign={campaign} />
            </div>
          ))}
      
        </div>
      </div>
    </>
  );
}

export default Home;