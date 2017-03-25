public class Comida{
private int comida;
private int bebida;
private int combo;
private int op;

Datos inte2=new Datos();
public void Menu(){
	System.out.println("Elegiste la pocion: Comida/n");
	System.out.println("Que opcion eliges?/n");
	System.out.println("1.-Hamburguesa con queso/n 2.-Pizza Hawaiana/n 3.-Tacos dorados de pollo/n 4.-Milaneza de res");
	op=inte2.LeerNum();

	switch (op) {
		case 1:
		System.out.println("Haz elegido Hamburguesa con queso,espera un momento,estamos preparand tu orden");
        break;
        case 2:
        System.out.println("Haz elegido Pizza Hawaiana,espera un momento,estamos preparand tu orden");
        break;
        case 3:
		System.out.println("Haz elegido Tacos Dorados,espera un momento,estamos preparand tu orden");
		break;
		case 4 :
		System.out.println("Haz elegido Milaneza de res,espera un momento,estamos preparand tu orden");

		break;


	}
	

}
}