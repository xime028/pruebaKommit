package pruebaKommit;

public class ListaDoble {
	
	private Nodo head;
	private Nodo tail;
	private int tama�o;
	
	public ListaDoble() {
		super();
		this.head = null;
		this.tail = null;
		this.tama�o = 0;
	}
	
	
	public void insertarCabeza(int data) {
		Nodo nodoNuevo = new Nodo(data);
		
		if(head == null) {
			head = tail = nodoNuevo;
		}
		else {
			nodoNuevo.next = head;
			head.prev = nodoNuevo;
			head = nodoNuevo;
		}
		tama�o=tama�o+1;
	}
	
	public void insertarCola(int data) {
		Nodo nodoNuevo = new Nodo(data);
		
		if(tail == null) {
			head = tail = nodoNuevo;
		}
		else {
			tail.next = nodoNuevo;
			nodoNuevo.prev = tail;
			tail = nodoNuevo;
		}
		tama�o = tama�o+1;
		
	}
	
	
	public void eliminarElemento(int data){
		Nodo nodoActual = head;
		
		while(nodoActual!= null){
			Nodo next = nodoActual.next;
			if(nodoActual.data == data) {
				if(nodoActual == head) {
					head = nodoActual.next;
					if(head != null) {
						head.prev = null;
					}
				}
				else if(nodoActual == tail) {
					tail = nodoActual.prev;
					if(tail != null) {
						tail.next = null;
					}
				}
				else {
					nodoActual.prev.next = nodoActual.next;
					nodoActual.next.prev = nodoActual.prev;
				}
				tama�o--;
					
			}
			nodoActual = next;
			
		}
		
	}
	
	public void eliminarRepetidos(int data) {
		Nodo nodoActual = head;
		
		while(	nodoActual!= null){
			Nodo next = nodoActual.next;
			
			if(nodoActual.data == data) {
				if(nodoActual==head) {
					head = nodoActual.next;
					if(head != null) {
						head.prev = null;
					}
				}else if(nodoActual == tail) {
					tail = nodoActual.prev;
					if(tail != null) {
						tail.next=null;
					}
				}
				else {
					nodoActual.prev.next = nodoActual.next;
					nodoActual.next.prev = nodoActual.prev;
				}
				tama�o--;
			}
			nodoActual = next;
		
		}
		
	}
	
	
	public boolean encontrarValorNodo (int data) {
		Nodo nodoActual = head;
		boolean encontrado =false;
		
		while(nodoActual!=null) {
			if(nodoActual.data == data) {
				encontrado = true;
			}
			nodoActual = nodoActual.next;
		}
		return encontrado;  // retorna false si no lo encuentra
	}
	
	public int obtenerTama�o() {
		return getTama�o();
	}
	
	public void imprimirLista() {
		Nodo actual = head;
		
		while(actual != null) {
			System.out.println(actual.data+ " ");
			actual = actual.next;
		}
		
	}


	public Nodo getHead() {
		return head;
	}


	public void setHead(Nodo head) {
		this.head = head;
	}


	public Nodo getTail() {
		return tail;
	}


	public void setTail(Nodo tail) {
		this.tail = tail;
	}


	public int getTama�o() {
		return tama�o;
	}


	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
	
	
	

}
