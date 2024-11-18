public class Main {
    public static void main(String[] args) {
        Animal dog = createObject("Rex");
        Animal bird = createObject("Gena");
        Animal cat = createObject("Alex");

        Animal[] printable ={dog, bird, cat};

        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
            System.out.println();
        }
    }

    public static Animal createObject(String className) {
        switch (className) {
            case "Rex":
                return new Dog("Rex", 10, "Gav-gav");
            case "Gena":
                return new Bird("Gena", 2, "Whip-whip");
            case "Alex":
                return new Cat("Alex", 3, "Meow-meow");
            default:
                System.out.println("Invalid class name");
                return null;
        }
    }
}