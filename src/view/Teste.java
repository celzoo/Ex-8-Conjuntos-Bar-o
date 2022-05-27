package view;
import entity.Conjunto;
public class Teste {

	public static void main(String[] args) {
		Conjunto c1 = new Conjunto();
		Conjunto c2 = new Conjunto();
		Conjunto c3 = new Conjunto();
		Conjunto c4 = new Conjunto();
		Conjunto c5 = new Conjunto();
		//Testanto metodo adiciona
		c1.adicona("Celzo");
		c2.adicona("Tamassia");
		c1.adicona("Aveiro");
		//testando metodo verifica
		c1.verifica("Celzo");
		c2.verifica("Tamassia");
		c1.verifica("Pedro");
		System.out.println();
		System.out.println("Testando metodo união");
		//Testando metodo uniao
		c3.setConjunto(c1.uniao(c2));
		c3.verifica("Tamassia");
		

		
		System.out.println();
		System.out.println("Testando metodo inter");
		//Testanto metodo inter
	    c4.setConjunto(c1.inter(c2));	
	    c4.verifica("Aveiro");
	    c2.adicona("Aveiro");
	    c4.setConjunto(c1.inter(c2));
	    c4.verifica("Aveiro");
	    System.out.println();
	    System.out.println("Testanto metodo menos");
	    //Testanto metodo menos
	    c5.setConjunto(c1.menos(c2));
	    c5.verifica("Aveiro");
	    c5.verifica("Celzo");
	    
	   
	  
		

	}

}
