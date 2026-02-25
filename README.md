# ANTLR-CALCULATOR

**INTRODUCCION**

El presente proyecto consiste en el desarrollo de una calculadora aritmética utilizando ANTLR 4 integrado con el lenguaje de programación Java. El objetivo principal es aplicar los conceptos de análisis léxico y sintáctico mediante la definición de una gramática formal que permita reconocer y evaluar expresiones matemáticas básicas.

Para la construcción del analizador se utilizó ANTLR (Another Tool for Language Recognition), una herramienta que permite generar automáticamente analizadores léxicos y sintácticos a partir de una gramática definida por el usuario. A partir de dicha gramática, ANTLR genera las clases necesarias en Java para procesar expresiones aritméticas respetando la precedencia de operadores y el uso de paréntesis.

La aplicación desarrollada es capaz de leer múltiples operaciones desde un archivo de texto (.txt), analizar cada expresión y calcular su resultado utilizando el patrón de diseño Visitor. Este patrón permite recorrer el árbol sintáctico generado por el parser y evaluar cada nodo según las reglas establecidas.

Con este proyecto se busca reforzar los conocimientos sobre compiladores, gramáticas formales, construcción de lenguajes y procesamiento de expresiones matemáticas, demostrando cómo ANTLR facilita la creación de analizadores robustos y estructurados.


**Requisitos del Sistema**

-Ubuntu (Máquina Virtual)

-Java JDK 17 o superior

-ANTLR 4.13.2

**Instalación de Java**

sudo apt update

sudo apt install openjdk-17-jdk

Verificar instalación:

java -version

javac -version

**Instalación de ANTLR 4**

1. Descargar el archivo:
antlr-4.13.2-complete.jar

2. Colocar el archivo .jar dentro de la carpeta del proyecto.

3. (Opcional) Crear alias en Ubuntu:

Editar .bashrc:

nano ~/.bashrc

Agregar:

alias antlr4='java -jar ~/Descargas/CalculadoraANTLR/antlr-4.13.2-complete.jar'

alias grun='java org.antlr.v4.gui.TestRig'

Guardar y ejecutar:

source ~/.bashrc

**Generación de Archivos del Parser**

Desde la carpeta del proyecto:

java -jar antlr-4.13.2-complete.jar -visitor Calculadora.g4

Esto genera:

CalculadoraLexer.java

CalculadoraParser.java

CalculadoraBaseVisitor.java

CalculadoraVisitor.java

**Compilación del Proyecto**

Ubicarse en la carpeta del proyecto:

cd ~/Descargas/CalculadoraANTLR

Compilar:

javac -cp .:antlr-4.13.2-complete.jar *.java

**Ejecución**

El programa recibe como parámetro un archivo .txt con las operaciones.

Ejemplo:

java -cp .:antlr-4.13.2-complete.jar Main entrada.txt

**ANALISIS**

El proyecto consiste en la implementación de una calculadora aritmética utilizando ANTLR y Java. A partir de una gramática definida en el archivo Calculadora.g4, se establecieron las reglas necesarias para reconocer números, operadores y paréntesis, permitiendo validar expresiones matemáticas correctamente formadas.

ANTLR genera automáticamente el analizador léxico y sintáctico, encargados de dividir la entrada en tokens y construir un árbol sintáctico que respeta la precedencia de operadores. Posteriormente, mediante el patrón Visitor, se recorre dicho árbol para evaluar cada expresión y obtener el resultado correspondiente.

En general, el proyecto demuestra la aplicación práctica de gramáticas formales y el uso de ANTLR para el desarrollo de analizadores que procesan y evalúan expresiones matemáticas de manera estructurada y eficiente.



**Resultados**

![Resultados](IMAGENES/RESULTADOS.jpg)
