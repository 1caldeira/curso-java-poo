package entities;

public class PessoaJuridica extends Contribuintes {

        private Integer nEmployees;

        public PessoaJuridica() {
        }

        public PessoaJuridica(String name, Double yEarnings, Integer nEmployees) {
            super(name, yEarnings);
            this.nEmployees = nEmployees;
        }

        public Integer getnEmployees() {
            return nEmployees;
        }

        public void setnEmployees(Integer nEmployees) {
            this.nEmployees = nEmployees;
        }

    @Override
    public double taxes(){
        if(nEmployees <= 10){
            return (getyEarnings() * 0.16);
        } else{
            return (getyEarnings() * 0.14);
        }
    }
}


