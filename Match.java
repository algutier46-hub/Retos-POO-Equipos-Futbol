import java.util.Scanner;
import java.util.Random;

public class Match {
    private FootballTeam team1;
    private FootballTeam team2;

    public Match(FootballTeam team1, FootballTeam team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void play() {
        Random random = new Random();
        int score1 = random.nextInt(5);
        int score2 = random.nextInt(5);

        System.out.println("Partido: " + team1.getName() + " vs " + team2.getName());
        System.out.println("Resultado: " + team1.getName() + " " + score1 + " - " + score2 + " " + team2.getName());

        if (score1 > score2) {
            System.out.println("Ganador: " + team1.getName());
        } else if (score2 > score1) {
            System.out.println("Ganador: " + team2.getName());
        } else {
            System.out.println("Empate");
        }
    }

    // Método estático para creación interactiva
    public static void crearPartido() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del primer equipo: ");
        String nombre1 = sc.nextLine();
        System.out.print("Trofeos del primer equipo: ");
        int trofeos1 = sc.nextInt();
        sc.nextLine();

        FootballTeam equipo1 = new FootballTeam(nombre1, trofeos1);

        System.out.print("Nombre del segundo equipo: ");
        String nombre2 = sc.nextLine();
        System.out.print("Trofeos del segundo equipo: ");
        int trofeos2 = sc.nextInt();
        sc.nextLine();

        FootballTeam equipo2 = new FootballTeam(nombre2, trofeos2);

        Match partido = new Match(equipo1, equipo2);
        partido.play();
    }
}
