/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaalumnes;

import java.util.Scanner;

public class ProgramaAlumnes {

  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    GestioFitxer g= new GestioFitxer();
    Alumne alumnes[] = new Alumne[20];
    int quants=g.llegeix(alumnes);
    // Aquí va el vostre codi
    
    int opcio=0;
    
    
    while (opcio !=8){
    System.out.println(" ");
    System.out.println("Escull la opció que vulguis: \n"
            + "  1- Afegir un nou alumne \n"
            + "  2- Mostrar llista dels noms dels alumnes \n"
            + "  3- Afegir notes de les tres UF \n"
            + "  4- Afegir una nota a un alumne  \n"
            + "  5- Mostar les notes de la clase \n"
            + "  6- Eliminar un alumne \n"
            + "  8- Guardar les dades");
    
        opcio = lector.nextInt();
        switch(opcio){
            case 1: 
                Alumne alumne = new Alumne();
                System.out.println("Nom: ");
                alumne.nom = lector.next();
                System.out.println("Cognoms: ");
                alumne.cognoms = lector.next();
                alumnes[quants] = alumne;
                quants++;
                break;
            case 2:
                for (int i = 0; i < quants; i++) {
                    System.out.println((i+1)+": " + alumnes[i].nom + " " +alumnes[i].cognoms);
                }
                
                break;
            case 3:
                System.out.println("Quin alumne vols veure? ");
                int numAlumne = lector.nextInt();
                for (int i = 0; i < alumnes[0].notes.length; i++) {
                    System.out.println("nota "+(i+1)+": ");
                    alumnes[numAlumne-1].notes[i]=lector.nextDouble();
                }
                break;
                
            case 4:
                System.out.println("A quin alumne vols afegir una nota? ");
                numAlumne = lector.nextInt();
                System.out.println("Quina nota vols afegir? \n"
                    + "         1- UF1\n"
                    + "         2- UF2\n"
                    + "         3- UF3");
                int notaUf = lector.nextInt();
                System.out.print("nota: ");
                alumnes[numAlumne-1].notes[notaUf-1] = lector.nextDouble();
                
                break;
            
            case 5:
                //System.out.println("         Alumne |  UF1  | UF2  | UF3  |");
                for (int i = 0; i < quants; i++) {
                    System.out.print((i+1)+": "+alumnes[i].nom + " "+ alumnes[i].cognoms + ":  ");
                    for (int j = 0; j < alumnes[i].notes.length; j++) {
                       System.out.print(" "+alumnes[i].notes[j]+" ");
                    }
                    System.out.println(" ");
                }
                break;
                
            case 6:
                System.out.println("Quin alumne vols eliminar? ");
                numAlumne = lector.nextInt();
                for (int i = numAlumne; i < quants; i++) {
                    alumnes[i-1] = alumnes[i];
                }
                quants--;
                break;
            
            case 7: 
                double notaMit1 = 0.0;
                for (int i = 0; i < alumnes[0].notes.length; i++) {
                    for (int j = 0; j < quants; j++) {
                        notaMit1 = notaMit1+alumnes[j].notes[i];
                    }
                notaMit1 = notaMit1 / alumnes[0].notes.length;
                }
                System.out.printf("nota mitjana UF1: %.2f ",notaMit1);
                break;
            case 8:
                System.out.println("Dades guardades!");
                break;

            default:
                System.out.println("Opció errònea");
        }
    
    }  
    
    // Aquí va el vostre codi
    g.escriu(alumnes, quants);
  }
}
