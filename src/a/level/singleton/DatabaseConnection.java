package a.level.singleton;

public final class DatabaseConnection {

    private static DbStates state = DbStates.IDLE;
    private static DatabaseConnection databaseConnection;

    private DatabaseConnection() {
        this.state = DbStates.ACTIVE;
    }

    public static DatabaseConnection getInstance() {
        if (state == DbStates.IDLE) {
             databaseConnection = new DatabaseConnection();
             return databaseConnection;
        }
        return databaseConnection;
    }
}
