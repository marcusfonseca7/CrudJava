public class Programador extends Pessoa{
    private String linguagem;

    public Programador(String nome, int idade, String telefone, String linguagem) {
        super(nome, idade, telefone);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return super.toString() + " Linguagem de Programação: " + linguagem;
    }
}
