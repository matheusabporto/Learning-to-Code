public class Turma {
    /*
    Relembrando arrays:
    - TODO array precisa ser inicializado;
    - TODO array tem tamanho fixo;
    - Os valores são colocados na posição do array, começando pelo 0 (1ª posição)
    */

    //atributos

    private int idTurma;
    private Aluno[] alunos;
    
    //construtor

    public Turma(int idTurma, int qtdAlunos){
        this.idTurma = idTurma;
        this.alunos = new Aluno[qtdAlunos];
    }
 
    //getters e setters

    public int getIdTurma(){
        return this.idTurma;
    }
    public void setIdTurma(int idTurma){
        this.idTurma = idTurma;
    }

    public Aluno[] getAlunos(){
        return this.alunos;
    }
    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }

    
    //metodos

    public boolean inserirAluno(Aluno[] a){
           
        
        Aluno[] nomes = new Aluno[5];
        for (int i=0; i < alunos.length; i++){
            
        }


        

        return true;
    }

    public boolean excluirAluno(Aluno[] aluno){

        return true;
    }

    public void listarAlunos(){

    }
}
