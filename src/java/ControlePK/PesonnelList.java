/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlePK;

import EntityPk.Personnel;

/**
 *
 * @author uvt
 */
public class PesonnelList {
    private Personnel person;
    private String name;

    public PesonnelList() {
    }

    public Personnel getPerson() {
        return person;
    }

    public void setPerson(Personnel person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
