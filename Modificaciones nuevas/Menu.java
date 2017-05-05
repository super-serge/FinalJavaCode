/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantecubo;

import java.util.*;

public class Menu {

    public Menu() {

    }

    public void ImprimirMenuDesayunos() {
        System.out.println("\n\tBienvenido al Cubo");
        System.out.println("Desayunos\t tiempo de preparacion   precio");
        System.out.println("1.-Hot cakes\t \t 15 \t \t $35");
        System.out.println("2.-Huevo estrellados \t 15 \t\t $35");
        System.out.println("3.-Molletes \t\t 15 \t\t $35");
        System.out.println("\nBebidas\t tiempo de preparacion   precio");
        System.out.println("4.-Cafe \t\t 10  \t\t15 ");
        System.out.println("5.-Jugo de Naranja \t 10 \t\t15 ");
        System.out.println("\nPaquetes \t\t\t\t tiempo de preparacion  \t precio");
        System.out.println("7.- Desayuno Americano(Huevo,cafe)\t\t\t 30 \t\t $45");
        System.out.println("8.-Desayuno Europeo(Hot cakes , Jugo de Naranja)\t 30 \t\t $45");
    }

    public void imprimirMenuComida() {
        System.out.println("\n\tBienvenido al Cubo");
        System.out.println("Comidas\t \t\ttiempo de preparacion   precio");
        System.out.println("1.-Chicharron en salsa verde\t \t 15 \t \t $35");
        System.out.println("2.-Tacos de Pollo\t\t \t 15 \t\t $35");
        System.out.println("3.-Enchiladas\t  \t\t\t 15 \t\t $35");
        System.out.println("\nBebidas\t tiempo de preparacion     precio");
        System.out.println("4.-Refresco \t\t 10  \t\t15 ");
        System.out.println("5.-Agua de Horcahta \t 10 \t\t15 ");
        System.out.println("\nPaquetes \t\t\t\t\t tiempo de preparacion  \t precio");
        System.out.println("7.- Comida Corrida(Chicharron,Agua de horchata)\t\t\t 30 \t\t $45");
        System.out.println("8.- Comida Ejecutiva(Tacos de pollo , Agua de Horchata)\t\t 30 \t\t $45");
    }

    public void ImprimirMenuCena() {
        System.out.println("\n\tBienvenido al Cubo");
        System.out.println("Cenas\t \t\ttiempo de preparacion   precio");
        System.out.println("1.-Molletes\t \t 15 \t \t $35");
        System.out.println("2.-Pan Tostado  \t 15 \t\t $35");
        System.out.println("3.-Enchiladas\t  \t\t\t 15 \t\t $35");
        System.out.println("\nBebidas\t tiempo de preparacion     precio");
        System.out.println("4.-Refresco \t\t 10  \t\t15 ");
        System.out.println("5.-Cafe \t 10 \t\t15 ");
        System.out.println("\nPaquetes \t\t\t\t\t tiempo de preparacion  \t precio");
        System.out.println("7.- Cena Ligera(Ceral con leche y pan dulce )\t\t 30 \t\t $45");
        System.out.println("8.- Cena Dulce(pan dulce y cafe con leche )\t\t 30 \t\t $45");
    }

    public int gethorario() {
        int horario = 0;
        Calendar calendario = new GregorianCalendar();
        int aux = calendario.get(Calendar.HOUR_OF_DAY);

        if (aux < 9 && aux > 19) {
            horario = 0;
        }
        if (aux >= 9 && aux < 13) {
            horario = 1;
        }
        if (aux >= 13 && aux < 17) {
            horario = 2;
        }
        if (aux >= 17 && aux <= 19) {
            horario = 3;
        }
        return horario;
    }

    public void MostarMenu() {

        int hora = this.gethorario();

        switch (hora) {

            case 0:
                System.out.println("Cerrado");
                break;
            case 1:
                System.out.println("Hora del Desayuno");
                this.ImprimirMenuDesayunos();
                break;
            case 2:
                System.out.println("Hora de Comida");
                this.imprimirMenuComida();
                break;
            case 3:
                System.out.println("Hora de la Cena");
                this.ImprimirMenuCena();
                break;
        }

    }

}
