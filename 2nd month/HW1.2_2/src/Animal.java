public class Animal implements Printable{
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
