package LLD1.InheritanceAndPolymorphism;

public class Instructor extends User{
    public Instructor(String name, String email, String password) {
        super(name, email, password);
        System.out.println("Constructor inside Instructor");
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
