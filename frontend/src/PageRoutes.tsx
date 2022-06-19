import Home from "pages/Home";
import Chapter from "pages/Chapter/index";
import Profile from "pages/Profile";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from "components/NavBar";
import Footer from "components/Footer";
import Post from "pages/Post";
import Ranking from "pages/Ranking";
import {ArticleList, ChapterList, UserList} from "pages/Listing";

const PageRoutes = () => {
    return (
        <>
            <BrowserRouter>
                <Navbar />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/article-list" element={<ArticleList />} />
                    <Route path="/quest-list" element={<ChapterList />} />
                    <Route path="/user-list" element={<UserList />} />

                    <Route path="/ranking" element={<Ranking />} />

                    <Route path="/profile">
                        <Route path=":userId" element={<Profile />} />
                    </Route>

                    <Route path="/post">
                        <Route path=":postId" element={<Post />} />
                    </Route>


                    <Route path="/chapter">
                        <Route path=":questionId" element={<Chapter />} />
                    </Route>
                </Routes>
                <Footer />
            </BrowserRouter>
        </>
    );
}

export default PageRoutes;