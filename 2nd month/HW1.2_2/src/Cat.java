public class Cat extends Animal{
    String  meow;

    public Cat(String name, int age, String meow) {
        super(name, age);
        this.meow = meow;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Ability: " + meow);
    }
}
