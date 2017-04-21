public class ProyectoTest{


	public static void  getCliente(){

		Cliente cliente0 = new Cliente();
		ClienteNuevo registro=new ClienteNuevo();


		cliente0=registro.registrarse();

		cliente0.clientes.add(cliente0);


	}

  public static void main(String [] args){

  	int aux=0;
  	int numero=0;

  	Mostrarmenu horacomida=new Mostrarmenu();

  	MenuCombos menu=new MenuCombos();

  	Cliente cliente0 = new Cliente();

  	Cliente cliente1 =new Cliente();

  	Datos lector0=new Datos();

  	ClienteFrecuentes clientef=new ClienteFrecuentes();

  	ClienteNuevo registro=new ClienteNuevo();

  

  	while(aux!=3){
  	System.out.println("Bienvenido al Cubo");
  	
  	cliente0.mostrarMenu();
  	aux=lector0.LeerNum();

  		switch(aux){

  			case 1:

  				System.out.println("Bienvenido al sistema de registro");
  				getCliente();
  				break;

  			case 2:

  				System.out.println("Bienvenido al Sistema de Login");
  				numero= clientef.getnumerodevisitas();
  				clientef.Comprobar(numero);
  				horacomida.MostrarMenus();


  				break;
  			case 3:

  				System.out.println("Adios");
  				break;
  			default:
  				System.out.println("Opcion invalida");
  		}
  	}


  //	horacomida.MostrarMenus();
  	

  	
  }


	

}
