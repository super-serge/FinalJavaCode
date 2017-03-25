public class Cena{
private int comida;
private int bebida;
private int combo;
private int op;

Datos inte3=new Datos();
public void Menu(){
	System.out.println("Elegiste la pocion: Cena/n");
	System.out.println("Que opcion eliges?/n");
	System.out.println("1.-Club sandwich/n 2.-Pan dulce y cafe americano/n 3.-Crepa de nutella/n 4.-Ensalada light");
	op=inte3.LeerNum();

	switch (op) {
		case 1:
		System.out.println("Haz elegido Club sandwich,espera un momento,estamos preparand tu orden");
        break;
        case 2:
        System.out.println("Haz elegido Pan dulce y cafe americano,espera un momento,estamos preparand tu orden");
        break;
        case 3:
		System.out.println("Haz elegido Crepa de nutella,espera un momento,estamos preparand tu orden");
		break;
		case 4 :
		System.out.println("Haz elegido Ensalada light,espera un momento,estamos preparand tu orden");

		break;


	}
	

}
}