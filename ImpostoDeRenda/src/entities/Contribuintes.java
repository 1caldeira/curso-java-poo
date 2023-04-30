package entities;

public abstract class Contribuintes {
    private String name;
    private Double yEarnings;

    public Contribuintes(){}

    public Contribuintes(String name, Double yEarnings) {
        this.name = name;
        this.yEarnings = yEarnings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getyEarnings() {
        return yEarnings;
    }

    public void setyEarnings(Double yEarnings) {
        this.yEarnings = yEarnings;
    }

    public double taxes(){
        return 0;
    }
}
