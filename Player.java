import java.util.Scanner;

public class Player extends Person {
    private String position;
    private boolean retired;
    private int goals;
    private int assists;

    public Player(String name, int age, String position) {
        super(name, age);
        this.position = position;
        this.retired = false;
        this.goals = 0;
        this.assists = 0;
    }

    public void retire() {
        retired = true;
        System.out.println("El jugador " + name + " se ha retirado.");
        System.out.println("Estadísticas finales: " + goals + " goles, " + assists + " asistencias.");
    }

    @Override
    public String toString() {
        return name + " (" + position + ", " + age + " años)" + (retired ? " [RETIRADO]" : "");
    }

    // Método estático para creación interactiva
    public static void crearJugador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Posición: ");
        String posicion = sc.nextLine();

        Player jugador = new Player(nombre, edad, posicion);
        System.out.println(" Jugador creado: " + jugador);
    }
}
