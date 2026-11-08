# JFo 4.1 - Actividad 13

## Resuelve el cálculo de una cuenta de restaurante

Crea la clase BillCalculator con campos `tax = 0.21` y `tip = 0.05` y el método `calculateTotal(double price)`, que devuelve `price * (1 + tax + tip)`. Calcula las cuentas de 100, 50 y 25.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Cuenta 1: 126.0
Cuenta 2: 63.0
Cuenta 3: 31.5
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/modulo4_1_actividad13/Actividad13.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad13Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
