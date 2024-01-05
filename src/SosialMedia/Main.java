package SosialMedia;

import java.util.*;

public class Main {
    public static void showMenu(){
        System.out.println("Welcome to the Social Network Console Application!");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    };
    public static void userMenu(){
        System.out.println("User Menu");
        System.out.println("1. Group Management");
        System.out.println("2. Post Management");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");
    };
    public static void groupManagement(){
        System.out.println("1. Create Group");
        System.out.println("2. View Groups");
        System.out.println("3. Join Group");
        System.out.print("Enter your choice: ");
    };
    public static void postManagement(){
        System.out.println("1. Create Post");
        System.out.println("2. View My Posts");
        System.out.print("Enter your choice: ");
    };




    public static void main(String[] args) {

        List<Group> groups  = new ArrayList<>();
        List<Post> posts  = new ArrayList<>();

        User currentUser = new User();

        Scanner scanner = new Scanner(System.in);

        showMenu();
        LoginService loginService = new LoginService();


        boolean menuloop = true;

        while (menuloop){
            int operation = scanner.nextInt();
            switch(operation) {
                case 1:
                    System.out.println("1. Username");
                    String register_username = scanner.next();
                    System.out.println("1. Password");
                    String register_password = scanner.next();
                    System.out.println("1. Accept Password");
                    String register_passwordr = scanner.next();
                    boolean register_result = loginService.register(register_username,register_password,register_passwordr);
                    if(register_result){
                        System.out.println("Qeydiyyat Tamamlandi");
                    }
                    else{
                        System.out.println("Bir problem yasandi");
                    }
                    showMenu();
                    break;
                case 2:
                    System.out.println("1. Username");
                    String login_username = scanner.next();
                    System.out.println("1. Password");
                    String login_password = scanner.next();
                    boolean login_result = loginService.login(login_username,login_password);
                    if(login_result){
                        userMenu();
                        boolean userLoop = true;
                        int user_operation = scanner.nextInt();
                        while (userLoop){
                            switch(user_operation) {
                                case 1:
                                    groupManagement();
                                    boolean group_loop = true;

                                    while(group_loop){
                                        int group_operation = scanner.nextInt();
                                        switch(group_operation) {
                                            case 1:
                                                // Create Group
                                                System.out.println("Group Name");
                                                String group_name = scanner.next();
                                                Random random = new Random();
                                                int randomNumber = random.nextInt(1000000);
                                                Group group = new Group();
                                                group.setName(group_name);
                                                group.setGroupID(randomNumber);
                                                group.setAdmin(loginService.getCurrentUser());
                                                group.addMember(loginService.getCurrentUser());
                                                loginService.getCurrentUser().setGroups(group);
                                                groups.add(group);
                                                System.out.println("Group Created !");
                                                groupManagement();
                                                // code block
                                                break;
                                            case 2:
                                                System.out.println("Groups");
                                                 // Views Group
                                                for (int i = 0; i < groups.size(); i++) {
                                                    System.out.println(i + 1 + "Group ID  " + groups.get(i).getGroupID() +   "Group Name   " + groups.get(i).getName());

                                                }

                                                break;
                                            default:
                                                // code block
                                        }
                                    }
                                    break;
                                case 2:
                                    postManagement();
                                    boolean post_loop = true;
                                    while(post_loop){
                                        int post_operation = scanner.nextInt();
                                        switch(post_operation) {
                                            case 1:
                                                System.out.println("Post Content");
                                                String post_content = scanner.next();
                                                Random random = new Random();
                                                int randomNumber = random.nextInt(1000000);
                                                Post post = new Post();
                                                post.setContent(post_content);
                                                post.setPostId(randomNumber);
                                                post.setAuthor(loginService.getCurrentUser());
                                                loginService.getCurrentUser().setPost(post);
                                                posts.add(post);
                                                System.out.println("Post Created !");
                                                postManagement();

                                                break;
                                            case 2:
                                                System.out.println("Posts");
                                                // Views Group
                                                for (int i = 0; i < loginService.getCurrentUser().getPosts().size(); i++) {
                                                    System.out.println(i + 1 + "      Post ID  " + loginService.getCurrentUser().getPosts().get(i).getPostId() + " Post Content   " + loginService.getCurrentUser().getPosts().get(i).getContent());
                                                }
                                                break;
                                            default:
                                                // code block
                                        }
                                    }
                                    break;
                                case 3:
                                    userLoop = false;
                                    break;
                                default:
                                    // code block
                            }
                        }

                    }
                    else{
                        System.out.println("Bir problem yasandi");
                        showMenu();
                    }
                    break;
                case 3:
                    menuloop = false;
                    break;
                default:
                    // code block
            }
        }
    }
}