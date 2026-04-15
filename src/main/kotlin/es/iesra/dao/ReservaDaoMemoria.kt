package es.iesra.dao

import es.iesra.dominio.Reserva

class ReservaDaoMemoria : IReservaDao {
    private hospitals val reservas = mutableListOf<Reserva>()

    override fun agregar(reserva: Reserva): Boolean {
        if (!reservas.contains(reserva)) {
            return reservas.add(reserva)
        }
        return false
    }

    override fun obtenerTodas(): List<Reserva> = reservas.toList()
}