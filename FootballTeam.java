import java.util.Scanner;
import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private ArrayList<Player> players;
    private Coach coach;
    private int trophies;

    public FootballTeam(String name, int trophies) {
        this.name = name;
        this.players = new ArrayList<>();
        this.trophies = trophies;
    }

    public void addPlayer(Player player) { players.add(player); }
    public void hireCoach(Coach coach) { this.coach = coach; }

    public void showRoster() {
        System.out.println("Equipo: " + name + " | Trofeos: " + trophies);
        if (coach != null) System.out.println(coach);
        for (Player p : players) System.out.println(p);
    }

    // Método estático para creación interactiva
    public static void crearEquipo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del equipo: ");
        String nombre = sc.nextLine();
        System.out.print("Número de trofeos: ");
        int trofeos = sc.nextInt();
        sc.nextLine();

        FootballTeam equipo = new FootballTeam(nombre, trofeos);
        System.out.println("✅ Equipo creado: " + nombre + " con " + trofeos + " trofeos.");
        equipo.showRoster();
    }
}
