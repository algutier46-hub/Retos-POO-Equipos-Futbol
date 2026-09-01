import java.util.Scanner;

public class Coach extends Person {
    private int experienceYears;

    public Coach(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Coach: " + name + " (" + experienceYears + " años de experiencia)";
    }

    
    public static void crearCoach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del entrenador: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Años de experiencia: ");
        int exp = sc.nextInt();
        sc.nextLine();

        Coach coach = new Coach(nombre, edad, exp);
        System.out.println("Entrenador creado: " + coach);
    }
}

}
