package br.com.pip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void test() {
		assertEquals(4, new Produto().soma(2, 2));
	}

}
