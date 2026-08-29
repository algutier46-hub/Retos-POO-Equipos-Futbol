public class Player {
    private String name;
    private int age;
    private String position;
    private boolean retired; // nuevo atributo
    private int goals;
    private int assists;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.retired = false;
        this.goals = 0;
        this.assists = 0;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
    public boolean isRetired() { return retired; }

    // Métodos para actualizar estadísticas
    public void addGoal() { goals++; }
    public void addAssist() { assists++; }

    // Método transfer
    public void transfer(String teamName) {
        System.out.println(name + " ha sido transferido al equipo " + teamName);
    }

    // Nuevo método retire
    public void retire() {
        retired = true;
        System.out.println("⚽ El jugador " + name + " se ha retirado.");
        System.out.println("📊 Estadísticas finales: " + goals + " goles, " + assists + " asistencias.");
    }

    @Override
    public String toString() {
        return name + " (" + position + ", " + age + " años)" + (retired ? " [RETIRADO]" : "");
    }
}

        return name + " (" + position + ", " + age + " años)";
    }
}
