
export type Conquest = {
  id: number;
  principalQuest: number;
  secondaryQuest: number;
  chapterCompleted: number;
  totalBadges: number;
  totalXp: number;
  userId: number;
  userName: string;
  userImage: string;
};

export type ConquestPage = {
  content?: Conquest[];
  last: boolean;
  first: boolean;
  empty?: boolean;  
  size?: number;
  totalPages: number;
  totalElements: number;
  numberOfElements?: number;
  number: number;
};

export type UserRank = {
userName: string;
totalXp: number;

};