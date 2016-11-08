/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.model;

/**
 *
 * @author pccli
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class DropdownView implements Serializable {

    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
    private String linha;
    private String orientador;
    private String country;
    private String city;
    private Map<String, String> linhas;
    private Map<String, String> orientadores;
    private Map<String, String> countries;
    private Map<String, String> cities;

    @PostConstruct
    public void init() {
        linhas = new HashMap<String, String>();
        linhas.put("Computação Aplicada", "1");
        linhas.put("Linguagens de Programação e Bancos de Dados", "2");
        linhas.put("Microeletrônica e Processamento de Sinais", "3");
        linhas.put("Sistemas Paralelos e Distribuídos", "4");
        
        orientadores = new HashMap<String, String>();
        orientadores.put("Alencar Machado", "1");
        orientadores.put("Alice de Jesus Kozakevicius", "2");
        orientadores.put("Ana Trindade Winck", "3");
        orientadores.put("André Luiz Aita", "4");
        orientadores.put("Andrea Schwertner Charão", "5");
        orientadores.put("Andrei Piccinini Legg", "6");
        orientadores.put("Benhur de Oliveira Stein", "7");
        orientadores.put("Carlos Raniery Paula dos Santos", "8");
        orientadores.put("Cesar Augusto Prior", "9");
        orientadores.put("Cesar Ramos Rodrigues", "10");
        orientadores.put("Cesar Tadeu Pozzer", "11");
        orientadores.put("Deise de Brum Saccol", "12");
        orientadores.put("Eduardo Kessler Piveta", "13");
        orientadores.put("Everton Alceu Carara", "14");
        orientadores.put("Fábio Mariano Bayer", "15");
        orientadores.put("Felipe Martins Muller", "16");
        orientadores.put("Giovani Rubert Librelotto", "17");
        orientadores.put("Iara Augustin", "18");
        orientadores.put("Joao Baptista Santos Martins", "19");
        orientadores.put("João Carlos Damasceno Lima", "20");
        orientadores.put("João Vicente Ferreira Lima", "21");
        orientadores.put("Juliana Kaizer Vizzotto", "22");
        orientadores.put("Leonardo Londero de Oliveira", "23");
        orientadores.put("Lisandra Manzoni Fontoura", "24");
        orientadores.put("Luís Alvaro de Lima Silva", "25");
        orientadores.put("Marcos Cordeiro d’Ornellas", "26");
        orientadores.put("Mateus Beck Rutzig", "27");
        orientadores.put("Osmar Marchi dos Santos", "28");
        orientadores.put("Raul Ceretta Nunes", "29");
        orientadores.put("Renato Machado", "30");
        orientadores.put("Roseclea Duarte Medina", "31");
        orientadores.put("Simone Regina Ceolin","32");


        countries = new HashMap<String, String>();
        countries.put("Computação Aplicada", "1");
        countries.put("Linguagens de Programação e Bancos de Dados", "2");
        countries.put("Microeletrônica e Processamento de Sinais", "3");
        countries.put("Sistemas Paralelos e Distribuídos", "4");

        Map<String, String> map = new HashMap<String, String>();
        map.put("New York", "New York");
        map.put("San Francisco", "San Francisco");
        map.put("Denver", "Denver");
        data.put("USA", map);

        map = new HashMap<String, String>();
        map.put("Berlin", "Berlin");
        map.put("Munich", "Munich");
        map.put("Frankfurt", "Frankfurt");
        data.put("Germany", map);

        map = new HashMap<String, String>();
        map.put("Sao Paolo", "Sao Paolo");
        map.put("Rio de Janerio", "Rio de Janerio");
        map.put("Salvador", "Salvador");
        data.put("Brazil", map);
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public Map<String, String> getOrientadores() {
        return orientadores;
    }

    public void setOrientadores(Map<String, String> orientadores) {
        this.orientadores = orientadores;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public Map<String, String> getLinhas() {
        return linhas;
    }

    public void setLinhas(Map<String, String> linhas) {
        this.linhas = linhas;
    }

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void onCountryChange() {
        if (country != null && !country.equals("")) {
            cities = data.get(country);
        } else {
            cities = new HashMap<String, String>();
        }
    }

    public void displayLocation() {
        FacesMessage msg;
        if (city != null && country != null) {
            msg = new FacesMessage("Selected", city + " of " + country);
        } else {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "City is not selected.");
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
