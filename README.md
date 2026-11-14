# Sucesión con pruebas unitarias

Guía práctica de fundamentos de programación · UTPL · Cuenca, 14 de noviembre de 2026

$$
S = -\left(\frac{5}{1}\right)^2 + \left(\frac{7}{1}\right)^3 + \left(\frac{11}{2}\right)^{5} - \left(\frac{13}{3}\right)^{7} - \left(\frac{17}{5}\right)^{10} - \left(\frac{19}{8}\right)^{14} + \left(\frac{23}{13}\right)^{20} + \dots
$$

Es la misma sucesión que programaste en el bloque 4, ahora organizada en **métodos** y con **pruebas unitarias** (JUnit).

## Estructura

```text
sucesion-pruebas/
├── pom.xml                              configuración de Maven (JUnit 6)
├── src/main/java/fp/
│   ├── Sucesion.java                    la lógica: un método por pieza
│   └── Main.java                        el programa que pide n
├── src/test/java/fp/
│   └── SucesionTest.java                las pruebas  ← aquí trabajas
├── .github/workflows/pruebas.yml        GitHub Actions: ejecuta las pruebas en cada push
└── .devcontainer/                       configuración de Codespaces
```

## Comandos

```bash
mvn test                                  # ejecutar todas las pruebas
java src/main/java/fp/Main.java           # ejecutar el programa
```

En IntelliJ IDEA: clic derecho sobre `SucesionTest.java` → **Run 'SucesionTest'**.

La guía completa está en el repositorio `guia-practica`, bloque 5.
