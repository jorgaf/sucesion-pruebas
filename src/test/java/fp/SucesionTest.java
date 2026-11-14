package fp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Pruebas de la sucesión.
 *
 * Cada prueba sigue el mismo patrón:
 *   1. Llamar a un método con un valor conocido.
 *   2. Comparar el resultado con el valor que esperamos (assertEquals).
 *
 *   assertEquals(ESPERADO, Sucesion.metodo(ENTRADA));
 *   assertEquals(ESPERADO, Sucesion.metodo(ENTRADA), TOLERANCIA);   // para double
 */
class SucesionTest {

    // ─────────────────────────────────────────────────────────────
    // Pruebas de ejemplo: ya funcionan. Léelas y ejecútalas.
    // ─────────────────────────────────────────────────────────────

    @Test
    @DisplayName("7 es primo y 9 no lo es")
    void reconocePrimos() {
        assertTrue(Sucesion.esPrimo(7));
        assertFalse(Sucesion.esPrimo(9));
    }

    @Test
    @DisplayName("El primer primo de la sucesión es 5")
    void primerPrimo() {
        assertEquals(5, Sucesion.primo(1));
    }

    @Test
    @DisplayName("El cuarto primo de la sucesión es 13")
    void cuartoPrimo() {
        assertEquals(13, Sucesion.primo(4));
    }

    @Test
    @DisplayName("Fibonacci(6) es 8")
    void fibonacciDeSeis() {
        assertEquals(8, Sucesion.fibonacci(6));
    }

    @Test
    @DisplayName("El exponente del término 1 es 2")
    void exponenteDelPrimerTermino() {
        assertEquals(2, Sucesion.exponente(1));
    }

    @ParameterizedTest(name = "signo({0}) = {1}")
    @DisplayName("Signos en bloques: - | + + | - - - | + + + +")
    @CsvSource({
        "1, -1",
        "2,  1",
        "3,  1",
        "4, -1",
        "7,  1"
    })
    void signos(int i, int esperado) {
        assertEquals(esperado, Sucesion.signo(i));
    }

    @Test
    @DisplayName("S1 = -25")
    void sumatoriaDeUnTermino() {
        assertEquals(-25.0, Sucesion.sumatoria(1), 0.0001);
    }

    // ─────────────────────────────────────────────────────────────
    // TU TURNO: escribe aquí tus pruebas siguiendo el patrón de arriba.
    // Usa los valores de la tabla de la guía (bloque 5, sección 5.6).
    // ─────────────────────────────────────────────────────────────

}
