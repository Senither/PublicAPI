package net.hypixel.api.reply;

import net.hypixel.api.util.Banner;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public class GuildReply extends AbstractReply {
    private Guild guild;

    public Guild getGuild() {
        return guild;
    }

    @Override
    public String toString() {
        return "GuildReply{" +
                "guild=" + guild +
                "} " + super.toString();
    }

    public static class Guild {
        private String _id;

        private String name;
        private String description;
        private String tag;
        private Boolean publiclyListed;
        private Banner banner;
        private List<Member> members;
        private List<Rank> ranks;
        private int coins;
        private int coinsEver;
        private ZonedDateTime created;
        private Boolean joinable;
        private long exp;
        private int legacyRanking;

        public String get_id() {
            return _id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getTag() {
            return tag;
        }

        public Boolean getPubliclyListed() {
            return publiclyListed;
        }

        public Banner getBanner() {
            return banner;
        }

        public List<Member> getMembers() {
            return members;
        }

        public List<Rank> getRanks() {
            return ranks;
        }

        public int getCoins() {
            return coins;
        }

        public int getCoinsEver() {
            return coinsEver;
        }

        public ZonedDateTime getCreated() {
            return created;
        }

        public Boolean getJoinable() {
            return joinable;
        }

        public long getExp() {
            return exp;
        }

        public int getLegacyRanking() {
            return legacyRanking;
        }

        @Override
        public String toString() {
            return "Guild{" +
                    "_id='" + _id + '\'' +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", tag='" + tag + '\'' +
                    ", publiclyListed=" + publiclyListed +
                    ", banner=" + banner +
                    ", members=" + members +
                    ", coins=" + coins +
                    ", coinsEver=" + coinsEver +
                    ", created=" + created +
                    ", joinable=" + joinable +
                    ", exp=" + exp +
                    ", legacyRanking=" + legacyRanking +
                    '}';
        }

        public class Member {
            private UUID uuid;
            private String rank;
            private ZonedDateTime joined;
            private LinkedHashMap<String, Long> expHistory;

            public UUID getUuid() {
                return uuid;
            }

            public String getRank() {
                return rank;
            }

            public ZonedDateTime getJoined() {
                return joined;
            }

            public LinkedHashMap<String, Long> getExpHistory() {
                return expHistory;
            }

            @Override
            public String toString() {
                return "Member{" +
                        "uuid=" + uuid +
                        ", rank=" + rank +
                        ", joined=" + joined +
                        ", expHistory=" + expHistory.toString() +
                        '}';
            }
        }
    }

    public class Rank {
        private String name;
        private String tag;
        private ZonedDateTime created;
        private int priority;

        public String getName() {
            return name;
        }

        public String getTag() {
            return tag;
        }

        public ZonedDateTime getCreated() {
            return created;
        }

        public int getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "Rank{" +
                    "name=" + name +
                    ", tag=" + tag +
                    ", created=" + created +
                    ", priority=" + priority +
                    '}';
        }
    }
}
