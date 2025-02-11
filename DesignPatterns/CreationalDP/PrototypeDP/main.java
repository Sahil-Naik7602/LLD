public class main {
    public static void main(String[] args) {
        Car car = new Car("TATA",100,2);
        Car newCar = (Car) car.clone();
        car.setEngines(3);
        System.out.println(car.toString());
        System.out.println(newCar.toString());

    }
}
