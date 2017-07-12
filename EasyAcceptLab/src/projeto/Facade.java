package projeto;

public class Facade {

	private Controller meuController;
	
	public Facade() {
		meuController = new Controller();
	}
	
	public void inicializa(int caixa, double taxa) {
		meuController.inicializa(caixa, taxa);
	}

	public int getCaixa() {
		return 100000;
	}

}