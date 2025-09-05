import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Consultar consultar = new Consultar();
        Retirar retirar = new Retirar();
        Depositar depositar = new Depositar();
        int opc;
        double dinero;
        do{
            System.out.println("========================================");
            System.out.println("                 BANCO                  ");
            System.out.println("========================================");
            System.out.println("Bienvenido al sistema :D");
            System.out.println("1. Depositar");
            System.out.println("2. Consultar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("ELije una opción: ");
            opc = read.nextInt();

            switch(opc) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("               DEPOSITAR                ");
                    System.out.println("========================================");
                    System.out.print("Ingresa el valor a depositar: $");
                    double depositarsaldo = read.nextDouble();
                    depositar.setSaldoDepositar(depositarsaldo);
                    consultar.setSaldo(depositar.depositar(consultar.getSaldo()));
                    break;
                case 2:
                    System.out.println("========================================");
                    System.out.println("               CONSULTAR                ");
                    System.out.println("========================================");
                    double saldo1 = consultar.getSaldo();
                    consultar.consultarSaldo(saldo1);
                    break;

                case 3:
                    System.out.println("========================================");
                    System.out.println("                 RETIRAR                ");
                    System.out.println("========================================");
                    double saldoactual = consultar.getSaldo();
                    System.out.print("Ingresa el valor a retirar: $");
                    double retirarSaldo = read.nextDouble();
                    retirar.setSaldoRetirar(retirarSaldo);
                    consultar.setSaldo(retirar.retirar(saldoactual));

                    break;

            }
        }while(opc != 4);
        System.out.println("Has salido correctamente del sistema");
    }
    }
