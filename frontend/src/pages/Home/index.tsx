
import './styles.css'
import { Link } from 'react-router-dom';
import { PostCard } from 'components/cards/PostCard';
import { useEffect, useState } from 'react';
import { PostPage } from 'types/post';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { CampaignPage } from 'types/campaign';
import { CampaignMdCard } from 'components/cards/CampaignCard';

function Home() {

  const [page, setPage] = useState<PostPage>({
    content: [],
    number: 0

  });

  useEffect(() => {
    axios.get(`${BASE_URL}/post/list?size=10&sort=id,asc`)
      .then(response => {
        const data = response.data as PostPage;
        setPage(data);
      });
  }, []);


  const [campaignPage, setCampaignPage] = useState<CampaignPage>({
    content: [],
    number: 0
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/campaign/list?&size=10&sort=id`)
      .then((response) => {
        setCampaignPage(response.data);
      })
  }, []);


  return (
    <>
      <div className="side-menu">
      </div>
      <div className="container">
        <h2>
          <Link to="/post-list">
            Artigos
          </Link>
        </h2>
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

        <h2>
          <Link to="/campaign-list">
            Campanhas
          </Link>
        </h2>
        <div className="nav-list-container">
          {campaignPage.content?.map(campaign => (
            <div key={campaign.id} className='nav-list-item'>
              <CampaignMdCard campaign={campaign} />
            </div>
          ))}
        </div>
      </div>
    </>
  );
}

export default Home;