
public class Carro {
	int potencia;
    int velocidade;
    String nome;
    
//metodos  da classe carro 
    void acelerar() {
    	velocidade = velocidade + potencia;
    }
    void frear() {
    	velocidade = velocidade / 2;
    }
    int getVelocidade() {
    	return velocidade;
    }
    void impromir() {//metodo de imprimir os resutados dos metodos da classe
    	System.out.println("O carro " +nome+ " esta a velocidade de " +getVelocidade()+ " km/h");
    }
}
