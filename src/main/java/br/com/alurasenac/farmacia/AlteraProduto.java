package br.com.alurasenac.farmacia;


import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.util.Util;
import javax.persistence.EntityManager;

public class AlteraProduto {
    public static void main(String[] args) {

        //Chamando o driver para conectar no banco e cadastrar
        EntityManager em = Util.getEntityManager();
        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        var pro = produtoDao.buscarId(3);
        pro.setNome("A 24 MAX");

        produtoDao.alterar(pro);

        //Fechando a conexão
        em.getTransaction().commit();
        em.close();
    }
}
