import { CampaignBadge, CampaignUser } from "./chapter";

export type Badge = {
    id: number;
    name: string;
    description: string;
    image: string;
    xp: number;
}

export type BadgePage = {
  content?: Badge[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};

export type CampaignBadgePage = {
    content?: CampaignBadge[];
    last?: boolean;
    first?: boolean;
    empty?: boolean;
    totalPages?: number;
    totalElements?: number;
    numberOfElements?: number;
    size?: number;
    number: number;
  };

  export type CampaignUserPage = {
    content?: CampaignUser[];
    last?: boolean;
    first?: boolean;
    empty?: boolean;
    totalPages?: number;
    totalElements?: number;
    numberOfElements?: number;
    size?: number;
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