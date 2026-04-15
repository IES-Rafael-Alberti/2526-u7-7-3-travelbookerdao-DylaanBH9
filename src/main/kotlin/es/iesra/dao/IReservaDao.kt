package es.iesra.dao

import es.iesra.dominio.Reserva

interface IReservaDao {
    fun agregar(reserva: Reserva): Boolean
    fun obtenerTodas(): List<Reserva>
}