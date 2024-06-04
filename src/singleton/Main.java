package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonDB db = SingletonDB.StartConnection();
        System.out.println(db.getcount());
        SingletonDB db2 = SingletonDB.StartConnection();
        System.out.println(db.getcount());


    }

}