public class Mostrarmenu{
	private  int opcion;
	private int hora;

	ComidaMenu comida1=new ComidaMenu();
	Datos lector1=new Datos();
  	HoraMenu horaactual=new HoraMenu();
	String aux;



	public int setOpcion(int opcion_parametro){

		this.opcion=opcion_parametro;

		return this.opcion;
	}

	public void MostrarDesayuno(){

		comida1.getMenuDesayuno_platofuerte();
		comida1.getMenuDesayuno_bebida();
		System.out.println("Deseas algun postres S/N");
		aux=lector1.LeerCad();
		if(aux.equals("S") || aux.equals("s") )
			comida1.getMenuDesayuno_postre();
		System.out.println("Tu comida costara "+comida1.preciofinal);
	}

	public void MostrarComida(){
		comida1.getMenuComida_platofuerte();
		comida1.getMenuComida_bebida();
		System.out.println("Deseas algun postres S/N");
		aux=lector1.LeerCad();
		if(aux.equals("S") || aux.equals("s") )
			comida1.getMenuComida_postre();
		System.out.println("Tu comida costara "+comida1.preciofinal);

	}

	public void MostrarCena(){
		comida1.getMenuCena_platofuerte();
		comida1.getMenuCena_bebida();
		System.out.println("Tu comida costara "+comida1.preciofinal);
	}

	public void MostrarMenus(){

	
	do{
  	this.hora=horaactual.ObtenerHora();

  	  this.opcion=this.setOpcion(1);


  	   switch(this.opcion){

  	   	  case 1:
            this.MostrarDesayuno();
  	   	  	
  	   	  	break;
  	   	  case 2:
  	   	  	this.MostrarComida();
  	   	  	break;

  	   	  case 3:
			this.MostrarCena();
  	   	  	break;


  	   }
  	  }while(opcion!=4);


	}



}