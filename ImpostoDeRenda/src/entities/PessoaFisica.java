package entities;

public class PessoaFisica extends Contribuintes{
    private Double healthExpenses;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double yEarnings, Double healthExpenses) {
        super(name, yEarnings);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double taxes(){
        if(getyEarnings() < 20000){
            return (getyEarnings() * 0.15) - (healthExpenses * 0.5);
        } else{
            return (getyEarnings() * 0.25) - (healthExpenses * 0.5);
        }
    }
}
