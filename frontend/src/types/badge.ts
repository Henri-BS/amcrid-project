export type Badge = {
    id: number;
    name: string;
    description: string;
    image: string;
    xp: number;
    chapterId: number;
}

export type BadgePage = {
    content: Badge[];
    last: boolean;
    first: boolean;
    empty: boolean;
    totalPages: number;
    totalElements: number;
    numberOfElements: number;
    size: number;
    number: number;
  };

  export type UserBadge = {
id: number;
  userId: number;
  count: number;
  conquestDate: string;
  badgeName: string;
badgeImage: string;
}