package SosialMedia;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.ArrayList;

public class LoginService {
    public LoginService() {

        this.users = new ArrayList<>(); // Listeyi başlatmak için bu satırı ekleyin.
    }
    public List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean  login(String username,String password){
        for (int i = 0; i < users.size(); i++) {
            return Objects.equals(users.get(i).getUsername(), username) && Objects.equals(users.get(i).getPassword(), password);
        }
        return false;
    }
    public boolean  register(String username,String password,String passwordr){

        Random random = new Random();
        int randomNumber = random.nextInt(1000000);
        if(Objects.equals(password, passwordr)){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setUserID(randomNumber);
            System.out.println(user.toString());
            users.add(user);
            return  true;
        }
        return false;

    }

}
