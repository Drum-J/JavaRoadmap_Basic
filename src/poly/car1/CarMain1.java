package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(K3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(K3 -> Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //Driver의 코드는 변경하지 않고 NewCar를 새로 만들어 적용했다! OCP 원칙
        //NewCar(확장)은 열려있고(Open) Driver의 코드 수정은 닫혀있다(Close)
        //차량 변경(Model3 -> NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
