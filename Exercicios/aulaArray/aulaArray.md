# Array

Int[] numeros = new int[5]; // numeros é o nome do atributo e int o tipo de dado
numeros[0] = 10;
numeros[0] = 20;
numeros[0] = 30;

for (int i=0; i<numeros.lenght;i++){
    System.out.println(i + " : " + numeros[i]);
}

# Observação
-> Array é uma estrutura fixa.git git add
-> tamanho do array definido na criação
 
 -> i/index é a posição atual do array, começando por 0. ou seja um array de 5, começa na posição 0 e vai até 4.


 #ex

 public class Turma{
    int idTurma;
    String[] alunos;
    int qtdAlunos;
    Professor professor;

    public Turma(int qtd){
        this.idTurma = 0;
        this.qtdAlunos = qtd;
        this.alunos = new alunos[qtdAlunos];
        this.professor = new Professor();
    }

    int[] n = new int[1];
    String [] s = new String[1];
    Aluno[] a = new Aluno[2];
    A[0] = new Aluno(1, "Joao", 123);

    Turma t = new Turma(30);
    t.alunos[0] = "artur";
    t.alunos[1] = "Leticia";
    t.A[0].mostrar(); //se tiver um metodo mostrar, por exemplo.

 }