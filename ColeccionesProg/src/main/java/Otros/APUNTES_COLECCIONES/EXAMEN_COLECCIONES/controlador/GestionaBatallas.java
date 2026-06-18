package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.EXAMEN_COLECCIONES.controlador;

import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.excepciones.BatallaException;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Batalla;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Casa;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Comandante;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.TipoBatalla;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.repositorio.RepositorioBatallas;

import java.time.LocalDate;
import java.util.List;

public class GestionaBatallas {

	public boolean agregaComandante(RepositorioBatallas repo, String idBatalla, Comandante comandante) throws BatallaException{

		try {
			repo.agregarComandante(comandante, idBatalla);
		}
		catch(BatallaException b){
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws BatallaException {

		System.out.println("=== INICIANDO PRUEBAS DEL SISTEMA ===\n");

		RepositorioBatallas repo = new RepositorioBatallas();
		GestionaBatallas gestiona = new GestionaBatallas();

		// Crear comandantes
		Comandante robb = new Comandante("Robb Stark", Casa.STARK, 5);
		Comandante jon = new Comandante("Jon Snow", Casa.STARK, 8);
		Comandante tywin = new Comandante("Tywin Lannister", Casa.LANNISTER, 10);
		Comandante jaime = new Comandante("Jaime Lannister", Casa.LANNISTER, 9);
		Comandante stannis = new Comandante("Stannis Baratheon", Casa.BARATHEON, 7);
		Comandante theon = new Comandante("Theon Greyjoy", Casa.GREYJOY, 4);

		// Crear batallas (futuras y pasadas)
		Batalla whispering = new Batalla("BAT001", "Batalla del Bosque Susurrante",
				LocalDate.of(2024, 6, 15), TipoBatalla.EMBOSCADA, Casa.STARK);
		whispering.setBajas(2000);

		Batalla blackwater = new Batalla("BAT002", "Batalla de Aguasnegras",
				LocalDate.of(2024, 7, 20), TipoBatalla.ASEDIO, Casa.LANNISTER);
		blackwater.setBajas(5000);

		Batalla bastardos = new Batalla("BAT003", "Batalla de los Bastardos",
				LocalDate.of(2024, 8, 10), TipoBatalla.CAMPO_ABIERTO, Casa.STARK);
		bastardos.setBajas(3500);

		Batalla muro = new Batalla("BAT004", "Batalla del Muro",
				LocalDate.now().plusDays(30), TipoBatalla.ASEDIO, Casa.STARK);
		muro.setBajas(1200);

		Batalla pyke = new Batalla("BAT005", "Asedio de Pyke",
				LocalDate.now().plusDays(60), TipoBatalla.ASEDIO, Casa.BARATHEON);
		pyke.setBajas(800);

		// PRUEBA 1: Agregar batallas al EXAMEN1.repositorio
		System.out.println("PRUEBA 1 - Agregar batallas al EXAMEN1.repositorio");
		repo.agregarBatalla(whispering);
		repo.agregarBatalla(blackwater);
		repo.agregarBatalla(bastardos);
		repo.agregarBatalla(muro);
		repo.agregarBatalla(pyke);
		System.out.println("✓ OK - Batallas agregadas al EXAMEN1.repositorio");
		System.out.println();

		// PRUEBA 2: Agregar comandantes a batallas FUTURAS (debe funcionar)
		System.out.println("PRUEBA 2 - Agregar comandantes a batalla futura");
		boolean agregado1 = gestiona.agregaComandante(repo, "BAT004", jon);
		boolean agregado2 = gestiona.agregaComandante(repo, "BAT004", jon); // Jon aparece 2 veces
		boolean agregado3 = gestiona.agregaComandante(repo, "BAT004", theon);
		boolean agregado4 = gestiona.agregaComandante(repo, "BAT005", stannis);

		if (agregado1 && agregado2 && agregado3 && agregado4) {
			System.out.println("✓ OK - Comandantes agregados correctamente a batallas futuras");
		} else {
			System.out.println("✗ ERROR - No se pudieron agregar los comandantes");
		}
		System.out.println();

		// PRUEBA 3: Intentar agregar comandante a batalla PASADA (debe fallar)
		System.out.println("PRUEBA 3 - Intentar agregar comandante a batalla pasada");
		boolean agregadoPasada = gestiona.agregaComandante(repo, "BAT001", robb);

		if (!agregadoPasada) {
			System.out.println("✓ OK - Excepción capturada correctamente para batalla pasada");
		} else {
			System.out.println("✗ ERROR - Debería haber devuelto false");
		}
		System.out.println();

		// PRUEBA 4: Intentar agregar comandante a batalla inexistente (debe fallar)
		System.out.println("PRUEBA 4 - Intentar agregar comandante a batalla inexistente");
		boolean agregadoInexistente = gestiona.agregaComandante(repo, "BAT999", tywin);

		if (!agregadoInexistente) {
			System.out.println("✓ OK - Excepción capturada correctamente para batalla inexistente");
		} else {
			System.out.println("✗ ERROR - Debería haber devuelto false");
		}
		System.out.println();

		// PRUEBA 5: Buscar batalla existente (devuelve la batalla)
		System.out.println("PRUEBA 5 - Buscar batalla existente");
		Batalla encontrada = repo.buscarBatalla("BAT002");
		if (encontrada != null && encontrada.getNombre().equals("Batalla de Aguasnegras")) {
			System.out.println("✓ OK - Batalla encontrada: " + encontrada);
		} else {
			System.out.println("✗ ERROR - Batalla no encontrada");
		}
		System.out.println();

		// PRUEBA 6: Buscar batalla inexistente (devuelve null)
		System.out.println("PRUEBA 6 - Buscar batalla inexistente");
		Batalla noEncontrada = repo.buscarBatalla("BAT888");
		if (noEncontrada == null) {
			System.out.println("✓ OK - Devuelve null para batalla inexistente");
		} else {
			System.out.println("✗ ERROR - Debería devolver null");
		}
		System.out.println();

		// PRUEBA 7: Actualizar batalla existente
		System.out.println("PRUEBA 7 - Actualizar batalla existente");
		Batalla muroActualizado = new Batalla("BAT004", "Batalla del Muro - Actualizada",
				LocalDate.now().plusDays(30), TipoBatalla.ASEDIO, Casa.STARK);
		muroActualizado.setBajas(1500);
		repo.agregarBatalla(muroActualizado);

		Batalla actualizada = repo.buscarBatalla("BAT004");
		if (actualizada != null && actualizada.getBajas() == 1500) {
			System.out.println("✓ OK - Batalla actualizada correctamente");
		} else {
			System.out.println("✗ ERROR - La batalla no se actualizó");
		}
		System.out.println();

		// PRUEBA 8: Obtener comandantes únicos ordenados (sin repetidos)
		System.out.println("PRUEBA 8 - Obtener comandantes únicos ordenados de BAT004");
		List<Comandante> comandantes = repo.obtenerComandantesOrdenados("BAT004");
		if (comandantes.size() == 2) { // Jon y Theon, sin repetir a Jon
			// Verificar orden: GREYJOY < STARK
			if (comandantes.get(0).getCasa() == Casa.GREYJOY &&
					comandantes.get(1).getCasa() == Casa.STARK) {
				System.out.println("✓ OK - Comandantes únicos ordenados correctamente:");
				for (Comandante c : comandantes) {
					System.out.println("  - " + c);
				}
			} else {
				System.out.println("✗ ERROR - El orden no es correcto");
			}
		} else {
			System.out.println("✗ ERROR - Se esperaban 2 comandantes únicos, se encontraron " + comandantes.size());
		}
		System.out.println();

		// PRUEBA 9: Obtener comandantes de batalla inexistente (devuelve lista vacía)
		System.out.println("PRUEBA 9 - Obtener comandantes de batalla inexistente");
		List<Comandante> comandantesInexistente = repo.obtenerComandantesOrdenados("BAT999");
		if (comandantesInexistente.isEmpty()) {
			System.out.println("✓ OK - Devuelve lista vacía para batalla inexistente");
		} else {
			System.out.println("✗ ERROR - Debería devolver lista vacía");
		}
		System.out.println();

		// PRUEBA 10: Obtener batallas menos sangrientas (ordenadas de menor a mayor bajas)
		System.out.println("PRUEBA 10 - Obtener batallas menos sangrientas");
		List<Batalla> menosSangrientas = repo.obtenerBatallasMenosSangrientas();
		if (menosSangrientas.size() == 5) {
			boolean ordenCorrecto = menosSangrientas.get(0).getBajas() <= menosSangrientas.get(1).getBajas()
					&& menosSangrientas.get(1).getBajas() <= menosSangrientas.get(2).getBajas();
			if (ordenCorrecto) {
				System.out.println("✓ OK - Batallas ordenadas de menos a más sangrientas:");
				for (Batalla b : menosSangrientas) {
					System.out.println("  - " + b + ": " + b.getBajas() + " bajas");
				}
			} else {
				System.out.println("✗ ERROR - El orden no es correcto");
			}
		} else {
			System.out.println("✗ ERROR - Se esperaban 5 batallas, se encontraron " + menosSangrientas.size());
		}
		System.out.println();

		System.out.println("=== FIN DE PRUEBAS ===");


	}
}
