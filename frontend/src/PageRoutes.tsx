import Explore from "pages/Explore";
import Home from "pages/Home";
import Quest from "pages/Quest/index";
import Post from "pages/Post";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from "components/NavBar";
import Footer from "components/Footer";

const PageRoutes = () => {
    return (
        <>

            <BrowserRouter>
                <Navbar />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/explorar" element={<Explore />} />

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