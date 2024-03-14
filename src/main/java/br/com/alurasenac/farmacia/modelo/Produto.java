package br.com.alurasenac.farmacia.modelo;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fabricante fabricante;

    private boolean ativo;

    //CONSTRUTOR PADRÃO
    public Produto(){
    }

    public Produto(String descricao, String nome, double preco, Fabricante fabricante) {
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) { this.nome = nome;    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
