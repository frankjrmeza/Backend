/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicio;

import com.api.Backend.modelos.Reserva;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ReservaServicios {
    public List<Reserva> getReservas();
    public void save(Reserva r);
    public Reserva getReserva(String id);
    public void delete(String id);
    
}
