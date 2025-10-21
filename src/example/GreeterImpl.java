package example;

public class GreeterImpl implements Greeter {
    @Override
    public void greetLecturer(String name) {
        System.out.println("Hello, " + name);
    }
}
