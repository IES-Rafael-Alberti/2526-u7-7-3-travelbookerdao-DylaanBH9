package es.iesra.datos

import es.iesra.dominio.Reserva
import es.iesra.dao.IReservaDao

class ReservaRepository(private val reservaDao: IReservaDao) : IReservaRepository {

    override fun agregar(reserva: Reserva): Boolean {
        return reservaDao.agregar(reserva)
    }

    override fun obtenerTodas(): List<Reserva> {
        return reservaDao.obtenerTodas()
    }
}