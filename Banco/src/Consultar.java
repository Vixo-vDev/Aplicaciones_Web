public class Consultar {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo(double saldo){
        System.out.println("El saldo actual es: $" +saldo);
    }
}
