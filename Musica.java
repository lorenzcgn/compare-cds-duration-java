/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica;
import java.util.Scanner;
/**
 *
 * @author 72873486
 */
public class Musica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);  
        
        String autore= s.next();
        String titolo= s.next();
        int numeroBrani=s.nextInt();
        double durata= s.nextDouble();
        double durata2 = s.nextDouble();
        
        Cd hit2004 = new Cd(titolo, autore, numeroBrani, durata);
        hit2004.comparaDurata(durata2);
    }
    
}
