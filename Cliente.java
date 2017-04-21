import java.util.ArrayList;
public class Cliente{
	protected String usuario;
	protected String password;
	protected String nombre;
	protected Long telefono;
	protected String email;
	protected int contadorvisitas;
	public static  ArrayList<Cliente> clientes= new ArrayList<Cliente>();

	Datos lector0=new Datos();
	//ClienteNuevo registro = new ClienteNuevo();
	
	

	public Cliente(){
	}

	public void mostrarMenu(){
		System.out.println("1.-Registrarte\n 2 .-Inicia Sesion \n 3.-Salir");
	}

	public int getContadorVisitas(){
		return this.contadorvisitas;
	}

	public void setContadorVisitas(int contador_parametro){
		this.contadorvisitas=contador_parametro;
	}

	public String getUsuario(){
		String aux="0";

		System.out.print("Usuario:");
		aux=lector0.LeerCad();

		return aux;
	}
	/*public boolean getUsuario(String usuario){
		boolean aux=true;
		for(i=0;i<clientes.size();i++){
		if(usuario.equals(clientes.get(i).usuario)) {
			aux=false;
			break;
		}

	}

		return aux;
	}*/

	public void setUsuario(String usuario_parametro){

		this.usuario=usuario_parametro;


	}
	public String getPassword(){
		String aux="0";

		System.out.print("Password:");
		aux=lector0.LeerCad();
		return aux;

	}

	public void setPassword(String password_parametro){
		this.password=password_parametro;
		
	}
	public String getNombre(){
		String aux="0";

		System.out.print("Nombre:");
		aux=lector0.LeerCad();
		return aux;

	}

	public void setNombre(String nombre_parametro){
		this.nombre=nombre_parametro;
	}

	public Long getTelefono(){

		Long aux=0L;

		System.out.print("Telefono:");
		aux=lector0.Leertelefonos();

		return aux;

	}

	public void setTelefono(long telefono_parametro){
		this.telefono=telefono_parametro;
		
	}
	public String getEmail(){
		String aux="0";

		System.out.print("Email:");
		aux=lector0.LeerCad();
		return aux;

	}

	public void setEmail(String email_parametro){
		this.email=email_parametro;

	}

	

	

	public int verificarlogin( String usuario_ingresar ,String password_ingresar){
		int i=0;
		int a=0;

		for(i=0;i<clientes.size();i++){

			if(usuario_ingresar.equals(clientes.get(i).usuario) && password_ingresar.equals(clientes.get(i).password) ){
				a++;
				clientes.get(i).contadorvisitas=this.contadorvisitas+1;

				break;
			}
		}
		return a;
	}

	public int ingresarlogin(){
		String usuario_aux="0";
		String password_aux="0";
		int verificador=2;
		String opcion="0";
		int a=0;

		do{
			System.out.println("Usuario:");
			usuario_aux=lector0.LeerCad();			
			System.out.println("Password:");
			password_aux=lector0.LeerCad();
			verificador=verificarlogin(usuario_aux, password_aux);
			if(verificador==1){
				System.out.println("Acceso correcto");
				
			}else{
				System.out.println("usuarios o password incorrectos");
				System.out.println("Quieres volver a intentarlo (s/n)");
				opcion=lector0.LeerCad();			
			}
			}while(verificador == 0 || opcion.equals("s"));
			return a;
		}


	}