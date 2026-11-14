package fp;

/**
 * Programa principal: pide n y muestra cada término y la sumatoria.
 * Fíjate en lo corto que queda main cuando la lógica vive en métodos con nombre.
 */
class Main {

    void main() {
        int n = Integer.parseInt(IO.readln("¿Cuántos términos? "));
        for (int i = 1; i <= n; i++) {
            IO.println("t%d = %s(%d/%d)^%d = %.4f".formatted(
                i,
                Sucesion.signo(i) > 0 ? "+" : "-",
                Sucesion.primo(i),
                Sucesion.fibonacci(i),
                Sucesion.exponente(i),
                Sucesion.termino(i)));
        }
        IO.println("S = %.4f".formatted(Sucesion.sumatoria(n)));
    }
}
