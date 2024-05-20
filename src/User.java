public class User {
    public int id;
    public String name;
    public String surname;
    public String email;
    public int password;

    public User(int id, String name, String surname, String email, int password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}
