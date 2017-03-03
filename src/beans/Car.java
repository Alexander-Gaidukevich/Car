package beans;

public abstract class Car {

    public String color;
    public double volume;
    public static double cost = 100;

    public Car(String color, double volume, double cost) {
        this.color = color;
        this.volume = volume;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public static double getDiscountCost() {
        return cost - (cost * 0.1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.volume, volume) != 0) return false;
        if (Double.compare(car.cost, cost) != 0) return false;
        return color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color.hashCode();
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", volume=" + volume +
                ", cost=" + cost +
                '}';
    }
}
