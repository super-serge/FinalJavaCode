public class Desayuno{
private int comida;
private int bebida;
private int combo;
private int op;

Datos inte1=new Datos();
public void Menu(){
	System.out.println("Elegiste la pocion: desayuno/n");
	System.out.println("Que opcion eliges?/n");
	System.out.println("1.-Huevos a la mexicana/n 2.-Enchiladas suizas/n 3.-chilaquiles verdes/n 4.-Hot cakes");
	op=inte1.LeerNum();

	switch (op) {
		case 1:
		System.out.println("Haz elegido huevos a la mexicana,espera un momento,estamos preparand tu orden");
        break;
        case 2:
        System.out.println("Haz elegido Enchiladas suizas,espera un momento,estamos preparand tu orden");
        break;
        case 3:
		System.out.println("Haz elegido chilaquiles verdes,espera un momento,estamos preparand tu orden");
		break;
		case 4 :
		System.out.println("Haz elegido huevos a la mexicana,espera un momento,estamos preparand tu orden");

		break;


	}
	

}



public static void main ( String []args){

	System.out.println("HOLA PUTOS");
}
}