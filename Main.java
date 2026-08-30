import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Crear jugador");
            System.out.println("2. Crear entrenador");
            System.out.println("3. Crear equipo");
            System.out.println("4. Crear club con estadio");
            System.out.println("5. Crear partido");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> Player.crearJugador();
                case 2 -> Coach.crearCoach();
                case 3 -> FootballTeam.crearEquipo();
                case 4 -> ClubTeam.crearClubConEstadio();
                case 5 -> Match.crearPartido();
                case 0 -> System.out.println("👋 Saliendo del programa...");
                default -> System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
