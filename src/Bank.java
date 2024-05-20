import javax.swing.text.html.StyleSheet;
import java.util.Arrays;
import java.util.Scanner;

public class Bank {
    User[] users = new User[2];


    public void addUser(User user) {

        boolean hasNull = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                hasNull = true;
                break;
            }
        }
        if (hasNull == false) {
            User[] newUser = new User[users.length * 2];
            for (int j = 0; j < users.length; j++) {
                newUser[j] = users[j];
            }
            newUser[users.length] = user;
            users = newUser;
        }

    }

    public void updateUserById(int id, User user) {
        for(int i=0;i<users.length;i++){
            if(users[i]!=null&&id==users[i].id){
                users[i]=user;
            }else if(users[i]==null){
                System.out.println("Bele bir Id yoxdur !!");
                break;
            }
        }
    }

    public void removeById(int id) {

        int location = 0;

        if (users.length == 0) {
            System.out.println("Array bohsdur");
            return;
        }


        User[]  newUser = new User[users.length - 1];


        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].id == id) {
                location = i;
                break;
            }
        }

        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (i != location) {
                newUser[j] = users[i];
                j++;
            }
        }
        users= newUser;



        for(int i=0;i< newUser.length;i++){
            if(newUser[i]!=null)
            System.out.println(newUser[i].toString());
        }

    }

    public User[] getAllUser() {
        return users;
    }

    public User getUserById(int id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null&&users[i].id==id){
                System.out.println(users[i].toString());
            }

        }
        return null;
    }



    @Override
    public String toString() {
        return "Bank{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
