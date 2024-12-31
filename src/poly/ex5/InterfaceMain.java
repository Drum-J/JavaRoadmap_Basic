package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        animalAction(new Dog());
        animalAction(new Cat());
        animalAction(new Cow());
    }

    private static void animalAction(InterfaceAnimal animal) {
        animal.move();
        animal.sound();
    }
}
