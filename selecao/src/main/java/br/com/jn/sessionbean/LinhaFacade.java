/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.sessionbean;

import br.com.jn.model.Linha;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author josmarsm
 */
@Stateless
public class LinhaFacade extends AbstractFacade<Linha> {

    @PersistenceContext(unitName = "br.com.jn_selecao_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LinhaFacade() {
        super(Linha.class);
    }
    
}
