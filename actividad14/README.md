# JFo 4.1 - Actividad 14

## Resuelve el reparto de una cuenta entre varias personas

Usa un método `calculateTotal(double price)` (impuesto 0.21 y propina 0.05) para calcular lo que paga cada persona: Ana consume 20, Luis 30, Marta 40 y Pablo 50. Muestra también el total general.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Ana: 25.2
Luis: 37.8
Marta: 50.4
Pablo: 63.0
Total: 176.4
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/modulo4_1_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
