package singleton;

public class LibraryApp {

    public static void main(String[] args) {
        DBConnection connection1 = DBConnection.getInstance();

        System.out.println("Did some work");

        DBConnection connection2 = DBConnection.getInstance();

        System.out.println("Did more work");
    }
}
