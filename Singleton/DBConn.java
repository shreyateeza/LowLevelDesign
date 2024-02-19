package LLD2.Singleton;

public class DBConn {
    private int noOfConn;
    private final int limit = 10;
    private static DBConn instance;

    private DBConn(){
    }

    public static DBConn getDBConnObject(){
        if(instance == null){
            instance = new DBConn();
        }
        return instance;
    }

    public boolean connect(){
        if(noOfConn < limit){
            noOfConn++;
            return true;
        }
        return false;
    }
}
