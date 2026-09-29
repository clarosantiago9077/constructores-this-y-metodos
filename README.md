# constructores-this-y-metodos
DIAGRAMA<img width="863" height="464" alt="Diagrama_Habitacion" src="https://github.com/user-attachments/assets/30be9522-8f27-4fe4-9604-bd6c2613e7af" />
1. ¿Qué diferencias hay entre un constructor y un método?

Un constructor sirve para crear e inicializar un objeto, mientras que un método realiza una acción. El constructor tiene el mismo nombre de la clase, no tiene tipo de retorno y se ejecuta al crear el objeto. Un método puede tener otro nombre y sí puede retornar un valor.

2. ¿Por qué new Paquete() dejó de compilar en la Etapa 2?

Porque al crear un constructor con parámetros, Java dejó de crear automáticamente el constructor vacío. Si se necesitan paquetes sin datos, se puede crear manualmente un constructor Paquete() sin parámetros.

3. ¿Qué pasa con peso = peso; en vez de this.peso = peso;?

El programa compilaría, pero el atributo no recibiría el valor correctamente. this.peso representa el atributo del objeto, mientras que peso representa el parámetro recibido.

4. ¿Qué es la firma de un método?

Es el nombre del método y sus parámetros. El tipo de retorno no sirve para diferenciar métodos porque dos métodos no pueden tener la misma firma aunque devuelvan tipos diferentes.

5. ¿Qué ventaja tiene usar this(...)?

Evita repetir código, ya que un constructor puede llamar a otro y dejar la inicialización de los atributos en un solo lugar. Esto hace el código más ordenado y fácil de modificar.
