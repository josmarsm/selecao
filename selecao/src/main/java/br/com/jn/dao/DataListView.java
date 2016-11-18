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

import br.com.jn.model.Candidato;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named("beancandidato")
@Stateless
public class DataListView {

    private static final Logger LOG = Logger.getLogger(DataListView.class.getName());

    @PersistenceContext(unitName = "br.com.jn_selecao_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private List<Candidato> candidatos;

    public void persistAction() {

        Collection<Integer> store = new ArrayList<>();
        
    }

    public List<Candidato> loadData() {
        if (candidatos != null) {
            return Collections.unmodifiableList(candidatos);
        } else {
            return new ArrayList<>();
        }
    }

    @SuppressWarnings("unchecked")
    public void findAllUnordered() {
        candidatos = em.createNamedQuery("Candidato.selecionadosGeral")
                .getResultList();
    }
}