import java.util.Scanner;
import java.util.ArrayList;

public class ClubTeam {
    private String name;
    private ArrayList<Player> players;
    private Stadium stadium;

    public ClubTeam(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.stadium = null;
    }

    public void signPlayer(Player player) {
        players.add(player);
        System.out.println("El jugador " + player.getName() + " ha sido fichado por el club " + name);
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
        System.out.println("El club " + name + " jugará en el estadio " + stadium.getName());
    }

    public void showRoster() {
        System.out.println("Plantilla del club: " + name);
        if (stadium != null) {
            System.out.println(stadium);
        } else {
            System.out.println("Sin estadio asignado");
        }
        for (Player p : players) {
            System.out.println(p);
        }
    }

  
    public static void crearClubConEstadio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del club: ");
        String nombreClub = sc.nextLine();
        System.out.print("Nombre del estadio: ");
        String nombreEstadio = sc.nextLine();
        System.out.print("Capacidad del estadio: ");
        int capacidad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ubicación del estadio: ");
        String ubicacion = sc.nextLine();

        ClubTeam club = new ClubTeam(nombreClub);
        Stadium estadio = new Stadium(nombreEstadio, capacidad, ubicacion);
        club.setStadium(estadio);

        System.out.print("Nombre del jugador a fichar: ");
        String nombreJugador = sc.nextLine();
        System.out.print("Edad del jugador: ");
        int edadJugador = sc.nextInt();
        sc.nextLine();
        System.out.print("Posición del jugador: ");
        String posicion = sc.nextLine();

        Player jugador = new Player(nombreJugador, edadJugador, posicion);
        club.signPlayer(jugador);

        System.out.println(" Club creado con estadio y jugador:");
        club.showRoster();
    }
}
