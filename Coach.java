public class Coach {
    private String name;
    private int experienceYears;

    public Coach(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() { return name; }
    public int getExperienceYears() { return experienceYears; }

    // Método give instructions
    public void giveInstructions(String tactic) {
        System.out.println("El entrenador " + name + " indica la táctica: " + tactic);
    }

    @Override
    public String toString() {
        return "Coach: " + name + " (" + experienceYears + " años de experiencia)";
    }
}
