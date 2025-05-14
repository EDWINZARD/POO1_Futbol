import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);


  Player []team = new Player[11];

  System.out.println("Registro de jugadores:");

  for (int i = 0; i < 11; i++) {
   System.out.println("\nJugador #"+(i+1));

   System.out.println("Nombre:");
   String name= scanner.nextLine();

   System.out.println("dorsal:");
   int dorsal = scanner.nextInt();

   System.out.println("equipo:");
   String teamName = scanner.nextLine();

   System.out.println("posición:");
   String position = scanner.nextLine();

   System.out.print("peso (kg):");
   double weight = scanner.nextDouble();

   System.out.print("altura (m");
   double height = scanner.nextDouble();

   System.out.print("Fecha de nacimiento (AAA-MM-DD:");
   String date = scanner.nextLine();

   System.out.println("Nacionalidad:");
   String nationality = scanner.nextLine();

   System.out.print("¿esta activo? (true/false):");
   boolean isActive = scanner.nextBoolean();

   team[i] = new Player(name, dorsal, teamName, position, weight, height, nationality, isActive );

  }

  System.out.println("\n--- Lista del equipo---");
  for(Player player : team) {
   System.out.println(player);
   System.out.println(player.toString());
   System.out.println("------------------");

  }
  scanner.close();


 }
}