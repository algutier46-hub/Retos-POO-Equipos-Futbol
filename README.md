# Retos-POO-Equipos-Futbol
Retos de Programación Orientada a Objetos centrados en equipos de fútbol. Autores: alexander gutierrez, Grey Cuellar, Daniel Sandobal.
Proyecto: Sistema de Gestión de Fútbol con POO en Java
Este proyecto implementa un sistema básico de gestión de fútbol utilizando Programación Orientada a Objetos (POO) en Java. Se aplican conceptos de herencia, composición y encapsulamiento, organizando las clases en un diseño modular y funcional.

# Objetivos del proyecto
Aplicar herencia mediante una clase padre (Person) y clases hijas (Player, Coach).

Implementar composición en clases como FootballTeam, ClubTeam, Match y League.

Crear un Main interactivo que permita al usuario elegir qué desea hacer (crear jugador, entrenador, equipo, estadio o partido).

Demostrar el uso de métodos propios en cada clase (crearJugador, crearCoach, etc.) para mantener el Main limpio y delegar responsabilidades.

1. Person.java (Clase Padre)
Atributos: name, age.

Rol: Clase base que define características comunes de las personas en el sistema.

Herencia: Player y Coach extienden de Person.

2. Player.java (Clase Hija)
Hereda de: Person.

Atributos: position, retired, goals, assists.

Métodos principales:

addGoal(), addAssist() → actualizan estadísticas.

transfer() → simula transferencia a otro equipo.

retire() → marca al jugador como retirado y muestra estadísticas finales.

crearJugador() → método estático para crear jugadores desde el menú.

3. Coach.java (Clase Hija)
Hereda de: Person.

Atributos: experienceYears.

Métodos principales:

giveInstructions() → muestra la táctica indicada por el entrenador.

crearCoach() → método estático para crear entrenadores desde el menú.

4. FootballTeam.java
Atributos: name, players, coach, trophies.

Métodos principales:

addPlayer(), hireCoach() → agregan jugadores y entrenador.

showRoster() → muestra plantilla completa.

compareTeams() → compara equipos por trofeos.

crearEquipo() → método estático para crear equipos desde el menú.

5. ClubTeam.java
Atributos: name, players, stadium.

Métodos principales:

signPlayer() → ficha jugadores.

setStadium() → asigna estadio al club.

showRoster() → muestra plantilla y estadio.

crearClubConEstadio() → método estático para crear club con estadio desde el menú.

6. Stadium.java
Atributos: name, capacity, location.

Métodos principales:

toString() → muestra información del estadio.

7. Match.java
Atributos: team1, team2.

Métodos principales:

play() → simula partido con resultado aleatorio.

crearPartido() → método estático para crear partido desde el menú.

8. League.java
Atributos: name, teams.

Métodos principales:

addTeam() → agrega equipos a la liga.

showStandings() → muestra clasificación según trofeos.

9. Main.java
Rol: Punto de entrada del programa.

Funcionalidad:

Muestra un menú interactivo con opciones:

Crear jugador

Crear entrenador

Crear equipo

Crear club con estadio

Crear partido

Salir

Cada opción delega a los métodos crearX() de las clases correspondientes.

# Conceptos aplicados
Herencia: Person → Player, Coach.

Composición:

FootballTeam contiene Player y Coach.

ClubTeam contiene Stadium.

Match contiene dos FootballTeam.

League contiene varios FootballTeam.

Encapsulamiento: atributos privados con getters y métodos públicos.

Responsabilidad única: cada clase se encarga de su propia creación y lógica.
