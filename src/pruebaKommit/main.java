package pruebaKommit;

public class main {

	public static void main(String[] args) {
		
		ListaDoble lista = new ListaDoble();
		
		//Insertar cabeza y cola
		
		lista.insertarCabeza(20);
		lista.insertarCabeza(10);
		lista.insertarCabeza(56);
		lista.insertarCabeza(43);
		lista.insertarCabeza(15);
		lista.insertarCola(3);
		lista.insertarCola(5);
		lista.insertarCola(3);
		
		
		//Imprimir lista
		lista.imprimirLista();
		
		
		//Eliminar un elemento
		lista.eliminarElemento(15);
		lista.imprimirLista();
		
		
		//Eliminar elementos repetidos
		lista.eliminarRepetidos(3);
		lista.imprimirLista();
		
		
		
		//Buscar elemento
		System.out.println(lista.encontrarValorNodo(10));
		
		
		//Tamaño lista
		System.out.println(lista.getTamaño());
		
		
		
		
		
		
			
		

	}

}
