/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.chrysdev.triangedepascal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Chrysippe
 */
public class TriangeDePascal {

    public static void main(String[] args) {
        System.out.println("=== PROGRAMME DE GENERATION DU TRIANGLE DE PASCAL");
        int nbLignes = 0;
        boolean continuer = true;
        while(continuer)
        {
            System.out.print("Combien de lignes voulez-vous pour ce triangle? ");
            BufferedReader saisie = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                nbLignes = Integer.parseInt(saisie.readLine());
            }
            catch(IOException | NumberFormatException e)
            {
                System.out.println("Une erreur s'est produite, arret du programme....");
                continue;
            }
            if(nbLignes <1)
            {
                System.out.println("Le nombre entre est trop petit...");
            }
            else
                continuer = false;
            
        }
        System.out.println("Vous souhaitez donc voir " + nbLignes + " lignes.");
        System.out.println(".........");
        int [][] triangleP = new int [nbLignes][];
        for(int i = 0; i < triangleP.length; i++) //Boucle principale permettant de calculer
        {                                         //les differentes lignes du triangle.
            triangleP[i] = new int[i+1]; //Declaration d'une ligne
            for(int j = 0; j < triangleP[i].length; j++) //Boucle secondaire permettant de calculer
            {                                            //la valeur des differentes colonnes
                if(j == 0 || i == j)
                    triangleP[i][j] = 1; //la premiere colonne de chaque ligne ainsi que la derniere possèdent
                else                    //la valeur '1'
                    triangleP[i][j] = triangleP[i - 1][j] + triangleP[i - 1][j - 1]; //Calcul des autres valeurs
            }                                                                       //la formule connue
        }
        for (int[] triangleP1 : triangleP) {            //Boucle permettant d'afficher le triangle dont
            for (int j = 0; j < triangleP1.length; j++) {//les valeurs ont ete calcules plus haut.
                System.out.print(triangleP1[j] + " "); //Des espaces pour une meilleure visibilitee :)
            }
            System.out.println(); //A la ligne pour passer a la ligne suivante.
        }
    }
}
//PS: ca a vraiment ete une course contre la montre pour finir ce devoir mais je suis tres content du resultat :)
//Signature: Junior Naoussi's program