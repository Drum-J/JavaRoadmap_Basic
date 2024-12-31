package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        if (this.car == null) {
            System.out.println("첫 차 구매를 축하합니다! " + car);
        } else {
            System.out.println("차량 변경을 축하합니다! " + car);
        }

        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
