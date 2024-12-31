package poly.ex6;

import poly.ex5.InterfaceAnimal;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        //flyAnimal(dog); //Dog 는 Fly 를 impl 하지 않음
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    //Fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
