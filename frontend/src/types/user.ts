export type User = {
    id: number;
    userName: string;
    email: string;
    pasword: string;
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
  
  