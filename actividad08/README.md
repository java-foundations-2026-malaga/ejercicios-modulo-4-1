# JFo 4.1 - Actividad 08

## Crea una calculadora de propina sin argumentos

Crea la clase TipCalculator con campos `price = 100`, `tax = 0.21` y `tip = 0.05` y un método `printTotal()` sin argumentos que muestre `price * (1 + tax + tip)`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Total: 126.0
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/modulo4_1_actividad08/Actividad08.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad08Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
