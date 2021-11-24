Programa Ejemplo SOLID

En este proyecto se realizó un programa sencillo donde se pone en práctica los principios de diseño SOLID.

S: Single responsibility principle o Principio de responsabilidad única

O: Open/closed principle o Principio de abierto/cerrado

L: Liskov substitution principle o Principio de sustitución de Liskov

I: Interface segregation principle o Principio de segregación de la interfaz

D: Dependency inversion principle o Principio de inversión de dependencia


Se creó una clase abstracta llamada Moto, con su respectivo metodo de comportamiento, luego se crean clases hijas de Moto siendo cada una de estas de una marca diferente, las cuales implementan interfaces dependiendo si son motos electricas o hacen uso de gasolina.

En la clase Main se instancian los objetos de las motos en un array de tipo Moto, luego en un for each se recorre el arreglo y se ejecutan los metodos de cada objeto.

En el siguiente enlace se puede visualizar el diagrama UML del proyecto: https://prnt.sc/20spvrz

