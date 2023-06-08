import { Badge } from "./badge";
import { Campaign, Chapter } from "./campaign";
import { Post } from "./post";
import { User } from "./user";

export type Page = {
    content?: Post[] | Chapter[] | User[] |Campaign[] | Badge[];
    last?: boolean;
    first?: boolean;
    empty?: boolean;
    totalPages?: number;
    totalElements?: number;
    numberOfElements?: number;
    size?: number;
    number: number;
  };