package beans;

public class MersedesCar extends Car {

    public double cost = 300;

    public MersedesCar(String color, double volume, double cost) {
        super(color, volume, cost);
    }

    @Override
    public double getDiscountCost() {
        return cost - (cost * 0.3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MersedesCar that = (MersedesCar) o;

        return Double.compare(that.cost, cost) == 0;
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
        return "MersedesCar{" +
                "cost=" + cost +
                '}';
    }
}
