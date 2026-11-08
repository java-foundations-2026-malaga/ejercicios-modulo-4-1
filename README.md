# JFo 4.1 - Qué es un método

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige la clase sin método main correcto
02. Corrige una llamada a método inexistente
03. Corrige el uso incorrecto del operador de punto
04. Corrige una clase con campos en el lugar incorrecto
05. Corrige una llamada con argumentos incorrectos
06. Crea una clase con un método void simple
07. Crea una clase con campos y un método que los imprima
08. Crea una calculadora de propina sin argumentos
09. Crea un método con un argumento
10. Crea un método con dos argumentos
11. Crea un método que devuelva un entero
12. Crea un método que devuelva un boolean
13. Resuelve el cálculo de una cuenta de restaurante
14. Resuelve el reparto de una cuenta entre varias personas
15. Resuelve el caso de invitado sin cartera

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
