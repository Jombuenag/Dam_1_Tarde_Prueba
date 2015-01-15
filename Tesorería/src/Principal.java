
public class Principal {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		//variables
		
		int miDinero=0;
		int dineroQuePierdo=0;
		int ingresos[]={10,30,5,15,25};// =new int[5]
		int gastos[]={-45,-60,-70};
		int intTotal;
		
		//codigo
		
		//calculo todos los ingresos
		
		for(int i=0;i<ingresos.length;i++)
		{
			miDinero+=ingresos[i];
		}
		//calculo todos los gastos
		
		for(int i=0;i<gastos.length;i++)
		{
			dineroQuePierdo+=gastos[i];
		}	
		
		//calculo el total
		
		intTotal=miDinero+dineroQuePierdo;
		
		//por pantalla
		
		System.out.println("Subtotal ingresos:"+miDinero);
		System.out.println("Subtotal gastos:"+dineroQuePierdo);
		System.out.println("el total es:"+intTotal);

	}

}
