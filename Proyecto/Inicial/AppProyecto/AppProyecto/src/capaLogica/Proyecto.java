package capaLogica;

import java.text.DecimalFormat;

public class Proyecto {

    private int[][][] m;
    private int[] ganadores;

    public int[] getGanadores() {
        return ganadores;
    }

    public Proyecto() {
        m = new int[100][6][6];
        ganadores = new int[100];
    }

    public void llenarTablero() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i][j].length; k++) {
                    int numeroGenerado = 0;
                    do {
                        if (k == 0) {
                            numeroGenerado = (int) (Math.random() * 15 + 1);
                        } else if (k == 1) {
                            numeroGenerado = (int) (Math.random() * 15 + 16);
                        } else if (k == 2) {
                            numeroGenerado = (int) (Math.random() * 15 + 31);
                        } else if (k == 3) {
                            numeroGenerado = (int) (Math.random() * 15 + 46);
                        } else if (k == 4) {
                            numeroGenerado = (int) (Math.random() * 15 + 61);
                        } else if (k == 5) {
                            numeroGenerado = (int) (Math.random() * 15 + 76);
                        }
                    } while (existeEnTablero(numeroGenerado, i, j, k));
                    m[i][j][k] = numeroGenerado;
                }
            }
        }
    }

//-------------------------------- METODOS PARA VERIFICAR Y TACHAR EL NÚMERO --------------------------------//
    public boolean existeEnTablero(int numero, int x, int y, int z) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    if (m[i][j][k] == numero) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int mostrarNumerosGenerados() {
        int numeroAleatorio = (int) (Math.random() * 95) + 1;
        return numeroAleatorio;
    }

    public void tacharNumero(int numero) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i][j].length; k++) {
                    if (m[i][j][k] == numero) {
                        m[i][j][k] = -1;
                    }
                }
            }
        }
    }

