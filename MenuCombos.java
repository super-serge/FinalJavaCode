public class MenuCombos{
	private int opcion;
	private int precio;
	private int formadepago;
	private String peticion;



 public void CombosDesayuno(){

 	String aux;

 	System.out.println("Bienvenido al desayuno al sistema de combos");
 	System.out.println("Se te mostarara los siguientes combos , solo elige el numero que deseas ");
 	System.out.println(" 1.-Combo Intercontinental (molletes jugo y fruta)    $50");
 	System.out.println(" 2.-Combo Americano (huevos al gusto ,jugos , cafe)   $65");
 	System.out.println(" 3.-Combo Europeo (pan frances , jugo y cafe)         $45");

 	System.out.println("Dame el numero de combo que quieres");

 	this.opcion=Datos.leerenteros();

 		switch(this.opcion){

 				case 1:

 					System.out.println("Elgiste el combo Intercontinental");
 					System.out.println("Quiere poner un comentario en tu  orden (sin cebollas o algo) S/N");
 					aux=Datos.leercadenas();
 					if(aux.equals("s") || aux.equals("S")){

 					System.out.println("Escribe tus observaciones");
 					this.peticion=Datos.leercadenas();
 					}
 					this.precio=50;
 					break;
 		}





 }

}