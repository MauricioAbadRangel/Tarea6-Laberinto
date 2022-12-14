/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mau
 */

 */
public class Tablero {

    public static void main(String[] args) {

    }

    public TableroLab() {
    }

    public static void llenarTablero(Arreglos_2D_ADT Tabla, ArrayList<ArrayList<String>> OutterArray) {
        for (int Fik = 0; Fik < Tabla.get_Filas(); Fik++) {
            for (int Cok = 0; Cok < Tabla.get_Columnas(); Cok++) {
                if (OutterArray.get(Fik + 2).get(Cok).equals("1")) {
                    Tabla.set_Item(Fik, Cok, "|");
                }
                if (OutterArray.get(Fik + 2).get(Cok).equals("0")) {
                    Tabla.set_Item(Fik, Cok, " ");
                }
                if (OutterArray.get(Fik + 2).get(Cok).equals("S")) {
                    Tabla.set_Item(Fik, Cok, "S");
                }
                if (OutterArray.get(Fik + 2).get(Cok).equals("E")) {
                    Tabla.set_Item(Fik, Cok, "^");
                }
            }
        }
    }

    public static void imprimirTablero(Arreglos_2D_ADT Tabla) {
        System.out.println("-------------------");
        for (int Fik = 0; Fik < Tabla.get_Filas(); Fik++) {
            for (int Cok = 0; Cok < Tabla.get_Columnas(); Cok++) {
                System.out.print(Tabla.get_Item(Fik, Cok) + " ");
            }
            System.out.print("\n");
        }
        System.out.println("-------------------");
    }

    public static boolean esSalida(Arreglos_2D_ADT Tabla, Pilas_ADT Pila) {
        String[] dividido = Pila.peek().split(",");
        int x = Integer.parseInt(dividido[0]);
        int y = Integer.parseInt(dividido[1]);

        return Tabla.get_Item(x, y) != "S";
    }

    public static void m() {

    }

    public static int checkLimites(int Filas, int Columnas, int px, int py) {

        if (px >= 0 && px < Filas && py >= 0 && py < Columnas) {
            //----------------------------------
            if (px - 1 != - 1 && py - 1 != - 1 && px + 1 < Filas && py + 1 < Columnas) {
                return 0;
            }

            if (px - 1 != - 1 && py - 1 != - 1 && px + 1 > Filas && py + 1 <= Columnas) {
                return 1;
            }

            if (px - 1 != - 1 && py - 1 != - 1 && px + 1 <= Filas && py + 1 > Columnas) {
                return 2;
            }

            if (px - 1 != - 1 && py - 1 != - 1 && px + 1 > Filas && py + 1 > Columnas) {
                return 3;
            }

            if (px - 1 == - 1 && py - 1 != - 1 && px + 1 <= Filas && py + 1 <= Columnas) {
                return 4;
            }

            if (px - 1 != - 1 && py - 1 == - 1 && px + 1 <= Filas && py + 1 <= Columnas) {
                return 5;
            }

            if (px - 1 == - 1 && py - 1 == - 1 && px + 1 <= Filas && py + 1 <= Columnas) {
                return 6;
            }
            
        }
        return 7; 
    }