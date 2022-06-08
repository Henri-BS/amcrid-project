import Home from "pages/Home";
import Quest from "pages/Chapter/index";
import Profile from "pages/Profile";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from "components/NavBar";
import Footer from "components/Footer";
import Post from "pages/Post";
import Ranking from "pages/Ranking";
import {ArticleList, QuestList, UserList} from "pages/Listing";

const PageRoutes = () => {
    return (
        <>
            <BrowserRouter>
                <Navbar />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/article-list" element={<ArticleList />} />
                    <Route path="/quest-list" element={<QuestList />} />
                    <Route path="/user-list" element={<UserList />} />

                    <Route path="/ranking" element={<Ranking />} />

                    <Route path="/profile">
                        <Route path=":userId" element={<Profile />} />
                    </Route>

                    <Route path="/post">
                        <Route path=":postId" element={<Post />} />
                    </Route>


                    <Route path="/quest">
                        <Route path=":questId" element={<Quest />} />
                    </Route>
                </Routes>
                <Footer />
            </BrowserRouter>
        </>
    );
}

export default PageRoutes;