package LLD1.LambdaStreams;

@FunctionalInterface
public interface Instructor<T>{
    void teach(int numberOfStudents, T batch);
}
