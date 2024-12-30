package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        //추상 클래스 생성 불가
        AbstractAnimal abstractAnimal = new AbstractAnimal() {
            @Override
            public void sound() {
                System.out.println("이렇게 하면 사실 생성해서 사용할 수 있긴 함 크크");
            }
        };
        soundAnimal(abstractAnimal);

        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        //System.out.println("동물 소리 테스트 시작");
        animal.sound();
        //System.out.println("동물 소리 테스트 종료");
    }
}
