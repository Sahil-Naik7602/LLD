public class Car implements Prototype {
    private String model;
    int maxSpeed;
    int engines;

    public Car(String model, int maxSpeed, int engines) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engines = engines;
    }

    @Override
    public Object clone() {
        return new Car(this.model,this.maxSpeed,this.engines);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engines=" + engines +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }
}
