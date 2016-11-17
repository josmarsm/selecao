/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.dao;

import br.com.jn.model.Candidato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Classe utilizada para fazer realizar as operações de banco de dados sobre a
 * entity Pessoa.
 */
public class CandidatoDao {

    /**
     * Método utilizado para obter o entity manager.
     *
     * @return
     */
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

    /**
     * Método utilizado para salvar ou atualizar as informações de uma pessoa.
     *
     * @param pessoa
     * @return
     * @throws java.lang.Exception
     */
    public Candidato salvar(Candidato candidato) throws Exception {
        EntityManager entityManager = getEntityManager();
        try {
            // Inicia uma transação com o banco de dados.
            entityManager.getTransaction().begin();
            System.out.println("Salvando a pessoa.");
            // Verifica se a pessoa ainda não está salva no banco de dados.
            if (candidato.getId() == null) {
                //Salva os dados da pessoa.
                entityManager.persist(candidato);
            } else {
                //Atualiza os dados da pessoa.
                candidato = entityManager.merge(candidato);
            }
            // Finaliza a transação.
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
        return candidato;
    }

    /**
     * Método que apaga a pessoa do banco de dados.
     *
     * @param id
     */
    public void excluir(Long id) {
        EntityManager entityManager = getEntityManager();
        try {
            // Inicia uma transação com o banco de dados.
            entityManager.getTransaction().begin();
            // Consulta a pessoa na base de dados através do seu ID.
            Candidato candidato = entityManager.find(Candidato.class, id);
            System.out.println("Excluindo os dados de: " + candidato.getNome());
            // Remove a pessoa da base de dados.
            entityManager.remove(candidato);
            // Finaliza a transação.
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Consulta o pessoa pelo ID.
     *
     * @param id
     * @return o objeto Pessoa.
     */
    public Candidato consultarPorId(Long id) {
        EntityManager entityManager = getEntityManager();
        Candidato candidato = null;
        try {
            //Consulta uma pessoa pelo seu ID.
            candidato = entityManager.find(Candidato.class, id);
        } finally {
            entityManager.close();
        }
        return candidato;
    }

    public void selecionadoFase1() {
        EntityManager entityManager = getEntityManager();
        Query q = entityManager.createNamedQuery("Produto.findAll");
        List<Candidato> list = q.getResultList();
    }

}