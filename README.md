# Java Quest: Fundamentos de Java para Principiantes

## Resumen del Curso

Java Quest es un curso introductorio que enseña los fundamentos de Java y la programación orientada a objetos mediante cinco misiones. Acompañando a Pixel, aprenderás a mostrar mensajes, guardar información, tomar decisiones, repetir acciones y crear personajes con sus propios datos y comportamientos.

El curso está dirigido a estudiantes de secundaria sin experiencia previa. Cada misión combina explicaciones visuales, demostraciones reales en un editor en línea, preguntas y un desafío para practicar. **No necesitas instalar ningún programa: solo abre tu navegador y comienza a aprender.**

**Duración total estimada:** aproximadamente 55–60 minutos.  
**Público objetivo:** estudiantes de 12 a 17 años sin experiencia en programación.  
**Prerrequisitos:** ninguno.  
**Herramientas necesarias:** navegador web y conexión a Internet. Las prácticas se realizarán en editores gratuitos en línea.  
**Formato:** cinco videolecciones de aproximadamente 11 minutos, publicadas como no listadas en YouTube.

**Repositorio de código fuente:** [Vanguard · Java Fundamentals Course](https://github.com/Vanguard-open-source/java-fundamentals-course-vanguard)

> **Versión preliminar:** las misiones 1, 2 y 5 ya cuentan con video, código inicial y soluciones completas. La misión 3 también cuenta con estos recursos. Los materiales de la misión 4 se incorporarán cuando estén disponibles.

## Secuencia de las Lecciones

### Misión 1: Despierta a Pixel — Introducción, sintaxis y variables

**Duración:** 9 minutos y 43 segundos en la versión actual del video.

**Descripción:** descubre qué significa programar y para qué se utiliza Java. Conoce la estructura básica de un programa, muestra tu primer mensaje en la consola y crea la ficha de Pixel utilizando variables.

**Enlace:** [Ver la misión 1 en YouTube](https://youtu.be/bIHX3itpP3w?si=bqwBDBms8DCaeNhK).

**Conclusiones clave:**

- Un programa sigue las instrucciones que escribimos para realizar una tarea.
- `main` es el punto de entrada del programa y `System.out.println` permite mostrar información en la consola.
- `String`, `int`, `double` y `boolean` permiten guardar distintos tipos de datos.
- Las variables tienen un nombre, un tipo y un valor que podemos utilizar y modificar.

**Empieza a programar:** utiliza el [código y la guía de la misión 1](#prácticas-de-la-misión-1).

#### Prácticas de la misión 1

Abre [OnlineGDB para Java](https://www.onlinegdb.com/online_java_compiler), copia el contenido de **un solo** archivo `Main.java` en el editor y pulsa **Run**. Cada carpeta contiene un programa independiente. Empieza con el código inicial y consulta la solución después de intentarlo. No necesitas instalar Java. El enlace precargado específico queda pendiente; los archivos ya están disponibles aquí.

| Ejemplo del video | Código inicial | Solución completa | Comprobación |
| --- | --- | --- | --- |
| Primer programa: Hola, Mundo | [Main.java](starter-files/mision-01/hola-mundo/Main.java) | [Main.java](completed-examples/mision-01/hola-mundo/Main.java) | Una línea: `Hola, Mundo`. |
| Variables y ficha de Pixel | [Main.java](starter-files/mision-01/ficha-pixel/Main.java) | [Main.java](completed-examples/mision-01/ficha-pixel/Main.java) | Cuatro líneas: `Nombre: Pixel`, `Vida: 100`, `Velocidad: 2.5` y `Escudo: true`. |
| Desafío de personalización | [Main.java](starter-files/mision-01/desafio/Main.java) | [Posible solución](completed-examples/mision-01/desafio/Main.java) | Cambia el nombre, asigna 150 de vida, modifica la velocidad y elige el escudo. |

Los dos primeros ejemplos completos reproducen los programas resueltos en el video. El desafío inicial conserva la ficha original; su solución es una propuesta para comprobar la actividad, que el video deja al estudiante. En esa propuesta se muestran `Nombre: Nova`, `Vida: 150`, `Velocidad: 3.5` y `Escudo: false`. Puedes elegir otro nombre, otra velocidad y otro valor para el escudo.

**Desafío:** cambia el nombre de Pixel, asígnale 150 puntos de vida, modifica su velocidad y decide si tendrá escudo. Ejecuta el programa y comprueba qué cambia en su ficha.

### Misión 2: El laberinto de las decisiones — Operadores, condiciones y bucles

**Duración:** 11 minutos.

**Descripción:** ayuda a Pixel a superar una puerta de 50 monedas, cruzar un puente de cinco plataformas y recuperar su energía. Construye el código paso a paso para calcular, comparar, elegir entre dos caminos y repetir instrucciones. Predice los resultados y comprueba cómo cambian al modificar los datos.

**Enlace:** [Ver la misión 2 en YouTube](https://youtu.be/D5-3Ms_h5tA).

**Conclusiones clave:**

- Los operadores aritméticos permiten calcular y los operadores de comparación permiten obtener un resultado verdadero o falso.
- `=` asigna un valor; `==` compara si dos valores son iguales.
- `if/else` ejecuta un bloque u otro según una condición. Con `monedas >= 50`, tanto 50 como 60 permiten entrar; 30 y 49 no alcanzan.
- `for` reúne inicio, condición y actualización. Con `paso <= 5` imprime los pasos del 1 al 5; al evaluar 6, termina sin imprimirlo.
- `while` repite mientras la condición sea verdadera. La energía cambia de 20 a 30, 40 y 50; al llegar a 50, `energia < 50` es falso.
- Editar un dato y ejecutar son acciones distintas: hay que volver a ejecutar para comprobar la nueva salida. Las animaciones de Pixel ilustran los resultados; no son un videojuego controlado por Java.

#### Prácticas de la misión 2

Abre [OnlineGDB para Java](https://www.onlinegdb.com/online_java_compiler), copia el contenido de **un solo** archivo `Main.java` en el editor y pulsa **Run**. Cada ejemplo es un programa independiente: no pegues todos los archivos juntos. No necesitas instalar Java. El enlace precargado específico de esta misión queda pendiente; los archivos iniciales y las soluciones están disponibles aquí.

| Ejemplo del video | Código inicial | Solución completa | Comprobación |
| --- | --- | --- | --- |
| Operadores y expresiones | [Main.java](starter-files/mision-02/operadores/Main.java) | [Main.java](completed-examples/mision-02/operadores/Main.java) | `Total: 50` y `¿Puede entrar? true`. Cambia `recompensa` a 10: obtendrás 40 y `false`. |
| Decisiones con `if/else` | [Main.java](starter-files/mision-02/decisiones/Main.java) | [Main.java](completed-examples/mision-02/decisiones/Main.java) | Con 30: `Necesitas más monedas.` Prueba también 60, 50 y 49. |
| Cinco pasos con `for` | [Main.java](starter-files/mision-02/for/Main.java) | [Main.java](completed-examples/mision-02/for/Main.java) | Cinco líneas: `Paso: 1` a `Paso: 5`. Cambia el límite a 3 y predice cuántas aparecerán. |
| Recuperar energía con `while` | [Main.java](starter-files/mision-02/while/Main.java) | [Main.java](completed-examples/mision-02/while/Main.java) | `Energía: 30`, `Energía: 40` y `Energía: 50`. La primera salida es 30 porque primero se suma. |
| Desafío de energía | [Main.java](starter-files/mision-02/desafio/Main.java) | [Main.java](completed-examples/mision-02/desafio/Main.java) | Conserva el inicio en 20 y modifica la meta y el incremento después de intentar la actividad. |

Los cuatro primeros archivos iniciales contienen una base compilable y una indicación de lo que debes completar. El desafío empieza con el `while` de la lección funcionando, para que puedas modificarlo.

**Desafío:** conserva la energía inicial en 20, cambia la meta a 100 y haz que cada poción recupere 20 puntos. Antes de ejecutar, predice cuántos valores aparecerán. Pausa el video, modifica el programa y contrasta tu respuesta con la consola.

<details>
<summary>Ver la comprobación del desafío después de intentarlo</summary>

El bucle se repite cuatro veces. La consola muestra `Energía: 40`, `Energía: 60`, `Energía: 80` y `Energía: 100`. No imprime 20, porque la suma ocurre antes de `println`; al llegar a 100, la condición es falsa y termina.

</details>

### Misión 3: Desbloquea tus habilidades — Métodos, parámetros y Scanner

**Duración:** 12 minutos y 13 segundos.

**Descripción:** convierte las acciones de Pixel en métodos que puedas reutilizar. Personaliza sus saludos utilizando parámetros y recibe el nombre del personaje desde el teclado con `Scanner`.

**Enlace:** [Ver la misión 3 en YouTube](https://youtu.be/ktbu2jNDUY4).

**Conclusiones clave:**

- Un método agrupa instrucciones bajo un nombre; definirlo no lo ejecuta: es necesario llamarlo.
- Un parámetro aparece en la definición del método y un argumento es el valor que enviamos al llamarlo.
- `Scanner` permite leer datos y `nextLine` permite recibir una línea de texto.
- Podemos leer un dato, guardarlo en una variable y enviarlo como argumento a un método.

#### Prácticas de la misión 3

Abre [OnlineGDB para Java](https://www.onlinegdb.com/online_java_compiler) y ejecuta un archivo Main.java por vez. En los ejemplos con Scanner, escribe un nombre en la consola y pulsa Enter.

| Ejercicio | Código inicial | Solución |
| --- | --- | --- |
| Definir y llamar un método | [Main.java](starter-files/mision-03/metodo-saludar/Main.java) | [Main.java](completed-examples/mision-03/metodo-saludar/Main.java) |
| Enviar argumentos | [Main.java](starter-files/mision-03/parametros/Main.java) | [Main.java](completed-examples/mision-03/parametros/Main.java) |
| Leer un nombre con Scanner | [Main.java](starter-files/mision-03/scanner/Main.java) | [Main.java](completed-examples/mision-03/scanner/Main.java) |
| Combinar Scanner y un método | [Main.java](starter-files/mision-03/saludo-interactivo/Main.java) | [Main.java](completed-examples/mision-03/saludo-interactivo/Main.java) |
| Desafío de habilidad especial | [Main.java](starter-files/mision-03/desafio/Main.java) | [Main.java](completed-examples/mision-03/desafio/Main.java) |

**Desafío:** crea un método llamado `mostrarHabilidad` que muestre «¡Poder especial desbloqueado!». Llámalo desde `main` después del saludo y verifica el resultado.

### Misión 4: La fábrica de personajes — Clases, constructores y objetos

**Duración estimada:** 11 minutos.

**Descripción:** descubre cómo organizar los datos y las acciones de un personaje mediante programación orientada a objetos. Utiliza una clase como plantilla para crear a Pixel y Nova, cada uno con su nombre y puntos de vida.

**Enlace:** pendiente de incorporar el enlace real del video no listado de la misión 4.

**Conclusiones clave:**

- Una clase define características y comportamientos; un objeto es una instancia de esa clase.
- Los atributos representan los datos del objeto y los métodos representan sus acciones.
- El constructor permite inicializar un objeto al crearlo con `new`.
- Dos objetos de la misma clase pueden guardar datos diferentes y utilizar los mismos métodos.

**Práctica:** pendiente de incorporar el enlace precargado de la práctica de la misión 4.

**Desafío:** crea un tercer personaje llamado Shadow, con 200 puntos de vida, y haz que se presente utilizando su método.

### Misión 5: El desafío final — Encapsulación, arrays y proyecto integrador

**Duración:** 11 minutos y 17 segundos en la versión actual del video.

**Descripción:** protege los datos de los personajes, organiza un equipo y reúne lo aprendido en un programa final. El programa recibe un nombre y una cantidad de vida, crea personajes, muestra sus presentaciones y decide si el héroe está listo para la aventura. También aprenderás a interpretar errores comunes y comprobar distintos resultados.

**Enlace:** [Ver la misión 5 en YouTube](https://youtu.be/YcPR7eg055U).

**Conclusiones clave:**

- La encapsulación permite controlar el acceso a los datos. Un getter consulta un valor y un setter puede validarlo antes de cambiarlo.
- En nuestro ejemplo, una vida negativa se rechaza y conserva el valor anterior. Al crear un personaje, el valor inicial es cero si el dato recibido es inválido.
- Un array tiene una cantidad fija de elementos; sus índices empiezan en cero. Un bucle permite recorrer los personajes del equipo.
- Probar valores como 100, 30, 50, cero y un número negativo permite comprobar caminos diferentes del programa. Con 50 puntos el héroe ya puede comenzar la aventura.

**Proyecto final:** [abre la práctica precargada en OnlineGDB](https://onlinegdb.com/6nfQx3CBE), utiliza el [código inicial](starter-files/mision-05/Main.java) y compara tu resultado con la [solución completa](completed-examples/mision-05/Main.java).

**Desafío:** cambia la vida de Nova, crea un tercer personaje y agrégalo al array `equipo`. Ejecuta el programa, comprueba que se presenten los tres y conserva la validación de la vida.

## Recursos adicionales

- **Código fuente del curso:** [repositorio público en GitHub](https://github.com/Vanguard-open-source/java-fundamentals-course-vanguard).
- **Archivos iniciales de las prácticas:** [starter-files](starter-files/).
- **Ejemplos completos y soluciones:** [completed-examples](completed-examples/).
- **Scripts de apoyo:** [scripts](scripts/).

### Todas las actividades prácticas

| Misión | Actividad | Empezar a programar |
| --- | --- | --- |
| 1 | Mostrar mensajes y construir la ficha de Pixel con variables | [Ver video en YouTube](https://youtu.be/bIHX3itpP3w?si=bqwBDBms8DCaeNhK) · [Código y guía de la misión 1](#prácticas-de-la-misión-1) |
| 2 | Calcular monedas, decidir, cruzar el puente y recuperar energía | [Código y guía de la misión 2](#prácticas-de-la-misión-2) |
| 3 | Leer un nombre y personalizar un saludo mediante métodos | [Código y guía de la misión 3](#prácticas-de-la-misión-3) |
| 4 | Crear y presentar varios personajes a partir de una clase | Enlace precargado pendiente |
| 5 | Validar la vida, recorrer el equipo y completar el proyecto final | [Abrir en OnlineGDB](https://onlinegdb.com/6nfQx3CBE) |

### Material de cada misión en el repositorio

| Misión | Código inicial | Ejemplo completo |
| --- | --- | --- |
| 1 | [mision-01](starter-files/mision-01/) | [mision-01](completed-examples/mision-01/) |
| 2 | [mision-02](starter-files/mision-02/) | [mision-02](completed-examples/mision-02/) |
| 3 | [mision-03](starter-files/mision-03/) | [mision-03](completed-examples/mision-03/) |
| 4 | [mision-04](starter-files/mision-04/) | [mision-04](completed-examples/mision-04/) |
| 5 | [mision-05](starter-files/mision-05/) | [mision-05](completed-examples/mision-05/) |

Para practicar, pausa el video, predice el resultado, ejecuta el programa y compara lo que obtuviste con lo que esperabas. Si aparece un error, lee el mensaje, revisa la línea indicada y realiza un cambio cada vez.

**¡Gracias por completar Java Quest! Guarda tus prácticas, prueba tus propias ideas y continúa programando.**

---

## Elaboración

**Universidad:** Universidad Peruana de Ciencias Aplicadas.  
**Carrera:** Ingeniería de Software.  
**Período académico:** 202620.  
**Curso:** 1ASI0729 · Desarrollo de Aplicaciones Open Source.  
**NRC:** 7753.  
**Nombre del equipo:** Vanguard.  
**Líder del equipo:** pendiente de confirmar.  
**Fecha de entrega:** pendiente de confirmar.

### Integrantes del equipo

| Código | Nombres y apellidos |
| --- | --- |
| u202424008 | Luisa Nhiriel Casalino Berrocal |
| u202424466 | Giovanni Marcelo Gallegos De La Cruz |
| u20241e550 | Brayan Benjamin Huerta Cardenas |
| u202420031 | Antony Alexander Jimenez Saavedra |
| u202423883 | Fabricio Jose Rivera Rupay |

### Organización del trabajo

| Misión | Responsable |
| --- | --- |
| 1. Despierta a Pixel | Antony Alexander Jimenez Saavedra |
| 2. El laberinto de las decisiones | Brayan Benjamin Huerta Cardenas |
| 3. Desbloquea tus habilidades | Luisa Nhiriel Casalino Berrocal |
| 4. La fábrica de personajes | Giovanni Marcelo Gallegos De La Cruz |
| 5. El desafío final | Fabricio Jose Rivera Rupay |
