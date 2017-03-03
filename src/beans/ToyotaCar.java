package beans;

public class ToyotaCar extends Car {
    public final static String marca = "Toyota";
    public double cost = 200;

    public ToyotaCar(String color, double volume, double cost) {
        super(color, volume, cost);
    }

    @Override
    public double getDiscountCost() {
        return cost - (cost * 0.2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ToyotaCar toyotaCar = (ToyotaCar) o;

        return Double.compare(toyotaCar.cost, cost) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ToyotaCar{" +
                "cost=" + cost +
                '}';
    }
}
