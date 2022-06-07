export type User = {
    id: number;
    email: string;
    userName: string;
    password: string;
    image: string;
}

export type UserPage = {
    content: User[];
    last: boolean;
    first: boolean;
    empty: boolean;
    totalPages: number;
    totalElements: number;
    numberOfElements: number;
    size: number;
    number: number;
  };
  
  