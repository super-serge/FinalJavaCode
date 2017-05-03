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
public class Tiempo {

    private int TiempoPreparacion;

    public int getTiempoPreparacion() {
        return TiempoPreparacion;
    }

    public void setTiempoPreparacion(int TiempoPreparacion) {
        this.TiempoPreparacion = TiempoPreparacion;
    }

    public void SumarTiempo(int preparacion) {
        this.TiempoPreparacion = this.TiempoPreparacion + preparacion;
    }

}
