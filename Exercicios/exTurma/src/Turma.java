public class Turma {
/*
- [ ] **Exercício — Classe Turma:** Implementar a classe `Turma` com um vetor de nomes dos alunos,
 um vetor de idades e um vetor de médias. Construtor e gets/sets associados. 
 Métodos:   `idadeMaisVelho()` (retorna a maior idade), 
            `nomeMaisNovo()` (retorna o nome do aluno mais novo), 
            `numeroAprovados()` (aluno aprovado com média ≥ 7.0).
*/
// Este exercicio ajuda a praticar o uso de vetores (arrays) e a implementação de métodos para manipular esses dados.
    // Atributos
    private String[] nomes;
    private int[] idades;
    private double[] medias;

    // Construtor
    public Turma(String[] nomes, int[] idades, double[] medias) {
        this.nomes = nomes;
        this.idades = idades;
        this.medias = medias;
    }

    // Getters e Setters
    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public int[] getIdades() {
        return idades;
    }

    public void setIdades(int[] idades) {
        this.idades = idades;
    }

    public double[] getMedia() {
        return medias;
    }

    public void setMedia(double[] medias) {
        this.medias = medias;
    }

    // Métodos

    public int idadeMaisVelho(){ // retorna a maior idade
        int maiorIdade = idades[0]; // Inicializa com a primeira idade
        for (int i = 1; i < idades.length; i++) {  // Percorre o vetor de idades a partir do segundo elemento
            if (idades[i] > maiorIdade) {  // Compara a idade atual com a maior idade encontrada
                maiorIdade = idades[i];  // Atualiza a maior idade se a atual for maior
            }
                            
        }
        return maiorIdade;
    }

    public String nomeMaisnovo() {
        int menorIdade = idades[0]; // Inicializa com a primeira idade
        String nomeMaisNovo = nomes[0]; // Inicializa com o nome do primeiro aluno
        for (int i = 1; i < idades.length; i++) {  // Percorre o vetor de idades a partir do segundo elemento
            if (idades[i] < menorIdade) {  // Compara a idade atual com a menor idade encontrada
                menorIdade = idades[i];  // Atualiza a menor idade se a atual for menor
                nomeMaisNovo = nomes[i];  // Atualiza o nome do aluno mais novo
            }
        }
        return nomeMaisNovo;

    }

    public int numeroAprovados() {
        int countAprovados = 0; // Inicializa o contador de aprovados
        for (int i = 0; i < medias.length; i++) {  // Percorre o vetor de médias
            if (medias[i] >= 7.0) {  // Verifica se a média do aluno é maior ou igual a 7.0
                countAprovados++;  // Incrementa o contador de aprovados
            }
        }
        return countAprovados; // Retorna o número total de alunos aprovados

    }


}
