import java.util.*;

public class HoraMenu{
	private int horadecomida;
	private int opcioncomida; // Atributo
	

		public void HoraMenu(){// constructor
		}

		public int ObtenerHora(){// metodos
			Calendar calendario =new GregorianCalendar();
			this.horadecomida=calendario.get(Calendar.HOUR_OF_DAY);
			return this.horadecomida;
		}

		public final int VerificarHora(int hora){ //metodos
			this.horadecomida=hora;

			if(this.horadecomida <9 && this.horadecomida>19 ){
				System.out.println("Nos encontramos cerrados , nuestro horario es de 9 a 19 ");
				this.opcioncomida=4;
			}
			if(this.horadecomida >8 && this.horadecomida <=12){
				System.out.println(" Es hora del desayuno\n Se te mostara el menu del desayuno");
				this.opcioncomida=1;
			}
			if(this.horadecomida >= 13 && this.horadecomida <16){
				System.out.println(" Es hora de la comida\n Se te mostara el menu de comida");
				this.opcioncomida=2;
			}
			if(this.horadecomida >= 16 && horadecomida < 19){
				System.out.println(" Es hora de la comida\n Se te mostara el menu de comida");
				this.opcioncomida=3;
			}

			return this.opcioncomida;

		}

}