//-------------------------------- METODOS PARA EL TIPO DE JUEGO --------------------------------//    
//    public boolean verificarCuatroEquinas() {
//        int indice = -1;
//        boolean bandera = false;
//        for(int k = 0; k < m.length; k++){
//                if((m[k][0][0] == -1 && m[k][0][m[0][0].length - 1] == -1
//                && m[m.length - 1][0][0] == -1 && m[m.length - 1][0][m[0][0].length - 1] == -1)){
//                    indice++;
//                    ganadores[indice] = k;
//                    bandera = true;
//                }
//            }
//        return bandera;
//    }
    public boolean verificarCuatroEquinas() {
        int indice = -1;
        boolean bandera = false;
        for (int k = 0; k < m.length; k++) {
            if ((m[k][0][0] == -1 && m[k][5][5] == -1
                    && m[k][5][0] == -1 && m[k][0][5] == -1)) {
                indice++;
                ganadores[indice] = k;
                bandera = true;
            }
        }
        return bandera;
    }

    public boolean verificarCartonLleno() {
        int indice = -1;
        boolean bandera = false;
        for (int k = 0; k < m.length; k++) {
            boolean cartonLleno = true;
            for (int i = 0; i < m[k].length; i++) {
                for (int j = 0; j < m[k][i].length; j++) {
                    if (m[k][i][j] != -1) {
                        cartonLleno = false;
                        break;
                    }
                }
                if (!cartonLleno) {
                    break;
                }
            }
            if (cartonLleno) {
                indice++;
                ganadores[indice] = k;
                bandera = true;
                break;  // Agregamos un break para salir del bucle una vez que se encuentra un cartón lleno
            }
        }
        return bandera;
    }

    public boolean verificarDiagonales() {
        int indice = -1;
        boolean bandera = false;

        // Verificar las diagonales en cada capa
        for (int k = 0; k < m.length; k++) {
            if ((m[k][0][0] == -1 && m[k][1][1] == -1
                    && m[k][2][2] == -1 && m[k][3][3] == -1)
                    || (m[k][0][3] == -1 && m[k][1][2] == -1
                    && m[k][2][1] == -1 && m[k][3][0] == -1)) {
                indice++;
                ganadores[indice] = k;
                bandera = true;
            }
        }

        // Verificar la diagonal que atraviesa todas las capas
        if ((m[0][0][0] == -1 && m[1][1][1] == -1
                && m[2][2][2] == -1 && m[3][3][3] == -1)
                || (m[0][0][3] == -1 && m[1][1][2] == -1
                && m[2][2][1] == -1 && m[3][3][0] == -1)) {
            indice++;
            ganadores[indice] = -1; // Puedes asignar un valor especial para indicar que es la diagonal total
            bandera = true;
        }

        return bandera;
    }

    //-------------------------------- DECIMAL --------------------------------// 
    public String tableroToString(int index) {
        DecimalFormat formatoNumero = new DecimalFormat("00");
        StringBuilder hilera = new StringBuilder("\n");
        for (int j = 0; j < m[index].length; j++) {
            for (int k = 0; k < m[index][j].length; k++) {
                hilera.append((m[index][j][k] == -1) ? 'X' : formatoNumero.format(m[index][j][k])).append("\t");
            }
            hilera.append("\n");
        }
        hilera.append("\n");
        return hilera.toString();
    }

    //-------------------------------- QUINARIO --------------------------------// 
    public String tableroToStringQuinario(int index) {
        StringBuilder hilera = new StringBuilder("\n");
        for (int j = 0; j < m[index].length; j++) {
            for (int k = 0; k < m[index][j].length; k++) {
                hilera.append((m[index][j][k] == -1) ? 'X' : decimalToQuinario(m[index][j][k])).append("\t");
            }
            hilera.append("\n");
        }
        hilera.append("\n");
        return hilera.toString();
    }

    private String decimalToQuinario(int decimal) {
        return Integer.toString(decimal, 5);
    }

    //-------------------------------- OCTAL --------------------------------// 
    public String tableroToStringOctal(int index) {
        StringBuilder hilera = new StringBuilder("\n");
        for (int j = 0; j < m[index].length; j++) {
            for (int k = 0; k < m[index][j].length; k++) {
                hilera.append((m[index][j][k] == -1) ? 'X' : decimalToOctal(m[index][j][k])).append("\t");
            }
            hilera.append("\n");
        }
        hilera.append("\n");
        return hilera.toString();
    }

    private String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    //-------------------------------- HEXADECIMAL --------------------------------// 
    public String tableroToStringHexadecimal(int index) {
        StringBuilder hilera = new StringBuilder("\n");
        for (int j = 0; j < m[index].length; j++) {
            for (int k = 0; k < m[index][j].length; k++) {
                hilera.append((m[index][j][k] == -1) ? 'X' : decimalToHexadecimal(m[index][j][k])).append("\t");
            }
            hilera.append("\n");
        }
        hilera.append("\n");
        return hilera.toString();
    }

    private String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal);
    }

    //-------------------------------- DUODECIMAL --------------------------------// 
    public String tableroToStringDuodecimal(int index) {
        StringBuilder hilera = new StringBuilder("\n");
        for (int j = 0; j < m[index].length; j++) {
            for (int k = 0; k < m[index][j].length; k++) {
                hilera.append((m[index][j][k] == -1) ? 'X' : decimalToDuodecimal(m[index][j][k])).append("\t");
            }
            hilera.append("\n");
        }
        hilera.append("\n");
        return hilera.toString();
    }

    private String decimalToDuodecimal(int decimalNumber) {
        StringBuilder duodecimal = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 12;
            duodecimal.insert(0, (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10));
            decimalNumber /= 12;
        }

        return (duodecimal.length() == 0) ? "0" : duodecimal.toString();
    }

//-------------------------------- LLENAR TABLEROS SEGÚN LA BASE --------------------------------// 
    @Override
    public String toString() {
        return tableroToString(0);
    }

    public String impresionOctalConTachado() {
        return tableroToStringOctal(0);
    }

    public String impresionQuinariaConTachado() {
        return tableroToStringQuinario(0);
    }

    public String impresionHexadecimalConTachado() {
        return tableroToStringHexadecimal(0);
    }

    public String impresionDuodecimalConTachado() {
        return tableroToStringDuodecimal(0);
    }
}
