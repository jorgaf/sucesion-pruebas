package fp;

/**
 * Sucesión de la jornada:
 * <pre>
 * S = -(5/1)^2 + (7/1)^3 + (11/2)^5 - (13/3)^7 - (17/5)^10 - (19/8)^14 + (23/13)^20 + ...
 * </pre>
 * Es la misma lógica que escribiste en {@code main}, separada en métodos.
 * Cada método resuelve UNA pieza y se puede probar por separado.
 */
public class Sucesion {

    /** ¿{@code numero} es primo? Prueba los divisores desde 2 hasta numero - 1. */
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int d = 2; d < numero; d++) {
            if (numero % d == 0) {
                return false;
            }
        }
        return true;
    }

    /** Pieza A · El primo de la posición {@code i}, empezando en 5: 5, 7, 11, 13, 17… */
    public static int primo(int i) {
        int encontrados = 0;
        int numero = 4;
        while (encontrados < i) {
            numero++;
            if (esPrimo(numero)) {
                encontrados++;
            }
        }
        return numero;
    }

    /** Pieza B · El Fibonacci de la posición {@code i}, empezando en 1: 1, 1, 2, 3, 5, 8… */
    public static int fibonacci(int i) {
        int fibo = 1, siguienteFibo = 1;
        for (int k = 1; k < i; k++) {
            int aux = fibo + siguienteFibo;
            fibo = siguienteFibo;
            siguienteFibo = aux;
        }
        return fibo;
    }

    /** Pieza C · El signo de la posición {@code i}: bloques de 1, 2, 3, 4… que empiezan en negativo. */
    public static int signo(int i) {
        int signo = -1;
        int contSignos = 0, tamBloque = 1;
        for (int k = 1; k < i; k++) {
            contSignos++;
            if (contSignos == tamBloque) {
                signo = -signo;
                tamBloque++;
                contSignos = 0;
            }
        }
        return signo;
    }

    /** Pieza D · El exponente de la posición {@code i}: i + Fibonacci(i). */
    public static int exponente(int i) {
        return i + fibonacci(i);
    }

    /** El término de la posición {@code i}: signo · (primo / Fibonacci) ^ exponente. */
    public static double termino(int i) {
        return signo(i) * Math.pow((double) primo(i) / fibonacci(i), exponente(i));
    }

    /** La sumatoria de los {@code n} primeros términos. */
    public static double sumatoria(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + termino(i);
        }
        return suma;
    }
}
