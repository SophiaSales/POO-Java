
public class Pricipal {

	public static void main(String[] args) {
		Carro c1 = new Carro();//criando carro1
		c1.potencia = 10;
		c1.nome = "Corcel";
		c1.velocidade = 0;
		
		Carro c2 = new Carro();//crinando carro2
		c2.potencia = 10;
		c2.nome = "Carango";
		c2.velocidade = 0;
		
		Carro c3 = new Carro();//criando carro3 
		c3.potencia = 10;
		c3.nome = "Corcel";
		c3.velocidade = 0;
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c2.acelerar();
		c2.acelerar();
		
		c1.impromir();
        c2.impromir();
        c3.impromir();
	}

}
