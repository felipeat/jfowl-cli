package br.ufrj.dcc.felipealmeida.fowl.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import br.ufrj.dcc.felipealmeida.fowl.Entidade;
import br.ufrj.dcc.felipealmeida.fowl.EntidadesMgr;

public class RelacTest {

	@Test
	public void test() {
		ArrayList<Entidade> entidades = new ArrayList<Entidade>();
		
		// ENTIDADE 1 = ETA
		Entidade e1 = new Entidade("http://dbpedia.org/resource/Eta_Carinae");
		
		ArrayList<String> assuntos_e1 = new ArrayList<String>();
		assuntos_e1.add("Estrela");
		assuntos_e1.add("Cosmo");
		assuntos_e1.add("Nebulosa");
		assuntos_e1.add("Astronomia");
		assuntos_e1.add("Galaxia");
		assuntos_e1.add("Importante");
		
		e1.setAssuntos(assuntos_e1);
		
		entidades.add(e1);
		
		// ENTIDADE 2 = HOMUNCULUS
		Entidade e2 = new Entidade("http://dbpedia.org/resource/Homunculus");
		
		ArrayList<String> assuntos_e2 = new ArrayList<String>();
		assuntos_e2.add("Galaxia");
		assuntos_e2.add("Enorme");
		
		e2.setAssuntos(assuntos_e2);
		
		entidades.add(e2);
		
		// ENTIDADE 3 = Sirius
		Entidade e3 = new Entidade("http://dbpedia.org/resource/Sirius");
		
		ArrayList<String> assuntos_e3 = new ArrayList<String>();
		assuntos_e3.add("Estrela");
		assuntos_e3.add("Cosmo");
		assuntos_e3.add("Nebulosa");
		assuntos_e3.add("Astronomia");
		
		e3.setAssuntos(assuntos_e3);
		
		entidades.add(e3);
		
		// ENTIDADE 4 = LIGHT
		Entidade e4 = new Entidade("http://dbpedia.org/resource/Light");
		
		ArrayList<String> assuntos_e4 = new ArrayList<String>();
		assuntos_e4.add("Luz");
		
		e4.setAssuntos(assuntos_e4);
		
		entidades.add(e4);
		
		// ENTIDADE 5 = LIGHT
		Entidade e5 = new Entidade("http://dbpedia.org/resource/Light-Year");
		
		ArrayList<String> assuntos_e5 = new ArrayList<String>();
		assuntos_e5.add("Luz");
		
		e5.setAssuntos(assuntos_e5);
		
		entidades.add(e5);
		
		// ENTIDADE 6 = EARTH
		Entidade e6 = new Entidade("http://dbpedia.org/resource/Earth");
		
		ArrayList<String> assuntos_e6 = new ArrayList<String>();
		assuntos_e6.add("Terra");
		
		e6.setAssuntos(assuntos_e6);
		
		entidades.add(e6);
		
		
		EntidadesMgr.criarLigacoes(entidades);
		
		assertEquals(1, 1);
	}

}
