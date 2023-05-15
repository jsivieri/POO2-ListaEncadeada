package ListaEncadeadaSimples;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Lista lista = new Lista();
		lista.insereInicio(1);
		lista.insereInicio(2);
		lista.insereInicio(3);
		lista.insereInicio(4);
		lista.insereInicio(5);
		
		lista.exibeLista();
		
		lista.search(3);
		
		lista.removeInicio();
		
		lista.exibeLista();
		
	}

}
