/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.dao;

/**
 *
 * @author pccli
 */
import br.com.jn.dao.DataListView;
import br.com.jn.model.Candidato;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
@ViewScoped
public class DataListView implements Serializable {

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        try {
            //Obtém o factory a partir da unidade de persistência.
            factory = Persistence.createEntityManagerFactory("br.com.jn_selecao_war_1.0-SNAPSHOTPU");
            //Cria um entity manager.
            entityManager = factory.createEntityManager();
            //Fecha o factory para liberar os recursos utilizado.
        } finally {
            factory.close();
        }
        return entityManager;
    }

    public List<Candidato> selecionadosFase1() {
        EntityManager entityManager = null;
        List<Candidato> candidatos = null;
        try {
            candidatos = entityManager.createNamedQuery("Candidato.findAll")
                    .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return candidatos;
    }

    

}
