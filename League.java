import java.util.ArrayList;

public class League {
    private String name;
    private ArrayList<FootballTeam> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    // Método para agregar equipos
    public void addTeam(FootballTeam team) {
        teams.add(team);
    }

    // Método para mostrar la clasificación
    public void showStandings() {
        System.out.println("Clasificación de la liga: " + name);
        for (int i = 0; i < teams.size(); i++) {
            System.out.println((i + 1) + ". " + teams.get(i).getName());
        }
    }
}
