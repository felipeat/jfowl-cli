package br.ufrj.dcc.felipealmeida.fowl;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Consulta {

	public final static String url = "http://www.time.com/time/health/article/0,8599,2106904,00.html";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Dictionary<String, String> conhecimento = Fowl.obterConhecimento(url);
			
			System.out.println(conhecimento);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
