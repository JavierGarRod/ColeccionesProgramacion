package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.EXAMEN_COLECCIONES.repositorio;

import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.excepciones.BatallaException;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Batalla;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Comandante;

import java.util.*;

public class RepositorioBatallas {

	//atributos

	private Set<Batalla> batallas; // es una colección HashSet porque no permite duplicados y no me exije orden, además es rápido en búsquedas, insercciones e eliminaciones

	//constructor

	public RepositorioBatallas() {
		super();
		this.batallas = new HashSet<>(); // si las batallas tienen el mismo id, no las añade
	}

	//métodos

	public void agregarBatalla(Batalla batalla) {
		Iterator<Batalla> itBatalla = batallas.iterator();
		boolean encontrada = false;
		do {
			Batalla b = itBatalla.next();
			if (b.getIdBatalla().equals(batalla.getIdBatalla())) {
					itBatalla.remove();
					batallas.add(batalla);
					encontrada = true;
			}
		} while (itBatalla.hasNext());
		if (!encontrada)
			agregarBatalla(batalla);
	}


	public void agregarComandante(Comandante comandante, String idBatalla) throws BatallaException {
		Iterator<Batalla> itBatalla = batallas.iterator();
		boolean encontrada = false;

		do {
			Batalla b = itBatalla.next();
			if (b.getIdBatalla().equals(idBatalla)) {
				agregarComandante(comandante,idBatalla);
			}
		} while (itBatalla.hasNext());
		if (!encontrada){
			throw new BatallaException("INVÁLIDO, labatalla no existe");
		}
	}


	public Batalla buscarBatalla(String idBatalla) {
		Iterator<Batalla> batallaIterator = batallas.iterator();

		do {
			Batalla b = batallaIterator.next();
			if (b.getIdBatalla().equals(idBatalla)) {
				return b;
			}
		} while (batallaIterator.hasNext());

		return null;
	}


	public List<Comandante> obtenerComandantesOrdenados(String idBatalla) {
		Iterator<Batalla> itbatalla = batallas.iterator();

		do {
			Batalla b = itbatalla.next();
			if (b.getIdBatalla().equals(idBatalla)) {

				System.out.println("\n---ORDENACIÓN POR CASA---");
				List<Comandante> copia1 = new ArrayList<>();
				Collections.sort(copia1);
				copia1.forEach(System.out::println); //esto imprime a cada comandante en orden

				System.out.println("--------------------------------");
				System.out.println("---ORDENACIÓN POR NOMBRE---");
				List<Comandante> copia2 = new ArrayList<>();
				Orden_nombre ordenNombre = new Orden_nombre();
				Collections.sort(copia2,ordenNombre);
				copia2.forEach(System.out::println);
			}
		} while (itbatalla.hasNext());

		return new ArrayList<>();
	}


	public List<Batalla> obtenerBatallasMenosSangrientas() {
		Iterator<Batalla> itbatallas = batallas.iterator();

		do {
			Batalla b = itbatallas.next();
			if (b.getBajas() >= 1) {
				List<Batalla> batallaList = new ArrayList<>();
				System.out.println("\n ---LISTA ORDENADA DE BATALLAS SANGRIENTAS---");
				Collections.sort(batallaList);
				batallaList.forEach(System.out::println);
			}
		} while (itbatallas.hasNext());
		return new ArrayList<>();
	}

}
