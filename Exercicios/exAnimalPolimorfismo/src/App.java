public class App {
    public static void main(String[] args) throws Exception {
        /*
**Exercício — Animal + Cachorro + Preguica:** Criar a classe `Animal` com nome e idade (encapsulamento). 
Criar a classe `Cachorro` (herda de `Animal`) com indicador se corre ou não, 
e a classe `Preguica` (herda de `Animal`) com indicador se escala ou não. 
Em cada classe, implementar método que mostra o som emitido. 
Na classe principal: instanciar um `Cachorro` e uma `Preguica` e chamar o método de som. 
Declarar um objeto do tipo `Animal` e instanciar de forma polimórfica; chamar o método.
*/
        Cachorro cachorro = new Cachorro("Auceu", 5, true);
        Preguica preguica = new Preguica("Snorlax", 8, true);
        Animal animal = new Animal("miau",4);

        cachorro.emitirSom();
        cachorro.emitirSom("Não latirei");
        cachorro.emitirSom();

        preguica.emitirSom();
        
        animal.emitirSom();

        



    }
}
