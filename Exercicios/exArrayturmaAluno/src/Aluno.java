public class Aluno {

    //atributos
    private int matricula;
    private String nome;

    //construtor
    public Aluno(String nome, int matricula) {
        this.matricula = matricula;
        this.nome = nome;
    }

    //getters e setters

    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //metodos

    public void mostrar(){
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
    }




}
