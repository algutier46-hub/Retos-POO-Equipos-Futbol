import java.util.Random;

public class Match {
    private FootballTeam team1;
    private FootballTeam team2;

    public Match(FootballTeam team1, FootballTeam team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    // Método play que simula un partido
    public void play() {
        Random random = new Random();
        int score1 = random.nextInt(5); // goles aleatorios entre 0 y 4
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
}
