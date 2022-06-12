export type Post = {
  id: number;
  title: string;
  summary: string;
  views: number;
  body: string;
  userId: number;
  userName: string;
  createdBy: string;
  createdDate: string;
};

export type PostPage = {
  content?: Post[];
  last: boolean;
  first: boolean;
  empty?: boolean;
  totalPages: number;
  totalElements: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};
