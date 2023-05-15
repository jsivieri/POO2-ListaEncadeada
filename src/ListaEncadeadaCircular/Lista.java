package ListaEncadeadaCircular;

public class Lista {
	
	private Node inicio;
	
	
	
	
	public void add(Object x) {
		Node novo = new Node();
		novo.setValor(x);
		
		if (inicio == null) {
			inicio = novo;
			inicio.setAnterior(novo);
			inicio.setProximo(novo);
		} else {
			inicio.getAnterior().setProximo(novo);
			novo.setAnterior(inicio.getAnterior());
			
			inicio.setAnterior(novo);
			novo.setProximo(inicio);
		}
	}
	
	public Node getInicio() {
		return inicio;
	}
	
	public void exibirLista() {
		System.out.println(inicio.getValor());
	}
	

		

}


