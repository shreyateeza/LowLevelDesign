package LLD2.Builder;

public class Main {
    public static void main(String[] args){
        Student s = Student.builder()
                .universityName("NSUT")
                .phoneNumber("0987654321")
                .age(26)
                .id(32)
                .gradYear(2021)
                .name("Asha")
                .build();

        System.out.println(s);
    }
}
