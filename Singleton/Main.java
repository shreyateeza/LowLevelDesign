package LLD2.Singleton;

public class Main {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
        Singleton s3 = Singleton.getInstance();
        System.out.println(s3);

        SingletonAdv sa1 = SingletonAdv.getInstance();
        System.out.println(sa1);
        SingletonAdv sa2 = SingletonAdv.getInstance();
        System.out.println(sa2);
        SingletonAdv sa3 = SingletonAdv.getInstance();
        System.out.println(sa3);
    }
}
