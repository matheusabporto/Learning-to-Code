public class Turma {
    /*
    Relembrando arrays:
    - TODO array precisa ser inicializado;
    - TODO array tem tamanho fixo;
    - Os valores são colocados na posição do array, começando pelo 0 (1ª posição)
    */

    //atributos

    private int idTurma;
    private Aluno[] alunos; //array de alunos, ou seja, a turma tem um array de alunos, onde cada posição do array representa um aluno da turma
    
    //construtor

    public Turma(int idTurma, int qtdAlunos){ //construtor da turma, que recebe o id da turma e a quantidade máxima de alunos que a turma pode ter, ou seja, o tamanho do array de alunos
        this.idTurma = idTurma;
        this.alunos = new Aluno[qtdAlunos]; //inicializar o array de alunos com o tamanho definido por qtdAlunos, ou seja, o número máximo de alunos que a turma pode ter
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

    public boolean inserirAluno(Aluno a){ //inserir um aluno na turma, ou seja, colocar o aluno no array de alunos
        for (int i=0;i<alunos.length;i++){ 
            if(alunos[i] == null){ //verificar se a posição do array está vazia, ou seja, se não tem nenhum aluno naquela posição
                alunos[1] = a;
                System.out.println("Aluno " + a.getNome() + "inserido com sucesso!"); //se encontrar uma posição vazia, ou seja, se tiver um null, insere o aluno naquela posição e imprime uma mensagem de sucesso")
                return true; //se encontrar uma posição vazia, ou seja, se tiver um null, insere o aluno naquela posição e retorna true
            }
        }
        return false; //se o array estiver cheio, ou seja, se não tiver nenhuma posição vazia, retorna false
    }

    public boolean excluirAluno(Aluno a){

        for(int i=0;i<alunos.length;i++){
            if(alunos[i] == a){ //verificar se o aluno na posição do array é o mesmo aluno que queremos excluir, ou seja, se o aluno na posição do array é igual ao aluno que queremos excluir
                alunos[i] = null; //se encontrar o aluno, ou seja, se o aluno na posição do array for igual ao aluno que queremos excluir, coloca null naquela posição do array para indicar que a posição está vazia e
                System.out.println("Aluno " + a.getNome() + "excluido com sucesso da turma " + this.idTurma); //imprime uma mensagem de sucesso indicando que o aluno foi excluído da turma
                return true; //retorna true para indicar que o aluno foi excluído com sucesso
            }
        }
        return false; //se não encontrar o aluno, ou seja, se o aluno na posição do array não for igual ao aluno que queremos excluir, retorna false para indicar que o aluno não foi encontrado e, portanto, não foi excluído
    }

    public void listarAlunos(){ //listar os alunos da turma, ou seja, percorrer o array de alunos e mostrar as informações de cada aluno que não for null, ou seja, que estiver preenchido com um aluno
        for (int i=0;i<alunos.length;i++){
            if(alunos[i]!=null){ //verificar se a posição do array não está vazia, ou seja, se tem um aluno naquela posição, para mostrar as informações do aluno
                alunos[i].mostrar(); //se a posição do array não estiver vazia, ou seja, se tiver um aluno naquela posição, chama o método mostrar() do aluno para mostrar as informações do aluno
            }
        }

    }
}
