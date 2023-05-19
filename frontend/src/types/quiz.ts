
export type Props = {
    id: string;
}

export type Quiz = {
    id: number;
    title: string;
    description: string;
    image: string;
    questionQuantity: number;
    chapterId: number;
}

export type Question = {
    id: number;
    title: string;
    correctChoice: number;
    quizId: number;
    quizTitle: string;
}

export type QuestionPage = {
    content: Question[];
    last?: boolean;
    first?: boolean;
    empty?: boolean;
    totalPages?: number;
    totalElements?: number;
    numberOfElements?: number;
    size?: number;
    number: number;
}

export type Option = {
    id: number;
choice: string;
questionId: number;
questionTitle: string;    
}