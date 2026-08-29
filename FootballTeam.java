import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private ArrayList<Player> players;
    private Coach coach;
    private int trophies; // atributo para contar trofeos

    public FootballTeam(String name, int trophies) {
        this.name = name;
        this.players = new ArrayList<>();
        this.coach = null;
        this.trophies = trophies;
    }

    public String getName() { return name; }
    public int getTrophies() { return trophies; }

    // Método para agregar jugadores
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Método para eliminar jugadores por nombre
    public void removePlayer(String playerName) {
        players.removeIf(p -> p.getName().equalsIgnoreCase(playerName));
    }

    // Método para mostrar la plantilla completa
    public void showRoster() {
        System.out.println("Equipo: " + name);
        System.out.println("Trofeos: " + trophies);
        if (coach != null) {
            System.out.println(coach);
        } else {
            System.out.println("Sin entrenador asignado");
        }
        for (Player p : players) {
            System.out.println(p);
        }
    }

    // Método para contratar entrenador
    public void hireCoach(Coach coach) {
        this.coach = coach;
        System.out.println("El equipo " + name + " ha contratado al entrenador " + coach.getName());
    }

    // Método para comparar equipos por trofeos
    public static void compareTeams(FootballTeam team1, FootballTeam team2) {
        System.out.println("Comparando trofeos entre " + team1.getName() + " y " + team2.getName());
        if (team1.getTrophies() > team2.getTrophies()) {
            System.out.println("El equipo más exitoso es: " + team1.getName());
        } else if (team2.getTrophies() > team1.getTrophies()) {
            System.out.println("El equipo más exitoso es: " + team2.getName());
        } else {
            System.out.println("Ambos equipos tienen el mismo número de trofeos.");
        }
    }
}
    public void hireCoach(Coach coach) {
        this.coach = coach;
        System.out.println("El equipo " + name + " ha contratado al entrenador " + coach.getName());
    }
}
