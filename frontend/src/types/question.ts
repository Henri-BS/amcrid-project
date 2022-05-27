
export type Question = {
    id: number;
    title: string;
    optionA: string;
    optionB: string;
    optionC: string;
    optionD: string;
    optionE: string;
    ans: number;
    chose: number;
}

export type QuestionPage = {
    content: Question[];
    last: boolean;
    first: boolean;
    empty: boolean;
    totalPages: number;
    totalElements: number;
    numberOfElements: number;
    size: number;
    number: number;
}