import java.util.Scanner;

public class Main {
    static Bank bank = new Bank();

    public static void main(String[] args) {

        while (true) {


            System.out.println("""
                    1 - Bankdaki ishcileri gor :
                    2 - Bankdaki spesifik ishcini gor :
                    3 - Banka user elave et :
                    4 - Useri update et :
                    5 - Useri sil :   
                    """);
            int choise = new Scanner(System.in).nextInt();
            switch (choise) {
                case 1:
                    showAllUser();
                    break;
                case 2:
                    showUserById();
                    break;
                case 3:
                    createUser();
                    break;
                case 4:
                    System.out.println("Update etmek istediyiniz id-ni daxil edin :");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println("Ishcinin adini daxil edin :");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Ishcinin soyadini daxil edin :");
                    String surname = new Scanner(System.in).nextLine();
                    System.out.println("Ishcinin mailini daxil edin :");
                    String email = new Scanner(System.in).nextLine();
                    System.out.println("Ishcinin passwordunu daxil edin :");
                    int password = new Scanner(System.in).nextInt();
                    bank.updateUserById(id, new User(id, name, surname, email, password));
                    break;
                case 5:
                    System.out.println("Remove  etmek istediyiniz Id-ni daxil edin :");
                    int removingId = new Scanner(System.in).nextInt();
                    bank.removeById(removingId);
                    break;

            }
        }
    }

    public static void createUser() {
        int id;
        for (int i = 0; ; i++) {
            System.out.println("Yeni ishcninin id-sini daxil edin :");
            id = new Scanner(System.in).nextInt();
            if (bank.users.length == 0) {
                bank.users = new User[2];
            }
            if (bank.users[i] != null && bank.users[i].id == id) {
                System.out.println(" bu Id-de Melumat daxil edilib!! Yeniden daxil edin ");
                return;
            }
            break;

        }

        System.out.println("Yeni ishcini adini daxil edin :");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Ishcinin soyadini daxil edin :");
        String surname = new Scanner(System.in).nextLine();
        System.out.println("Ishcinin emailini daxil edin :");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Ishcinin passwordunu daxil edin :");
        int password = new Scanner(System.in).nextInt();
        bank.addUser(new User(id, name, surname, email, password));
    }

    public static void showAllUser() {
        for (int i = 0; i < bank.getAllUser().length; i++) {
            if (bank.getAllUser()[i] != null) {
                System.out.println(bank.getAllUser()[i].toString());
            } else if (bank.getAllUser()[0] == null) {
                System.out.println("Ishci daxil edilmeyib !");
                break;
            }
        }
    }

    public static void showUserById() {
        System.out.println("Axtardiginiz  Id-ni daxil edin :");
        int id = new Scanner(System.in).nextInt();
        bank.getUserById(id);
    }

}
