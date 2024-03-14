package br.com.alurasenac.farmacia;

import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.modelo.Produto;
import br.com.alurasenac.farmacia.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class ListarProduto {
    public static void main(String[] args) {

        //Conectando ao banco
        EntityManager em = Util.getEntityManager();

        //Pegando a classe que adm o produto
        ProdutoDao produtoDao = new ProdutoDao(em);

        List<Produto> todos = produtoDao.buscarTodos();
        todos.forEach(p -> System.out.println("Produto: " + p.getNome()));
    }
}
