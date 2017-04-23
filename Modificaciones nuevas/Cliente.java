package restaurantecubo;

import java.util.ArrayList;

public class Cliente {

    protected String usuario;
    protected String password;
    protected String nombre;
    protected Long telefono;
    protected String email;
    protected int contadorvisitas;
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    Datos lector0 = new Datos();

    public Cliente() {
    }

    public void mostrarMenu() {
        System.out.println(" 1.-Registrarte\n 2 .-Inicia Sesion \n 3.-Salir");
    }

    public int getContadorVisitas() {
        return this.contadorvisitas;
    }

    public void setContadorVisitas(int contador_parametro) {
        this.contadorvisitas = contador_parametro;
    }

    public String getUsuario2() {

        System.out.print("Usuario:");
        String aux = lector0.LeerCad();

        return aux;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public int getContadorvisitas() {
        return this.contadorvisitas;
    }

    public void setContadorvisitas(int contadorvisitas) {
        this.contadorvisitas = contadorvisitas;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Cliente.clientes = clientes;
    }

    public Datos getLector0() {
        return lector0;
    }

    public void setLector0(Datos lector0) {
        this.lector0 = lector0;
    }

    public void setUsuario(String usuario_parametro) {

        this.usuario = usuario_parametro;

    }

    public String getPassword2() {

        System.out.print("Password:");
        String aux = lector0.LeerCad();
        return aux;

    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password_parametro) {
        this.password = password_parametro;

    }

    public String getNombre2() {

        System.out.print("Nombre:");
        String aux = lector0.LeerCad();
        return aux;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre_parametro) {
        this.nombre = nombre_parametro;
    }

    public Long getTelefono2() {

        System.out.print("Telefono:");
        Long aux = lector0.Leertelefonos();

        return aux;

    }

    public Long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono_parametro) {
        this.telefono = telefono_parametro;

    }

    public String getEmail2() {

        System.out.print("Email:");
        String aux = lector0.LeerCad();
        return aux;

    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email_parametro) {
        this.email = email_parametro;

    }

    public int[] verificarlogin(String usuario_ingresar, String password_ingresar) {
        int[] a = new int[2];

        for (int i = 0; i < clientes.size(); i++) {

            if (usuario_ingresar.equals(clientes.get(i).usuario) && password_ingresar.equals(clientes.get(i).password)) {
                a[0]++;
                a[1] = i;
                clientes.get(i).contadorvisitas = this.contadorvisitas + 1;

                break;
            }
        }
        return a;
    }

    public int ingresarlogin() {

        String opcion = "0";
        int a = 0;
        int[] verificador = new int[2];

        do {
            System.out.println("Usuario:");
            String usuario_aux = lector0.LeerCad();
            System.out.println("Password:");
            String password_aux = lector0.LeerCad();
            verificador = verificarlogin(usuario_aux, password_aux);
            if (verificador[0] == 1) {
                System.out.println("Acceso correcto");

            } else {
                System.out.println("usuarios o password incorrectos");
                System.out.println("Quieres volver a intentarlo (s/n)");
                opcion = lector0.LeerCad();
            }
        } while (verificador[0] == 0 || opcion.equals("s"));

        return verificador[1];

    }

    public Cliente Registrarse() {

        Cliente ClienteNuevo = new Cliente();

        System.out.println("Bienvenido al sistema de registro");
        ClienteNuevo.setUsuario(this.getUsuario2());
        ClienteNuevo.setPassword(this.getPassword2());
        ClienteNuevo.setNombre(this.getNombre2());
        ClienteNuevo.setTelefono(this.getTelefono2());
        ClienteNuevo.setEmail(this.getEmail2());
        ClienteNuevo.setContadorVisitas(0);

        return ClienteNuevo;

    }

    public void AñadirCliente(Cliente Nuevo) {
        if (Nuevo != null) {
            clientes.add(Nuevo);
            System.out.println("Registro Satisfactorio\n");
        } else {
            System.out.println("No pudo registarse por el momento\n");
        }

    }

    @Override
    public String toString() {
        return "Cliente{" + "usuario=" + usuario + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", contadorvisitas=" + contadorvisitas + '}';
    }

    public void impresiondatos(int numerocliente) {

        System.out.println(clientes.get(numerocliente).toString());

    }
}
