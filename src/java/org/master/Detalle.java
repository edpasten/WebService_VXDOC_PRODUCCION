/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.master;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author epasten
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalle")
public class Detalle 
{
    @XmlElement(name = "linea")
    protected ArrayList<FactLineas> Linea;

    public ArrayList<FactLineas> getNvaLinea() {
        return Linea;
    }

    public void setNvaLinea(ArrayList<FactLineas> nvaLinea) {
        this.Linea = nvaLinea;
    }



}
