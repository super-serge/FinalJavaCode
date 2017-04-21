public class SeleccionComida{
	protected int opcion;
	protected int platofuerte;  //Atributos
	protected int bebida;
	protected int postre;
	public float preciofinal;

	public SeleccionComida(){
	}

	public int getOpcion(){
		return this.opcion;
	}

	public int getOpcion(int n){//sobrecarga
		if(n>=4){
			this.opcion=4;					//metodos
		}
		return this.opcion;
	}

	public void setOpcion(int n){

		this.opcion=n;
	}

	public void Mostrarprecio(){

		System.out.println("Tu precio a pagar es :"+this.preciofinal);

	}

	public float Mostrarprecio(float precio){

		this.preciofinal=precio;

		System.out.println("El precio es"+this.preciofinal+"Puedes pagar en la caja siguiente");

		return this.preciofinal;
	}

}