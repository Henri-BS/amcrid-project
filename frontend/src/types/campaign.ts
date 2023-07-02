import { Badge } from "./badge";
import { Post } from "./post";
import { User } from "./user";

export type Campaign = {
  id: number;
  name: string;
  description: string;
  image: string;
  campaignId: number;
}

export type CampaignPage = {
  content: Campaign[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
}

export type CampaignProps = {
  campaign: Campaign;
}



export type Chapter = {
  id: number;
  title: string;
  description: string;
  image: string;
};

export type ChapterPage = {
  content: Chapter[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};



export type CampaignBadge = {
  campaignId: number;
  badge: Badge
}

export type CampaignUser = {
  id: number;
  campaign: Campaign;
  user: User;
  chapterQuantity: number;
  postQuantity: number;
}

export type CampaignPost = {
  campaignId: number;
  post: Post;
}



export type CampaignBadgeProps = {
  badge: CampaignBadge;
}

export type CampaignUserProps = {
  campaignUser: CampaignUser;
}

export type CampaignPostProps = {
  campaignPost: CampaignPost;
}

export type CampaignPostPage = {
  content?: CampaignPost[];
  last?: boolean;
  first?: boolean;
  empty?: boolean;
  totalPages?: number;
  totalElements?: number;
  numberOfElements?: number;
  size?: number;
  number: number;
};



