package SosialMedia;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Post> posts;
    private long userID;
    private List<Group> groups;

    public User() {

        this.posts = new ArrayList<>();
        this.groups = new ArrayList<>();

    }

    public List<Post> getPosts() {
        return posts;
    }
    public List<Group> getGroups() {
        return groups;
    }

    public void setPost(Post post) {
        posts.add(post);
    }

    public void setGroups(Group group) {
        groups.add(group);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
}
