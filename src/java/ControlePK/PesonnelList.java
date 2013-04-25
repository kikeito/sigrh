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

    /**
     *
     */
    public PesonnelList() {
    }

    /**
     *
     * @return
     */
    public Personnel getPerson() {
        return person;
    }

    /**
     *
     * @param person
     */
    public void setPerson(Personnel person) {
        this.person = person;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
