import java.util.ArrayList;

public class ClubTeam {
    private String name;
    private ArrayList<Player> players;

    public ClubTeam(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Método signPlayer para agregar un jugador
    public void signPlayer(Player player) {
        players.add(player);
        System.out.println("El jugador " + player.getName() + " ha sido fichado por el club " + name);
    }

    // Método para mostrar la plantilla
    public void showRoster() {
        System.out.println("Plantilla del club: " + name);
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public String getName() {
        return name;
    }
}
