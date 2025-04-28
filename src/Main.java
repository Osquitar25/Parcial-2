import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        List<Hombre>listhombre=new ArrayList<>();

        int opc;

        System.out.println("""
                1)Crear jugador
                2)Crear Robot
                3)Jugar""");
        opc=teclado.nextInt();

        switch (opc){
            case 1->{
                String nombre;

                System.out.println("Ingrese su nombre ");
                nombre=teclado.next();

            }
            case 2->{

            }
            case 3->{
                Hombre hombre=null;
                Robot Robot=null;
                Robot robot1 = null;
                hombre.jugarConRobot(Robot robot1);

            }default -> System.out.println("Opcion No valida");
        }

    }
}