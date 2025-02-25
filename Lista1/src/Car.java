public class Car {
    //Variavel tipo primitivo
    public int ano;
    public float velociadade;

    //do tipo classe
    public String marca, modelo;

    // atribuo todos os atributos diretamente para o obj
    public Car(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velociadade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodo
    public void exibirDetalhes() {
        // this representa o objeto que chama o metodo
        System.out.println("Ano: " + this.ano +
                " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidde: " + this.velociadade);
    }

    // caso nao tenha nenhum informação do carro
    public Car() {
        this.ano = 0;
        this.marca = "Invalido";
        this.modelo = "Invalido";
    }

    public void acelerarCarro(int x) {
        this.velociadade = this.velociadade + x;
    }

    public void fear(int x) {
        if (this.velociadade >= x) {
            this.velociadade = this.velociadade - x;
        } else {
            System.out.println("Voce tentou frar mais do que a sua velocidade!!!");
        }

    }

}