/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Notas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int n = input.nextInt();
        float[][] Notas = new float[n][3];
        
        for(int i=0; i<n ; i++){
            System.out.println("Ingrese nortas del estudiante " + (i+1) +" : " );
            for(int j=0; j<1; j++){
                System.out.println("Nota en Matematicas: ");
                Notas[i][j]= input.nextFloat();
            }
            for(int j=1; j<2; j++){
                System.out.println("Nota en ciencias: ");
                Notas[i][j]= input.nextFloat();
            }
            for(int j=2; j<3; j++){
                System.out.println("Nota en literatura: ");
                Notas[i][j]= input.nextFloat();
            }    
        }
        float promMate=0;
        float promCiencia=0;
        float promLit=0;
        for (int i=0; i< n; i++){
            promMate += Notas[i][0];
            promCiencia += Notas[i][1];
            promLit += Notas[i][2];
        }
        promMate /= n;
        promCiencia /= n;
        promLit /= n;
        float promGeneral = (promMate + promCiencia + promLit) /3;
        System.out.println("promedio de matematias: " + promMate);
        System.out.println("promedio de Ciencias: " + promCiencia);
        System.out.println("promedio de Literatura: " + promLit);
        System.out.println("promedio de General de Curso " + promGeneral);          
    }
}
