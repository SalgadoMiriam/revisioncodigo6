package org.example;

import java.util.Scanner;

public class codigo6 {

        // metodo main para correr el programa
        public static void main(String[] args) {

            //falta palabra new
            int[] n = new int[20];
//falta un +
            for (int i = 0; i < 20; i++) {
                n[i] = (int)(Math.random() * 381) + 20;

                //falta system.out.print
                System.out.print(n[i] + " ");
            }
//falta la n
            System.out.println("\n¿Qué números quiere resaltar? ");
            System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
            // falta un parentesis de cierre
            //colocamos scanner e importamos
            Scanner scan = new Scanner(System.in);
            int opcion = Integer.parseInt(scan.nextLine());
            //cambiamos el lugar del signo ?

            int multiplo = (opcion == 1) ? 5 : 7;
//cambiar a for y char por int
            for (int e : n) {
                if (e % multiplo == 0) {
                    System.out.print("[" + e + "] ");
                    //falta cierre
                }else {
               //cambio por out
                        System.out.print(e + " ");
                    }
                }

            }

        }




