/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pccli
 */
@Entity
@Table(name = "Candidatos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidatos.findAll", query = "SELECT c FROM Candidatos c")
    , @NamedQuery(name = "Candidatos.findById", query = "SELECT c FROM Candidatos c WHERE c.id = :id")
    , @NamedQuery(name = "Candidatos.findByInscricao", query = "SELECT c FROM Candidatos c WHERE c.inscricao = :inscricao")
    , @NamedQuery(name = "Candidatos.findByCpf", query = "SELECT c FROM Candidatos c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Candidatos.findByNome", query = "SELECT c FROM Candidatos c WHERE c.nome = :nome")
    , @NamedQuery(name = "Candidatos.findByDocumentacao", query = "SELECT c FROM Candidatos c WHERE c.documentacao = :documentacao")
    , @NamedQuery(name = "Candidatos.findByLinha1", query = "SELECT c FROM Candidatos c WHERE c.linha1 = :linha1")
    , @NamedQuery(name = "Candidatos.findByLinha2", query = "SELECT c FROM Candidatos c WHERE c.linha2 = :linha2")
    , @NamedQuery(name = "Candidatos.findByOrientador1", query = "SELECT c FROM Candidatos c WHERE c.orientador1 = :orientador1")
    , @NamedQuery(name = "Candidatos.findByOrientador2", query = "SELECT c FROM Candidatos c WHERE c.orientador2 = :orientador2")
    , @NamedQuery(name = "Candidatos.findByOrientador3", query = "SELECT c FROM Candidatos c WHERE c.orientador3 = :orientador3")
    , @NamedQuery(name = "Candidatos.findByOldOrientador", query = "SELECT c FROM Candidatos c WHERE c.oldOrientador = :oldOrientador")
    , @NamedQuery(name = "Candidatos.findByPoscomp", query = "SELECT c FROM Candidatos c WHERE c.poscomp = :poscomp")
    , @NamedQuery(name = "Candidatos.findByAnoPoscomp", query = "SELECT c FROM Candidatos c WHERE c.anoPoscomp = :anoPoscomp")
    , @NamedQuery(name = "Candidatos.findByNotaPoscomp", query = "SELECT c FROM Candidatos c WHERE c.notaPoscomp = :notaPoscomp")
    , @NamedQuery(name = "Candidatos.findByBolsa", query = "SELECT c FROM Candidatos c WHERE c.bolsa = :bolsa")
    , @NamedQuery(name = "Candidatos.findByAvaliadorEliminatoria", query = "SELECT c FROM Candidatos c WHERE c.avaliadorEliminatoria = :avaliadorEliminatoria")
    , @NamedQuery(name = "Candidatos.findByNotaEliminatoria", query = "SELECT c FROM Candidatos c WHERE c.notaEliminatoria = :notaEliminatoria")
    , @NamedQuery(name = "Candidatos.findByNotaAvaliador", query = "SELECT c FROM Candidatos c WHERE c.notaAvaliador = :notaAvaliador")
    , @NamedQuery(name = "Candidatos.findByNotaProvaEscrita", query = "SELECT c FROM Candidatos c WHERE c.notaProvaEscrita = :notaProvaEscrita")
    , @NamedQuery(name = "Candidatos.findByNotaEntrevista", query = "SELECT c FROM Candidatos c WHERE c.notaEntrevista = :notaEntrevista")
    , @NamedQuery(name = "Candidatos.findBySituacao", query = "SELECT c FROM Candidatos c WHERE c.situacao = :situacao")
    , @NamedQuery(name = "Candidatos.findByURLLattes", query = "SELECT c FROM Candidatos c WHERE c.uRLLattes = :uRLLattes")
    , @NamedQuery(name = "Candidatos.findByHistorico", query = "SELECT c FROM Candidatos c WHERE c.historico = :historico")
    , @NamedQuery(name = "Candidatos.findByOrientador", query = "SELECT c FROM Candidatos c WHERE c.orientador = :orientador")
    , @NamedQuery(name = "Candidatos.findByCoOrientador", query = "SELECT c FROM Candidatos c WHERE c.coOrientador = :coOrientador")
    , @NamedQuery(name = "Candidatos.findByNotaBolsas", query = "SELECT c FROM Candidatos c WHERE c.notaBolsas = :notaBolsas")
    , @NamedQuery(name = "Candidatos.findByDia", query = "SELECT c FROM Candidatos c WHERE c.dia = :dia")
    , @NamedQuery(name = "Candidatos.findByLocal", query = "SELECT c FROM Candidatos c WHERE c.local = :local")
    , @NamedQuery(name = "Candidatos.findByHorario", query = "SELECT c FROM Candidatos c WHERE c.horario = :horario")})
public class Candidatos implements Serializable {

