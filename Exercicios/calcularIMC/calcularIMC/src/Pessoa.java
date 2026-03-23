public class Pessoa {
    public String nome;
    public int anoNascimento;
    public double peso;
    public double altura;
    
    public Pessoa(String nome, int anoNascimento, double peso, double altura){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        if (altura<=0) return 0;
        return this.peso/(this.altura*this.altura);
    }

    public int idade(){
        if (anoNascimento>2027) return 0;
        return 2027-this.anoNascimento;
    }
    public double quantidadeAgua(){
        int idade = idade();
        if (idade<=17) {
        return (this.peso)*40;
        }   else if (idade>17 && idade<=55){
            return (this.peso)*35;
            }   else if (idade>55 && idade<=65){
                return (this.peso)*30;
                }   else {
                    return (this.peso)*25;
                    }
    } 
       
    public void mostra(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularIMC());
        System.out.println(" Idade: " + idade());
        
        double ml = quantidadeAgua();
        System.out.println("Quantidade de água necessária (L): " + (ml/1000.0) + " Litros de água por dia");
    }
}