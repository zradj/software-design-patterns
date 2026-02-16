package main.singleton;

public class DBConnection {

    private DBConnection() {
        System.out.println("Connected to the DB!");
    }

    private static final class DBConnectionInstanceHolder {
        private static final DBConnection INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance() {
        return DBConnectionInstanceHolder.INSTANCE;
    }
}
