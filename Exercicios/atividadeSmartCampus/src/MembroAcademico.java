public abstract class MembroAcademico {

    // Atributos comuns a todos os membros acadêmicos
    protected String nome;
    protected int  registro;

    // Construtor
    public MembroAcademico(String nome, int registro) {
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

    public int getRegistro() {
        return this.registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    // métodos

    public abstract double bonusRU();
    public abstract void mostra();


    //método bonus R.U
    
    


}
