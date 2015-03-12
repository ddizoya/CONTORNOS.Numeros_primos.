package refactorizar;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar {

    /**
     * Método main de testeo.
     * @param args Le pasamos todos los argumentos.
     */
    public static void main(String[] args) {
        boolean primo = false;
        int longitudDigito = 0;
        int contadorDigito = 0;
        longitudDigito = entradaDato();
        if (longitudDigito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorDigito = contador;

            if (contadorDigito == longitudDigito) {
                if (i < 4) {
                    primo = true;
                } else {
                    if (i % 2 == 0) {
                        primo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * Método para pedir por teclado datos.
     * @return Devuelve el valor introducido por teclado (lontigud).
     */
    private static int entradaDato() {
        int longitudDigito;
        longitudDigito = Integer.parseInt(JOptionPane.showInputDialog("Introduce dato."));
        return longitudDigito;
        //No deja crear un conflicto. 
    }

}
