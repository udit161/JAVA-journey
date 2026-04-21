
public class Main {
    public static void main(String[] args) {
        String email = "Udit123@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        System.out.println(username);
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println(domain);
    }

}
