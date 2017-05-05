/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantecubo;

public class RestauranteCubo {

    public static void main(String[] args) {

        int aux = 0;
        int numero = 0;

        Cliente cliente0 = new Cliente();

        Cliente cliente1 = new Cliente();

        Datos lector0 = new Datos();

        ClienteFrecuentes clientef = new ClienteFrecuentes();

        Menu menu0 = new Menu();

        Orden orden = new Orden();

        while (aux != 3) {
            System.out.println("\nBienvenido al Cubo");

            cliente0.mostrarMenu();
            aux = lector0.LeerNum();

            switch (aux) {

                case 1:

                    cliente0.AñadirCliente(cliente0.Registrarse());

                    break;

                case 2:

                    System.out.println("Bienvenido al Sistema de Login");
                    numero = clientef.getnumerodevisitas();
                    clientef.Comprobar(numero);
                    orden.MostarAyuda();

                    break;
                case 3:

                    System.out.println("Adios");

                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }

    }

}
