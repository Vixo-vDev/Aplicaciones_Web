public class Retirar {


    public double retirar(double saldo, double retirar){
        double total = 0;
        if(saldo<retirar){
            System.out.println("No cuentas con saldo suficiente");
        }else{
            System.out.println("Operacion exitosa");
            total = saldo - retirar;
        }
        return  total;
    }
}
