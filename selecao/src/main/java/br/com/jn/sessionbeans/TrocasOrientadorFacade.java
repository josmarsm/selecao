/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.sessionbeans;

import br.com.jn.model.TrocasOrientador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pccli
 */
@Stateless
public class TrocasOrientadorFacade extends AbstractFacade<TrocasOrientador> {

    @PersistenceContext(unitName = "br.com.jn_selecao_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrocasOrientadorFacade() {
        super(TrocasOrientador.class);
    }
    
}
