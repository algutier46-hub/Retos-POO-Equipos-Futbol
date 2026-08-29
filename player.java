public class Player {
    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }

    # Nuevo método transfer 
    public void transfer(String teamName) {
        System.out.println(name + " ha sido transferido al equipo " + teamName);
    }

    @Override
    public String toString() {
        return name + " (" + position + ", " + age + " años)";
    }
}
