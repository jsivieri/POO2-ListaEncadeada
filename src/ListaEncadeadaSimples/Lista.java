package ListaEncadeadaSimples;

public class Lista {

    private static class No{
        public No prox; 
        public int valor;  
        
        public No (int val){ 
            valor = val; prox = null;
        }
    }
    
    private No inicio; 
    
    public Lista(){   
        inicio = null;
    }

  public boolean isEmpty(){
    return inicio == null;
  }
    
public boolean search( int elem){
    for(No nodo = inicio; nodo != null; nodo = nodo.prox)
       if (elem == nodo.valor) 
    	   System.out.println(elem);
    	   return true;
       
  }

  public void insereInicio(int elem){ 
        No novoNo = new No(elem);
        novoNo.prox = inicio; 
        inicio = novoNo;     
    }
    
    public void removeInicio(){ 
        inicio = inicio.prox; 
    }
    
    public void exibeLista(){
        if(isEmpty()) System.out.println("Lista vazia\n"); 
        String str = "Lista Encadeada: ";
        for (No nodo = inicio; nodo != null; nodo = nodo.prox)
          str+= " "+ nodo.valor;
        System.out.println(str + "\n");
        
    }

}
