/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.dao;

import br.com.jn.model.Candidatos;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pccli
 */
public class Relatorios {

    @PersistenceContext
    private EntityManager em;

    @ManagedBean
    @ViewScoped
    public class DataListView implements Serializable {

        private List<Candidatos> candidatos;

        public List<Candidatos> listar() {
            List<Candidatos> candidatos = null;
            try {
                candidatos = em.createNamedQuery("Candidatos.findAll")
                        .getResultList();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return candidatos;
        }
    }
}
