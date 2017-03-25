public class Horario {

private int hora;


public void abierto() {
	if (this.hora >= 9 && this.hora <= 18)
		System.out.println("Bienvenido al restaurant el cubo");
}
public void cerrado (){
	if (this.hora >18 && this.hora < 9)
		System.out.println("Nuestro horario de servicio es de 9 a 18");
}
	


}
