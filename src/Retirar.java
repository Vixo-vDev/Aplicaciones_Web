public class Retirar {

    private double saldoRetirar;

    public void setSaldoRetirar(double saldoRetirar) {
        this.saldoRetirar = saldoRetirar;
    }

    public double retirar(double saldo){
        double total = 0;
        if(saldo<saldoRetirar){
            System.out.println("No cuentas con saldo suficiente");
        }else{
            System.out.println("Operacion exitosa");
            total = saldo - saldoRetirar;
        }
        return  total;
    }
}
