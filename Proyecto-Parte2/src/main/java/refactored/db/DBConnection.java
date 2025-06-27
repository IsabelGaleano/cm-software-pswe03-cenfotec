package refactored.db;

import refactored.constants.DBMessages;
import refactored.interfaces.ILogger;

public class DBConnection {
    private final ILogger logger;

    public DBConnection(ILogger logger) {
        this.logger = logger;
    }

    public void connect(String database) {
        logger.log(DBMessages.CONNECTING + database);
    }

    public void query(String query) {
        logger.log(DBMessages.QUERYING + query);
    }

    public void disconnect(String database) {
        logger.log(DBMessages.DISCONNECTING + database);
    }
}