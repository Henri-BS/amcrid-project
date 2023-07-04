import { Chapter } from 'types/campaign';
import { useEffect, useState } from 'react';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { Quiz } from 'types/quiz';
import { QuizCard } from 'components/game/QuizzGame';
import '../styles.css';
import { Props } from 'types/page';
import { ChapterCard } from 'components/cards/CampaignCard';

export function ListChaptersByCampaing({ id: campaignId }: Props) {
    const [chapterList, setChapterList] = useState<Chapter[]>();
    useEffect(() => {
        axios.get(`${BASE_URL}/chapter/campaign/${campaignId}`)
            .then((response) => {
                setChapterList(response.data);
            });
    }, [campaignId]);

    return (
        <>
            <div className="title-container">Capítulos</div>
            <div className=" nav-list-container">
                {chapterList?.map(x => (
                    <div key={x.id} className="nav-list-item">
                        <ChapterCard chapter={x} />
                    </div>
                ))}
            </div>
        </>
    );
}

export function ListQuizzesByChapter({ id: chapterId }: Props) {

    const [quizList, setQuizList] = useState<Quiz[]>();
    useEffect(() => {
        axios.get(`${BASE_URL}/quiz/chapter/${chapterId}`)
            .then((response) => {
                setQuizList(response.data);
            });
    }, [chapterId]);

    return (
        <>
            <div className="title-container">Quizzes</div>
            <div className=" nav-list-container">
                {quizList?.map(x => (
                    <div key={x.chapterId} className="m-2">
                        <QuizCard quiz={x} />
                    </div>
                ))}
            </div>
        </>
    );
}
