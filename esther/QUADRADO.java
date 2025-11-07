public class QUADRADO {
    //Toda* classe terá atributos e métodos
    //Atributos são as características (variáveis)
    //Métodos são as ações (funções)
    //Classificamos esses métodos de acordo com
    //as suas caracteríticas:
    //Métodos Construtor: Quando for instanciado ele será 'construído' conforme
    //definido  no método construtor
    //Métodos get e set:
    //get (pegar) -> utilizado para ver qual o valor atual do atributo.
    //set (definir) -> insere/altera o valor do atributo
    //Métodos 'próprios': Métodos que criamos para dar mais ações para a nossa classe.

    //Atributos da classe quadrado:
    double lado;
    double area;
    double perímetro;

    //métodos
    //método construtor
    public QUADRADO(double lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        this.area = this.lado * this.lado;
    }
    public void calcularArea() {
        this.perímetro = this.lado * 4;
    }
    public void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perímetro);
    }
    //métodos próprios
    //Calcular separado
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }
    //Calcular no construtor
    public void calcularperímetro() {
        return this.lado * 4;
    }
    public void imprimir() {
    

    }
}
