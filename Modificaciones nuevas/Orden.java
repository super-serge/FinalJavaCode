/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantecubo;

/**
 *
 * @author luisfernando
 */
public class Orden {

    private int numeroOrden;
    private int bebida;
    private int comida;
    private int paquete;
    private String peticion;
    private int tiempoPreparacion;
    private int precio;

    Datos lector = new Datos();
    Menu menu = new Menu();
    Tiempo tiempo = new Tiempo();

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public int getBebida() {
        return bebida;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPeticion() {
        return peticion;
    }

    public void setPeticion(String peticion) {
        this.peticion = peticion;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getPaquete() {
        return paquete;
    }

    public void setPaquete(int paquete) {
        this.paquete = paquete;
    }

    public void AsignarNumeroOrden() {

        this.numeroOrden = this.numeroOrden + 1;
    }

    public void SeleccionarBebida() {

        System.out.println("Selecciona un numero de bebida");
        this.bebida = lector.LeerNum();
        this.tiempoPreparacion = this.tiempoPreparacion + 10;
        this.precio = precio + 15;

    }

    public void SeleccionarComida() {

        System.out.println("Selecciona un numero de Comida");
        this.comida = lector.LeerNum();
        this.tiempoPreparacion = this.tiempoPreparacion + 15;
        this.precio = this.precio + 35;

    }

    public void SeleccionarPaquete() {

        System.out.println("Selecciona un numero de Paquete");
        this.paquete = lector.LeerNum();
        this.tiempoPreparacion = this.tiempoPreparacion + 30;
        this.precio = this.precio + 45;

    }

    public void MostarAyuda() {
        int opcion;
        String aux;

        System.out.println("1.-Seleccion por partes \n 2.-Seleccion por Paquetes");
        System.out.println("Selcciona una opcion");
        opcion = lector.LeerNum();
        Orden OrdenNueva = new Orden();

        OrdenNueva.AsignarNumeroOrden();

        switch (opcion) {

            case 1:

                menu.MostarMenu();
                OrdenNueva.SeleccionarBebida();
                OrdenNueva.SeleccionarComida();

                break;

            case 2:
                menu.MostarMenu();
                OrdenNueva.SeleccionarPaquete();
                break;

            case 3:
                System.out.println("Opcion no valida");

        }

        System.out.println("Deseas Poner algun comentario (S/N)");
        aux = lector.LeerCad();
        if (aux.equals("S") || aux.equals("s")) {
            System.out.println("Escibre tu comentario");
            OrdenNueva.peticion = lector.LeerCad();
        } else {
            OrdenNueva.peticion = "";
        }

        this.MostarOrden(OrdenNueva);
    }

    public void MostarOrden(Orden NuevaOrden) {

        System.out.println("El tiempo de preparacion es:" + NuevaOrden.tiempoPreparacion);
        System.out.println("El Precio Total es:" + NuevaOrden.precio);
        System.out.println("Pase a la caja para pagar");

    }

}
