
public class Compra {
	int valorTotal;
	int numeroParcelas;
	
//construtor a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}

//construtor com parcelas
	public Compra(int qtdParcelas, int valorParcela) {
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getValorParcelas() {
		return valorTotal/numeroParcelas;
	}
    
}
