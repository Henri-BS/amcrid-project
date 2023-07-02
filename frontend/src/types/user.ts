import { Conquest } from "./conquest";
import { Post } from "./post";

export type User = {
  id: number;
  email: string;
  userName: string;
  password: string;
  image: string;
  conquest: Conquest;
};

export type UserPage = {
  content?: User[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};

export type UserProps = {
  user: User;
};

export type Follow = {
  id: number;
  follower: User;
  following: User;
};

export type FollowPage = {
  content: Follow[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};

export type FollowProps = {
  follow: Follow;
};

export type UserPost = {
    id: number;
  userId: number;
  post: Post;
};
export type UserPostPage = {
  content: UserPost[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};

export type UserPostProps = {
    userPost: UserPost; 
  };