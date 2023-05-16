import Home from "pages/Home";
import { Chapter } from "pages/Chapter/index";
import Profile from "pages/Profile";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from "components/shared/NavBar";
import Footer from "components/shared/Footer";
import Post from "pages/Post";
import Ranking from "pages/Ranking";
import {ArticleList, ChapterList, UserList} from "pages/Listing";
import { QuizProfile } from "components/QuizzGame";

const PageRoutes = () => {
    return (
        <>
            <BrowserRouter>
                <Navbar />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/article-list" element={<ArticleList />} />
                    <Route path="/chapter-list" element={<ChapterList />} />
                    <Route path="/user-list" element={<UserList />} />

                    <Route path="/ranking" element={<Ranking />} />

                    <Route path="/profile">
                        <Route path=":userId" element={<Profile />} />
                    </Route>

                    <Route path="/post">
                        <Route path=":postId" element={<Post />} />
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