public class App {
    public static void main(String[] args) throws Exception {
        
        
        //criar uma turma com id 1 e capacidade para 3 alunos
        Turma turma1 = new Turma(1, 3); 



        //criar alguns alunos
        Aluno aluno1 = new Aluno("João", 20);

        Aluno aluno2 = new Aluno("Maria", 22);

        Aluno aluno3 = new Aluno("Pedro", 19);

        //inserir os alunos na turma
        turma1.inserirAluno(aluno1); //inserir o aluno1 na turma1
        turma1.inserirAluno(aluno2); //inserir o aluno2 na turma1
        turma1.inserirAluno(aluno3); //inserir o aluno3 na turma1


        //listar os alunos da turma
        System.out.println("Alunos da turma " + turma1.getIdTurma() + ":"); //imprimir o id da turma para mostrar quais alunos pertencem a qual turma
        turma1.listarAlunos(); //chamar o método listarAlunos() da turma1 para mostrar as informações dos alunos que pertencem a turma1

        //excluir um aluno da turma
        turma1.excluirAluno(aluno2); //excluir o aluno2 da turma1

        //listar os alunos da turma novamente para verificar se o aluno2 foi excluído
        System.out.println("Alunos da turma " + turma1.getIdTurma() + " após exclusão:"); //imprimir o id da turma para mostrar quais alunos pertencem a qual turma
        turma1.listarAlunos(); //chamar o método listarAlunos() da turma1 para mostrar as informações dos alunos que pertencem a turma1 após a exclusão do aluno2
        


    }
}
