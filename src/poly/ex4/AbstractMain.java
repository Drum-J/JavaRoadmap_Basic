package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        //추상 클래스 생성 불가
        AbstractAnimal abstractAnimal = new AbstractAnimal() {
            @Override
            public void sound() {
                System.out.println("이렇게 하면 사실 생성해서 사용할 수 있긴 함");
            }

            @Override
            public void move() {
                System.out.println("대신 override가 필요한 메서드를 다 작성해줘야 한다.");
            }
        };
        soundAnimal(abstractAnimal);
        moveAnimal(abstractAnimal);

        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }
}
