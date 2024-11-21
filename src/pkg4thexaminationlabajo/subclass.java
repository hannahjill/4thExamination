package pkg4thexaminationlabajo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class subclass {
    private Map<String, Set<String>> kaibiganlangpala;
 
    public subclass() {
        kaibiganlangpala = new HashMap<>();
    }
 
    public void addUser(String User) {
        kaibiganlangpala.put(User, new HashSet<>());
    }
 
    public void addFriends(String User1, String User2) {
        kaibiganlangpala.put(User1, new HashSet<>());
        kaibiganlangpala.put(User2, new HashSet<>());
        kaibiganlangpala.get(User1).add(User2);
        kaibiganlangpala.get(User2).add(User1);
    }
 
    public void displayFriends() {
        for (var entry : kaibiganlangpala.entrySet()) {
            System.out.print(entry.getKey() + "'s friends: ");
            for (String friend : entry.getValue()) {
                System.out.print(friend + " ");
            }
            System.out.println();
        }
    }
 
    public Set<String> getRecommendedFriends(String User) {
        Set<String> Recommended = new HashSet<>();
        Set<String> UserFriends = kaibiganlangpala.getOrDefault(User, new HashSet<>());
 
        for (String friend : UserFriends) {
            for (String friendsFriend : kaibiganlangpala.getOrDefault(friend, new HashSet<>())) {
                if (!UserFriends.contains(friendsFriend) && !friendsFriend.equals(User)) {
                    Recommended.add(friendsFriend);
                }
            }
        }
        return Recommended;
    }
}

