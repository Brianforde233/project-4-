import java.util.Scanner;
/**.
* Project 4 Octahedron App
*@author Brian Forde
*@version 9/17/20
*/
public class OctahedronApp {
/**
*@param args  not used.
*/
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label, color, and edge length for an "
         + "octahedron.");
      System.out.print("\tlabel: ");
      String label = scan.nextLine();
   
      System.out.print("\tcolor: ");
      String color = scan.nextLine();
   
      System.out.print("\tedge: ");
      double edge = scan.nextDouble();
   
      if (edge > 0) {
         Octahedron octa; 
         octa = new Octahedron(label, color, edge);
         System.out.println("\n" + octa.toString());
      } else { 
         System.out.println("Error: edge must be non-negative.");
      
      }
   }
}