public abstract class MembroAcademico {

    // Atributos comuns a todos os membros acadêmicos
    protected String nome;
    protected String registro;

    // Construtor
    public MembroAcademico(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return this.registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    // métodos

    public abstract double bonusRU();
    public abstract void mostra();


   
    
    


}
