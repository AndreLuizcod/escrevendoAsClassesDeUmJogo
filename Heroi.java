public class Heroi {

    public String nome;
    public int idade;
    public String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque = "";

        switch (tipo) {
            case "Guerreiro":
                ataque = "Espada";
                break;
            case "Mago":
                ataque = "Magia";
                break;
            case "Monge":
                ataque = "Artes marciais";
                break;
            case "Ninja":
                ataque = "Ninjutsu";
                break;
            default:
                ataque = "Ataque inválido";
                break;
        }
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi meuHeroi = new Heroi("Sansão do Cabelão", 30, "Monge");
        meuHeroi.atacar();
    }
}