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
		}  catch(NumberFormatException e){
			System.out.println("Numero Invalido, no escribas palabras");
		}
		return x;
	}

	public long Leertelefonos(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String x="0";
		long aux=0;
		int a=0;
		while(a==0){
			try{
				x=br.readLine();
				aux=Long.parseLong(x);
				a++;

			}catch(IOException e){
				System.out.println("Numero Invalido");
			}catch(NumberFormatException e){
				System.out.println("Numero Invalido, no sea pendejo escribe numeros no letras idiota");

			}
		}

		return aux;

	}

	public double Leernumeros(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String x="0";
		double aux=0;
		int a=0;
		while(a==0){
			try{
				x=br.readLine();
				aux=Double.parseDouble(x);
				a++;

			}catch(IOException e){
				System.out.println("Numero Invalido");
			}catch(NumberFormatException e){
				System.out.println("Numero Invalido, no sea pendejo escribe numeros no letras idiota");

			}
		}

		return aux;

	}
}