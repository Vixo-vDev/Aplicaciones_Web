import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Consultar consultar = new Consultar();
        int opc;
        double dinero;
        do{
            System.out.println("========================================");
            System.out.println("Bienvenido al sistema :D");
            System.out.println("1. Depositar");
            System.out.println("2. Consultar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("ELije una opciòn: ");
            opc = read.nextInt();

            switch(opc) {
                case 1:
                    System.out.println("Ingresa el valor a de depositar: ");
                    break;
                case 2:
                    double saldo1 = consultar.getSaldo();
                    consultar.consultarSaldo(saldo1);
                    break;

                case 3:
                    System.out.println("Ingresa el valor a retirar: ");
                    double retirar = read.nextDouble();
                    dinero = banco.getCantidad() - retirar;
                    banco.setCantidad(dinero);
                    break;
            }
        }while(opc != 4);
        System.out.println("Has salido correctamente del sistema");
    }
    }
}