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
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

 
@ManagedBean
@ViewScoped
public class DataListView implements Serializable {      
     
    private List<Relatorios> candidatos;   
 
    public List<Relatorios> getCandidatos() {
        return candidatos;
    }
}