package SosialMedia;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private  long groupID;
    private String name;
    private List<User> members;
    private User admin;
    public Group() {

        this.members = new ArrayList<>();

    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }


    public void addMember (User user){
        members.add(user);
    }
    public void removeMember (){

    }
    public void assignAdmin (){

    }

}
