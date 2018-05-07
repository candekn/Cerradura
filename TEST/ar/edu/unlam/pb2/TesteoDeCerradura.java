package ar.edu.unlam.pb2;
//Rosario Delgado, Programacion 2 UNLaM.

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteoDeCerradura {

	@Test
	public void testCreacionDeCerradura() {
		Cerradura cerraduraUno = new Cerradura(27777, 3);
		cerraduraUno.abrirCerradura(27777);
		Integer esperado=27777;
		assertEquals(esperado, cerraduraUno.getContrasenia());	
	}
	@Test
	public void testAbrirCerradura(){
		Cerradura cerraduraDos = new Cerradura(5410, 2);
		assertTrue(cerraduraDos.abrirCerradura(5410));
	}
	@Test 
	public void testQueNoAbraCerradura(){
		Cerradura cerraduraTres = new Cerradura(454, 3);
		cerraduraTres.abrirCerradura(454);
		assertFalse(cerraduraTres.cerrarCerradura());
	}
	@Test
	public void testCerraduraCerradaPorBloqueo(){
		Cerradura cerradura4 = new Cerradura(78910,2);
		cerradura4.abrirCerradura(24520);
		cerradura4.abrirCerradura(9797);
		cerradura4.abrirCerradura(78910);
		assertFalse(cerradura4.abrirCerradura(78910)); //Aunque ponga la clave correcta, no se abre porque está bloqueada.
	}
}
