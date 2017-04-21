import java.io.*;
public class ComidaMenu extends SeleccionComida{
  
	
	Datos Objeto1 = new	Datos();

  public void ComidaMenu(){

  }

  public final void getMenuDesayuno_platofuerte(){


  		System.out.println ("Bienvenido al  Menu del Desayuno de plato fuerte\n");
  		System.out.println ("Escogeras la opcion que mas te guste\n ");
  		System.out.println ("Recuerdad que cualquiera de los tres platos cuestan $45\n");
  		System.out.println (" 1.-Hot cakes\n 2.- Molletes \n 3.-Huevos a la Mexicana\n ");
  		System.out.println ("Dame el numero del plato que quisieras comer");
  		this.platofuerte = Objeto1.LeerNum();
  		this.preciofinal = this.preciofinal+45;

  }

  public final void getMenuDesayuno_bebida(){

  		float precio;

  		System.out.println ("Bienvenido al  Menu del Desayuno de bebida\n");
  		System.out.println ("Escogeras la opcion que mas te guste\n ");
  		System.out.println (" 1.-Refresco\n 2.- Jugo de Naranja \n 3.-Sin bebida\n ");      /// metodos
  		System.out.println ("Recuerdad que cualquiera de las dos bebidas cuestan $10\n");
  		System.out.println ("Dame el numero de bebida que quisieras tener");
  		this.bebida = Objeto1.LeerNum();
  		if(this.bebida != 3){
  			this.preciofinal = this.preciofinal+10;
  		}

  }

  public final void getMenuDesayuno_postre(){
  		System.out.println("Bienvenido al  Menu del Desayuno postre\n");
  		System.out.println("Escogeras la opcion que mas te guste\n");
  		System.out.println(" 1.-Fruta\n 2.- Flan Napolitano \n ");
  		System.out.println("Recuerda que cualquiera de los dos postres cuestan $15\n");
  		System.out.println("Dame el numero de postre que quisieras tener");
  		this.postre = Objeto1.LeerNum();
  		this.preciofinal=this.preciofinal+15;

  }

  public final void getMenuComida_platofuerte(){

    	System.out.println("Bienvenido al  Menu de Comida de plato fuerte\n");
  	    System.out.println("Escogeras la opcion que mas te guste\n");
  		System.out.println(" 1.-Enchiladas\n 2.-Mole de olla\n 3.-Pollo en pasilla ");
  		System.out.println("Dame el numero del plato que quisieras comer\n");
  		this.platofuerte=Objeto1.LeerNum();
  		this.preciofinal = this.preciofinal+60;

  }

  public final void getMenuComida_bebida(){

    	System.out.println("Bienvenido al  Menu de Comida de bebida\n");
  	    System.out.println("Escogeras la opcion que mas te guste \n");
  		System.out.println(" 1.-Refresco\n 2.-Agua de jaimaca\n 3.-Agua de horchata\n 4.-Sin bebida\n ");
  		System.out.println("Dame el numero de bebida que quisieras beber");
  		this.bebida=Objeto1.LeerNum();
  		if(this.bebida !=4)
  		this.preciofinal = this.preciofinal+15;

  }

  public final void getMenuComida_postre(){

    	System.out.println("Bienvenido al  Menu de Comida de bebida\n");
  	    System.out.println("Escogeras la opcion que mas te guste \n");
  		System.out.println(" 1.-Arroz con leche\n 2.-Geletina\n 3.-Natilla\n");
  		System.out.println("Dame el numero de postre que quisieras comer");
  		this.bebida=Objeto1.LeerNum();
  		if(this.bebida !=4)
  		this.preciofinal = this.preciofinal+15;

  }

  public final void getMenuCena_platofuerte(){

    	System.out.println("Bienvenido al  Menu de Cena de plato fuerte\n");
  	    System.out.println("Escogeras la opcion que mas te guste \n");
  		System.out.println(" 1.-Ceral con leche\n 2.-Pan Tostado\n 3.-Pan Dulce\n ");
  		System.out.println("Dame el numero del plato que quisieras comer");
  		this.platofuerte=Objeto1.LeerNum();
  		this.preciofinal = this.preciofinal+40;

  }

  public final void getMenuCena_bebida(){

    	System.out.println("Bienvenido al  Menu de Cena de plato fuerte\n");
  	    System.out.println("Escogeras la opcion que mas te guste \n");
  		System.out.println(" 1.-leche\n 2.-cafe\n 3.-te\n 4.-Sin bebida ");
  		System.out.println("Dame el numero de bebida que quisieras comer");
  		this.bebida=Objeto1.LeerNum();
  		if(this.bebida !=4)
  		this.preciofinal = this.preciofinal+15;

  }





 }
