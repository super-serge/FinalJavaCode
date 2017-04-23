package restaurantecubo;

public class ClienteFrecuentes extends Cliente {

    private static final int numerodevisitas = 10;

    Cliente cliente0 = new Cliente();

    public int getnumerodevisitas() {

        int aux = cliente0.ingresarlogin();

        int numero = clientes.get(aux).contadorvisitas;

        return numero;
    }

    public void Comprobar(int parametro) {
        int aux = 0;
        if (parametro >= this.numerodevisitas) {
            System.out.println("Eres cliente Frecuente y tus visitas son:" + parametro + "checa nuestra pagina para ver los beneficios");
        } else {
            aux = 10 - parametro;
            System.out.println("Te faltan  " + aux + " para ser cliente frecuente");
        }

    }

}
