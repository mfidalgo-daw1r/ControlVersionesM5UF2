/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaalumnes;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class prova {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nomproductes[] = {
            "1.LIFE TRANSFER FACTOR PLUS 90 TBS",
            "2.AHAVA DERMUD BODY MILK 250 ml.",
            "3.AB SOLUTION PLUS 240ml",
            "4.AHAVA DERMUD CR.HUMECTANT CALMANT 50 ML SPF15",
            "5.ABRASONE RECTAL crema 30 gr.",
            "6.ABRAXANE 100mg 1vial 50ml",
            "7.ACID HYALURONIC 20MG 30CAPS",
            "8.ACID HYALURONIC 60MG 30CAPS TRIPLE STRENGTH",
            "9.ACIDOPHILUS PLUS 60caps",
            "10.ACOMPLIA 20mg 28 tabs",
            "11.ACT eau dentaire fluor classic cinnamon fl 400 ml",
            "12.ACTOVEGIN 10 ML 5 AMP",
            "13.ACTOVEGIN FORTE 200 mg 100 dragees",
            "14.ACTOVEGIN INJ. 5 X 5 ML",
            "15.ADRENALIN 1:1000 ( 1mg/ ml ) 10x1 ml",
            "AHAVA DERMUD CREMA CORPORAL 200 ML.",
            "AHAVA DERMUD CREMA MANS 125 ML",
            "AETHOXYSKLEROL 0.25% 5Ampo 2ml",
            "AETHOXYSKLEROL 0.5% 5 Ampo 2ml",
            "NIVEA FOR MEN",
            "AETHOXYSKLEROL 1% 30 ml VIAL",
            "AETHOXYSKLEROL 1% 5x2ml",
            "AETHOXYSKLEROL 2% 5x2ml",
            "AETHOXYSKLEROL 3% 5 Amp 2ml",
            "AETHOXYSKLEROL 4% 5x2ml",
            "AGGRENOX  200/25mg 60 caps",
            "AGIOCUR Granulat 250g",
            "AGIOLAX MITE 1000gr",
            "AHAVA CREMA CORPORAL VAINILLA 300 GR.",
            "AHAVA DERMUD CREMA COLZES I GENOLLS 75 ml.",
            "AHAVA DERMUD CREMA NUTRITIVA 50 ML"};
        
        String x = "";
        for (int i = 0; i < nomproductes.length; i++) {
            for (int j = 0; j < nomproductes.length; j++) {
                if (nomproductes[i].compareTo(nomproductes[j]) < 0) {
                    x= nomproductes[i];
                    nomproductes[i]= nomproductes[j];
                    nomproductes[j]=x;
                    
                }
            }
        }
        for (int i = 0; i < nomproductes.length; i++) {
            System.out.println(nomproductes[i]);
            System.out.println("hola");
        }

    /* System.out.println("Quina paraula vols buscar? ");
        String paraula = lector.nextLine();
        int i = 0, j = 0;
        String[] exists = new String[5];
        while (i < nomproductes.length - 1) {
                if (nomproductes[i].contains(paraula)) {
                exists[0] = nomproductes[i];
                j++;
            }
            i++;
        }
        if (i == nomproductes.length - 1 ) {
            System.out.println("No hi ha cap producte amb la descripció introduida");
            
        } else {
            for (int k = 0; k < nomproductes.length; k++) {
                System.out.println(exists[k]);
            }
        }
//case 7: //Filtrar noms de productes (buscar per Strings)
                   /* lector.nextLine();
                    System.out.println("Quina paraula vols buscar? ");
                    String paraula = lector.nextLine();
                    System.out.println("Els productes que contenen " + paraula + " son: ");
                    for (int i = 0; i < quants; i++) {
                        if (productes[i].nom.contains(paraula)) {
                            System.out.println("  -" + productes[i].nom);
                        }
                    }
     */
}

}
