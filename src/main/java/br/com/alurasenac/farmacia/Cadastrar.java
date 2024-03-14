package br.com.alurasenac.farmacia;

import br.com.alurasenac.farmacia.dao.FabricanteDao;
import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.modelo.Fabricante;
import br.com.alurasenac.farmacia.modelo.Produto;
import br.com.alurasenac.farmacia.util.Util;

import javax.persistence.EntityManager;

public class Cadastrar {

    public static void main(String[] args) {

        //Criando as variaveis para cadastrar
        Fabricante fabricante =  new Fabricante("Samsung");
        Produto produto =  new Produto("4gb de memoria", "A24", 1558.30,fabricante);

        //Chamando o driver para conectar no banco e cadastrar
        EntityManager em = Util.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        FabricanteDao fabricanteDao = new FabricanteDao(em);
        em.getTransaction().begin();

        //Cadastrando
        produtoDao.cadastrar(produto);
        fabricanteDao.cadastrar(fabricante);

        //Fechando a conexão
        em.getTransaction().commit();
        em.close();
    }
}
