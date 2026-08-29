import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private ArrayList<Player> players;
    private Coach coach; // nuevo atributo

    public FootballTeam(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.coach = null; // inicialmente sin entrenador
    }

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
        if (coach != null) {
            System.out.println(coach);
        } else {
            System.out.println("Sin entrenador asignado");
        }
        for (Player p : players) {
            System.out.println(p);
        }
    }

    // Nuevo método hireCoach
    public void hireCoach(Coach coach) {
        this.coach = coach;
        System.out.println("El equipo " + name + " ha contratado al entrenador " + coach.getName());
    }
}
