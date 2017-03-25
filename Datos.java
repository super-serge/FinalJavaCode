import java.io.*;

public class Datos{

	private  String nombre;
	private  int edad;
	private  String sexo;

	public String LeerCad(){
		String x="0";

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		try{
			x=br.readLine();
		}
		catch (IOException ex){
			System.out.println("Caracteres invalidos");

		}
		return x;
	}

		public int LeerNum(){
			int x=0;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try{
				x=Integer.parseInt(br.readLine());

			}
			catch(IOException ex){
			System.out.println("Vuelve a teclear por favor");
		}
		return x;
	}
}