    @Size(max = 50)
    @Column(name = "Linha1")
    private String linha1;
    @Size(max = 50)
    @Column(name = "Linha2")
    private String linha2;
    @Size(max = 50)
    @Column(name = "Orientador1")
    private String orientador1;
    @Size(max = 50)
    @Column(name = "Orientador2")
    private String orientador2;
    @Size(max = 50)
    @Column(name = "Orientador3")
    private String orientador3;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "Inscricao")
    private String inscricao;
    @Size(max = 14)
    @Column(name = "cpf")
    private String cpf;
    @Size(max = 150)
    @Column(name = "Nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "Documentacao")
    private String documentacao;
    @Size(max = 255)
    @Column(name = "oldOrientador")
    private String oldOrientador;
    @Size(max = 255)
    @Column(name = "Poscomp")
    private String poscomp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AnoPoscomp")
    private Double anoPoscomp;
    @Column(name = "NotaPoscomp")
    private Double notaPoscomp;
    @Size(max = 255)
    @Column(name = "Bolsa")
    private String bolsa;
    @Size(max = 255)
    @Column(name = "AvaliadorEliminatoria")
    private String avaliadorEliminatoria;
    @Column(name = "NotaEliminatoria")
    private Double notaEliminatoria;
    @Column(name = "NotaAvaliador")
    private Double notaAvaliador;
    @Column(name = "NotaProvaEscrita")
    private Double notaProvaEscrita;
    @Column(name = "NotaEntrevista")
    private Double notaEntrevista;
    @Size(max = 2)
    @Column(name = "Situacao")
    private String situacao;
    @Size(max = 255)
    @Column(name = "URL_Lattes")
    private String uRLLattes;
    @Size(max = 255)
    @Column(name = "Historico")
    private String historico;
    @Size(max = 255)
    @Column(name = "Orientador")
    private String orientador;
    @Size(max = 255)
    @Column(name = "Co_Orientador")
    private String coOrientador;
    @Column(name = "Nota_Bolsas")
    private Double notaBolsas;
    @Size(max = 255)
    @Column(name = "Dia")
    private String dia;
    @Size(max = 255)
    @Column(name = "Local")
    private String local;
    @Size(max = 255)
    @Column(name = "Horario")
    private String horario;

    public Candidatos() {
    }

    public Candidatos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(String documentacao) {
        this.documentacao = documentacao;
    }


    public String getOldOrientador() {
        return oldOrientador;
    }

    public void setOldOrientador(String oldOrientador) {
        this.oldOrientador = oldOrientador;
    }

    public String getPoscomp() {
        return poscomp;
    }

    public void setPoscomp(String poscomp) {
        this.poscomp = poscomp;
    }

    public Double getAnoPoscomp() {
        return anoPoscomp;
    }

    public void setAnoPoscomp(Double anoPoscomp) {
        this.anoPoscomp = anoPoscomp;
    }

    public Double getNotaPoscomp() {
        return notaPoscomp;
    }

    public void setNotaPoscomp(Double notaPoscomp) {
        this.notaPoscomp = notaPoscomp;
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    public String getAvaliadorEliminatoria() {
        return avaliadorEliminatoria;
    }

    public void setAvaliadorEliminatoria(String avaliadorEliminatoria) {
        this.avaliadorEliminatoria = avaliadorEliminatoria;
    }

    public Double getNotaEliminatoria() {
        return notaEliminatoria;
    }

    public void setNotaEliminatoria(Double notaEliminatoria) {
        this.notaEliminatoria = notaEliminatoria;
    }

    public Double getNotaAvaliador() {
        return notaAvaliador;
    }

    public void setNotaAvaliador(Double notaAvaliador) {
        this.notaAvaliador = notaAvaliador;
    }

    public Double getNotaProvaEscrita() {
        return notaProvaEscrita;
    }

    public void setNotaProvaEscrita(Double notaProvaEscrita) {
        this.notaProvaEscrita = notaProvaEscrita;
    }

    public Double getNotaEntrevista() {
        return notaEntrevista;
    }

    public void setNotaEntrevista(Double notaEntrevista) {
        this.notaEntrevista = notaEntrevista;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getURLLattes() {
        return uRLLattes;
    }

    public void setURLLattes(String uRLLattes) {
        this.uRLLattes = uRLLattes;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCoOrientador() {
        return coOrientador;
    }

    public void setCoOrientador(String coOrientador) {
        this.coOrientador = coOrientador;
    }

    public Double getNotaBolsas() {
        return notaBolsas;
    }

    public void setNotaBolsas(Double notaBolsas) {
        this.notaBolsas = notaBolsas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidatos)) {
            return false;
        }
        Candidatos other = (Candidatos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jn.model.Candidatos[ id=" + id + " ]";
    }

    public String getLinha1() {
        return linha1;
    }

    public void setLinha1(String linha1) {
        this.linha1 = linha1;
    }

    public String getLinha2() {
        return linha2;
    }

    public void setLinha2(String linha2) {
        this.linha2 = linha2;
    }

    public String getOrientador1() {
        return orientador1;
    }

    public void setOrientador1(String orientador1) {
        this.orientador1 = orientador1;
    }

    public String getOrientador2() {
        return orientador2;
    }

    public void setOrientador2(String orientador2) {
        this.orientador2 = orientador2;
    }

    public String getOrientador3() {
        return orientador3;
    }

    public void setOrientador3(String orientador3) {
        this.orientador3 = orientador3;
    }
    
}
