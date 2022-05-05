package amazontestdez;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementosweb.Elementos;
import metodosdez.MetodosDeTeste;

public class PesquisarProduto {

	MetodosDeTeste metodos = new MetodosDeTeste();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {

		metodos.abrirNavegador("CHROME", "https://www.amazon.com.br");

	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void testPesquisarProduto() {
		metodos.preencher(el.pesquisar, "notebook");
		metodos.clicar(el.lupaPesquisa);

	}

}
