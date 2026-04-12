public class App {
    public static void main(String[] args) throws Exception {
        String[] nomes = {"João", "Maria", "Pedro", "Ana"};
        int[] idades = {20, 18, 22, 19};
        double[] medias = {7.5, 8.0, 6.5, 9.0};

        Turma turma = new Turma(nomes, idades, medias);

        System.out.println("Idade do aluno mais velho: " + turma.idadeMaisVelho());
        System.out.println("Nome do aluno mais novo: " + turma.nomeMaisnovo());
        System.out.println("Número de alunos aprovados: " + turma.numeroAprovados());

    }
}
