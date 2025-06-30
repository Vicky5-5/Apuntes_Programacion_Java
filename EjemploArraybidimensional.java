package Practicas;

public class Ejemplo_Array_bi {
    public static void main(String[] args) {
        double acumulado;
        double interes = 0.01; // Incremento del interés cada año
        double[][] saldo = new double[6][5]; // 6 columnas (filas), 5 columnas (años)

        for (int i = 0; i < 6; i++) {
            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1; j < 5; j++) { 
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
            }

            interes = interes + 0.01;
        }

        for (int z = 0; z < 6; z++) {
            System.out.println();
            for (int h = 0; h < 5; h++) { 
                System.out.printf("%1.2f ", saldo[z][h]); //para que tenga dos decimales
            }
        }
    }
}
