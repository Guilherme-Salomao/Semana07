package br.com.alurasenac.farmacia;

import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.util.Util;

import javax.persistence.EntityManager;

public class ExcluirProduto {
    public static void main(String[] args) {
        //Chamando o driver para conectar no banco e cadastrar
        EntityManager em = Util.getEntityManager();
        em.getTransaction().begin();

        //Pegando a classe ADM de Produto
        ProdutoDao produtoDao = new ProdutoDao(em);

        //Produto que vai excluir
        var pro = produtoDao.buscarId(3);
        produtoDao.deletar(pro);

        //Fechando a conexão
        em.getTransaction().commit();
        em.close();
    }

}
