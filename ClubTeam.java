import java.util.ArrayList;

public class ClubTeam {
    private String name;
    private ArrayList<Player> players;
    private Stadium stadium; // nuevo atributo

    public ClubTeam(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.stadium = null; // inicialmente sin estadio asignado
    }

    public String getName() { return name; }

    // Método signPlayer para fichar jugadores
    public void signPlayer(Player player) {
        players.add(player);
        System.out.println("El jugador " + player.getName() + " ha sido fichado por el club " + name);
    }

    // Método para asignar estadio
    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
        System.out.println("El club " + name + " jugará en el estadio " + stadium.getName());
    }

    // Mostrar plantilla y estadio
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
}

    public String getName() {
        return name;
    }
}
