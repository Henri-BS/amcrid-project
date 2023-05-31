import { User } from "./user";

export type Post = {
  id: number;
  title: string;
  summary: string;
  views: number;
  body: string;
  image: string;
  createdBy: string;
  createdDate: string; 
  user: User;
};

export type PostPage = {
  content?: Post[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};
