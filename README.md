# PRÁCTICA 1 PROGRAMACIÓN II: APROXIMACIÓN DEL NÚMERO PI POR EL MÉTODO DE MONTECARLO

## Descripción de la aplicación:
El software utilizado en la práctica permite aproximar el número pi mediante el método de montecarlo.
## Instalación:
Para instalar el programa debe escribir `make jar`
## Ejecución:
Para ejecutar debe escribir `java -jar pi.jar <número de pasos>`
## Ejemplo de ejecución:
`java -jar pi.jar 10000`

## Estructura del código:
Existen dos clases: `Matematicas.java`, en el paquete `mates`, que
contiene el método que realiza la simulación; y `Principal.java`, en el
paquete `aplicacion`, que invoca el método de simulación.