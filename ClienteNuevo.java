public class  ClienteNuevo extends Cliente {
	private int numeroderegistro=0;
  
   

  	public ClienteNuevo(String usuario , String password , String nombre , long telefono, String email, int n ){
  		this.usuario=usuario;
  		this.password=password;
  		this.nombre=nombre;
  		this.telefono=telefono;
  		this.email=email;
  		this.numeroderegistro=n;


  	}

  	public ClienteNuevo(){
  		super();
  	}

	public void aumentarnumerosderegistros(){
		this.numeroderegistro=this.numeroderegistro+1;
	}
	public int  getnumeroderegistros(){
		return this.numeroderegistro;
	}

	public void setnumeroderegistro(int numerosderegistros_aux){
		this.numeroderegistro=numerosderegistros_aux;
	}

	public  ClienteNuevo registrarse(){
		int aux=0;
		String usuario="0";
		String password="0";
		String nombre="0";
		long telefono=0L;
		String email="0";

		

		
		while(aux==0){
			usuario=getUsuario();
			password=getPassword();
			nombre=getNombre();
			telefono=getTelefono();
			email=getEmail();
			aux=verificarregistro(usuario);

			if(aux==0){
				System.out.println("Registro Satisfactorio");
				aux++;
				aumentarnumerosderegistros();
				
			}else{
				System.out.println("EL usuario ya existe ");
			}
		}
			ClienteNuevo cliente = new ClienteNuevo(usuario,password,nombre,telefono,email,getnumeroderegistros());

		return cliente;
	}

	public int verificarregistro(String parametro ){
		int i=0;
		int a=0;

		for(i=0;i<clientes.size();i++){

			if(clientes.get(i).usuario.equals((parametro)) ) {
				a++;
			}
		}
		return a;
	}


}