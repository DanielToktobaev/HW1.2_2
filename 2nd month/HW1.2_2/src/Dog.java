public class Dog extends Animal{
    String bark;


    public Dog(String name, int age, String bark) {
        super(name, age);
        this.bark = bark;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Ability: " + bark);
    }
}
