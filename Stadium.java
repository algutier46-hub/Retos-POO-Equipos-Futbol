public class Stadium {
    private String name;
    private int capacity;
    private String location;

    public Stadium(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return "Estadio: " + name + " | Capacidad: " + capacity + " | Ubicación: " + location;
    }
}
