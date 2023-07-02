import Home from "pages/Home";
import { Chapter } from "pages/profiles/ChapterProfile";
import { BadgeByUser, CampaignsByUser, ConquestsByUser, Followers, Following, PostersByUser } from "pages/profiles/UserProfile";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from "components/shared/NavBar";
import Footer from "components/shared/Footer";
import Post from "pages/profiles/PostProfile";
import { ArticleList, CampaignList, UserList } from "pages/Listing";
import { QuizProfile } from "components/game/QuizzGame";
import { Ranking } from "pages/Ranking";
import { CampaignProfile } from "pages/profiles/CampaignProfile";

const PageRoutes = () => {
    return (
        <>
            <BrowserRouter>
                <Navbar />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/post-list" element={<ArticleList />} />
                    <Route path="/campaign-list" element={<CampaignList />} />
                    <Route path="/user-list" element={<UserList />} />

                    <Route path="/ranking" element={<Ranking />} />

                    <Route path="/profile">
                        <Route path=":userId" element={<ConquestsByUser />} />
                    </Route>

                    <Route path="/profile/stats">
                        <Route path=":userId" element={<ConquestsByUser />} />
                    </Route>
                    <Route path="/profile/posters">
                        <Route path=":userId" element={<PostersByUser />} />
                    </Route>
                    <Route path="/profile/campaigns">
                        <Route path=":userId" element={<CampaignsByUser />} />
                    </Route>
                    <Route path="/profile/conquests">
                        <Route path=":userId" element={<BadgeByUser />} />
                    </Route>
                    <Route path="/profile/followers">
                        <Route path=":userId" element={<Followers />} />
                    </Route>
                    <Route path="/profile/following">
                        <Route path=":userId" element={<Following />} />
                    </Route>

                    <Route path="/post">
                        <Route path=":postId" element={<Post />} />
                    </Route>

                    <Route path="/campaign">
                        <Route path=":campaignId" element={<CampaignProfile />} />
                    </Route>

                    <Route path="/chapter">
                        <Route path=":chapterId" element={<Chapter />} />
                    </Route>

                    <Route path="/quiz">
                        <Route path=":quizId" element={<QuizProfile />} />
                    </Route>
                </Routes>
                <Footer />
            </BrowserRouter>
        </>
    );
}

export default PageRoutes;