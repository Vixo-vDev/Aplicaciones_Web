public class Depositar {

    private double saldoDepositar;

    public void setSaldoDepositar(double saldoDepositar) {
        this.saldoDepositar = saldoDepositar;
    }

    public double depositar(double saldo){
        double total = 0;
        total = saldo + saldoDepositar;
        System.out.println("Depósito realizado exitosamente!");
        return total;
    }
}
