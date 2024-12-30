package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 메서드 오버라이딩 덕분에 각 객체의 sound() 가 호출된다.
        System.out.println("동물 소리 테스트 종료");
    }
}
