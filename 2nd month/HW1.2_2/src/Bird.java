public class Bird extends Animal{
    String fly;

    public Bird(String name, int age, String fly) {
        super(name, age);
        this.fly = fly;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Ability: " + fly);
    }
}
