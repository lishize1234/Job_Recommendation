package com.laioffer.job.db;

public class MySQLDBUtil {
    private static final String INSTANCE = YOUR_OWN_PATH;
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "Jobproject";
    private static final String USERNAME = YOUR_USER;
    private static final String PASSWORD = YOUR_PASSWORD;
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";

}
