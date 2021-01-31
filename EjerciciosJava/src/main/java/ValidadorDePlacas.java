
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class ValidadorDePlacas {
    public static void main(String[] args) {

        pintarSaltos(2);

        String datos[][] = diccionario();
        String placa = solicitarPlaca();
        String dias = determinarDias(datos, placa.charAt(4));

        System.out.println("Los dias que no circula son: " + dias);

        pintarSaltos(2);

    }

   
    public static String determinarDias(String datos[][], char digito) {

        String dias = "", dia;
        int i, j;
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (String.valueOf(digito).equals(datos[j][i])) {
                    dia = datos[j][0];
                    dias = dias + " " + dia;
                    break;
                }
            }
        }
        return dias;
    }
    public static String solicitarPlaca() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la placa: ");
        String placa = scanner.nextLine();

        scanner.close();

        return placa;
    }
    public static void pintarSaltos(int saltos) {
        int i = 0;

        while (i < saltos) {
            System.out.println("");
            i++;
        }

    }
    public static String[][] diccionario() {
        String[][] diccionario = new String[5][5];
        diccionario[0][0] = "Lunes";
        diccionario[0][1] = "3";
        diccionario[0][2] = "4";
        diccionario[0][3] = "5";
        diccionario[0][4] = "6";

        diccionario[1][0] = "Martes";
        diccionario[1][1] = "7";
        diccionario[1][2] = "8";
        diccionario[1][3] = "9";
        diccionario[1][4] = "0";

        diccionario[2][0] = "Miercoles";
        diccionario[2][1] = "1";
        diccionario[2][2] = "2";
        diccionario[2][3] = "3";
        diccionario[2][4] = "4";

        diccionario[3][0] = "Jueves";
        diccionario[3][1] = "5";
        diccionario[3][2] = "6";
        diccionario[3][3] = "7";
        diccionario[3][4] = "8";

        diccionario[4][0] = "Viernes";
        diccionario[4][1] = "9";
        diccionario[4][2] = "0";
        diccionario[4][3] = "1";
        diccionario[4][4] = "2";

        return diccionario;
    }
}
