
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuscaBinariaTest {

	private List<Integer> lista;

	@Before
	public void setUp() {

		Integer e1 = 10;
		Integer e2 = 9;
		Integer e3 = 8;
		Integer e4 = 7;
		Integer e5 = 6;
		Integer e6 = 5;
		Integer e7 = 4;
		Integer e8 = 3;
		Integer e9 = 2;
		Integer e10 = 1;

		this.lista = new ArrayList<Integer>();
		this.lista.add(e10);
		this.lista.add(e4);
		this.lista.add(e2);
		this.lista.add(e8);
		this.lista.add(e1);
		this.lista.add(e9);
		this.lista.add(e3);
		this.lista.add(e7);
		this.lista.add(e5);
		this.lista.add(e6);

	}

	@Test
	public void buscarTest() {
		BuscaBinaria buscaBinaria = new BuscaBinaria(this.lista);

		Integer valor = 7;
		int resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 6);

		valor = 3;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 2);
		
		valor = 4;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 3);
		
		valor = 2;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 1);
		
		valor = 1;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 0);
		
		valor = 10;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 9);		

		valor = 11;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado == -1);

		valor = 40;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado == -1);

		this.lista = null;
		valor = 4;
		buscaBinaria = new BuscaBinaria(this.lista);
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado == -1);

		this.lista = new ArrayList<Integer>();
		buscaBinaria = new BuscaBinaria(this.lista);
		valor = 4;
		resultado = buscaBinaria.buscar(valor);
		Assert.assertTrue(resultado == -1);

	}
}
