import java.util.Scanner;

public class Hombre {
    Scanner teclado=new Scanner(System.in);

    private String nombre;

    public Hombre() {
    }

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void jugarConRobot(Robot robot){
        int opc;
        do {
            System.out.println("""
                1)Avanzar
                2)Retroceder
                3)Ver el nivel de energia
                4)Dormir robot
                5)Despertar robot
                6)Recargar bateria""");
            opc=teclado.nextInt();
            switch (opc){
                case 1->{
                    int i = 0;
                    robot.avanzar(i);
                }
                case 2->{
                    int i=0;
                    robot.retroceder(i);
                }
                case 3->{
                    robot.energiaActual();
                }
                case 4->{
                    robot.dormir();
                }
                case 5->{
                    robot.despertar();
                }
                case 6->{
                    robot.recargar();
                }default -> System.out.println("***OPCION INCORRECTA***");
            }
        }while (robot.dormir());
    }
}
