import java.util.*;

public class Twitter {

    // Tweet object
    static class Tweet {
        int id;
        int time;

        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    // userId -> list of tweets
    private Map<Integer, List<Tweet>> tweets;

    // userId -> set of followees
    private Map<Integer, Set<Integer>> follows;

    // global timestamp
    private int time;

    public Twitter() {
        tweets = new HashMap<>();
        follows = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        tweets.computeIfAbsent(userId, k -> new ArrayList<>())
              .add(new Tweet(tweetId, time++));
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        follows.computeIfAbsent(followerId, k -> new HashSet<>())
               .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (follows.containsKey(followerId)) {
            follows.get(followerId).remove(followeeId);
        }
    }

    public List<Integer> getNewsFeed(int userId) {

        // Max heap by time
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );

        // Add user's latest tweet
        if (tweets.containsKey(userId)) {
            List<Tweet> t = tweets.get(userId);
            Tweet last = t.get(t.size() - 1);
            pq.offer(new int[]{userId, last.time, t.size() - 1});
        }

        // Add followees' latest tweets
        for (int followee : follows.getOrDefault(userId, new HashSet<>())) {
            if (tweets.containsKey(followee)) {
                List<Tweet> t = tweets.get(followee);
                Tweet last = t.get(t.size() - 1);
                pq.offer(new int[]{followee, last.time, t.size() - 1});
            }
        }

        List<Integer> feed = new ArrayList<>();

        while (!pq.isEmpty() && feed.size() < 10) {
            int[] cur = pq.poll();
            int uid = cur[0];
            int idx = cur[2];

            feed.add(tweets.get(uid).get(idx).id);

            if (idx > 0) {
                Tweet prev = tweets.get(uid).get(idx - 1);
                pq.offer(new int[]{uid, prev.time, idx - 1});
            }
        }

        return feed;
    }

    // Main function for testing
    public static void main(String[] args) {
        Twitter twitter = new Twitter();

        twitter.postTweet(1, 5);
        twitter.postTweet(1, 3);
        twitter.postTweet(2, 6);

        twitter.follow(1, 2);

        System.out.println("User 1 feed: " + twitter.getNewsFeed(1));

        twitter.unfollow(1, 2);

        System.out.println("User 1 feed after unfollow: " + twitter.getNewsFeed(1));
    }
}