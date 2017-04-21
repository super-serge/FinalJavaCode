public class ClienteFrecuentes extends Cliente{
	private  static int numerodevisitas=10;

	Cliente cliente0 = new Cliente();

	public  int getnumerodevisitas(){
		int aux=0;
		int numero=0;
		aux=cliente0.ingresarlogin();
		numero=clientes.get(aux).contadorvisitas;

		return numero;
	}

	public void Comprobar(int parametro){

		if(parametro>=this.numerodevisitas){
			System.out.println("Eres cliente Frecuente y tus visitas son:"+parametro+"checa nuestra pagina para ver los beneficios");
		}
	}




}