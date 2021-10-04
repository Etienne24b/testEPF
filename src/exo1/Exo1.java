//buteau etienne, ,apprendre java, 29/09/21
 
package exo1;

import java.util.Scanner;

/**
 *
 * @author bulte
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        System.out.println("bonjour");
        prenom = sc.nextLine();  
        System.out.println("Au revoir "+ prenom);
    }
    
}
