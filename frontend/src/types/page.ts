import { Chapter } from "./chapter";
import { Post } from "./post";
import { User } from "./user";

export type Page = {
    content?: Post[] | Chapter[] | User[];
    last: boolean;
    first: boolean;
    empty?: boolean;
    totalPages: number;
    totalElements: number;
    numberOfElements?: number;
    size?: number;
    number: number;
  };