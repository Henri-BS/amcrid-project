import ArticleCard from "components/ArticleCard";
import Pagination from "components/Pagination";
import QuestCard from "components/QuestCard";
import { MiniUserCard } from "components/UserCard";
import "./styles.css"

export function ArticleList() {
    return (
        <>
            <div className="container">
                <div><Pagination /></div>
                <div className="list-container row">
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><ArticleCard /></div>
                </div>
            </div>
        </>
    );
}

export function QuestList() {
    return (
        <>
            <div className="container">
                <div><Pagination /></div>
                <div className="list-container row">
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><QuestCard /></div>
                </div>
            </div>
        </>
    );
}

export function UserList() {
    
    return (
        <>
            <div className="container">
                <div><Pagination /></div>
                <div className="list-container row">
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3"><MiniUserCard /></div>
                </div>
            </div>
        </>
    );
}