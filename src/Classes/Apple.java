package Classes;

class Apple {

    private double weight;
    private Variety variety;

    public Apple(double weight, Variety variety) {
        this.weight = weight;
        this.variety = variety;
    }

    public Apple() {

    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", variety=" + variety +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public Variety getVariety() {
        return variety;
    }
}
