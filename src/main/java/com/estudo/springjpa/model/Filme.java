package com.estudo.springjpa.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_filme")
    private Integer idFilme;
    private String nome;
    private double valor;
    private String disponivel;
    private String promocao;
    private Double valorPromocao;
    private String diretor;
    private String anoLancamento;
    private int faixaEtaria;
    private String genero;

    public Filme() {
    }

    public Filme(Integer idFilme, String nome, double valor, String disponivel, String promocao, Double valorPromocao, String diretor, String anoLancamento, int faixaEtaria, String genero) {
        this.idFilme = idFilme;
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
        this.promocao = promocao;
        this.valorPromocao = valorPromocao;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.faixaEtaria = faixaEtaria;
        this.genero = genero;
    }

    public Filme(String nome, double valor, String disponivel, String promocao, Double valorPromocao, String diretor, String anoLancamento, int faixaEtaria, String genero) {
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
        this.promocao = promocao;
        this.valorPromocao = valorPromocao;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.faixaEtaria = faixaEtaria;
        this.genero = genero;
    }



    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    public Double getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(Double valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Double.compare(filme.valor, valor) == 0 && faixaEtaria == filme.faixaEtaria && Objects.equals(idFilme, filme.idFilme) && Objects.equals(nome, filme.nome) && Objects.equals(disponivel, filme.disponivel) && Objects.equals(promocao, filme.promocao) && Objects.equals(valorPromocao, filme.valorPromocao) && Objects.equals(diretor, filme.diretor) && Objects.equals(anoLancamento, filme.anoLancamento) && Objects.equals(genero, filme.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFilme, nome, valor, disponivel, promocao, valorPromocao, diretor, anoLancamento, faixaEtaria, genero);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "idFilme=" + idFilme +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", disponivel='" + disponivel + '\'' +
                ", promocao='" + promocao + '\'' +
                ", valorPromocao=" + valorPromocao +
                ", diretor='" + diretor + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                ", faixaEtaria=" + faixaEtaria +
                ", genero='" + genero + '\'' +
                '}';
    }
}
