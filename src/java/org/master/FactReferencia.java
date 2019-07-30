/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author epasten
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factReferencia", propOrder = { "TipoDocRef", "FolioRef", "FechaDocRef", "IDRazon", "RazonDesc"}) /*------ Totales ------*/
public class FactReferencia 
{
    @XmlElement(name = "TipoDocRef")
    protected String TipoDocRef;
    
    @XmlElement(name = "FolioRef")
    protected String FolioRef;
    
    @XmlElement(name = "FechaDocRef")
    protected String FechaDocRef;
    
    @XmlElement(name = "IDRazon")
    protected String IDRazon;
    
    @XmlElement(name = "RazonDesc")
    protected String RazonDesc;

    public FactReferencia() 
    {
        this.TipoDocRef = "";
        this.FolioRef = "";
        this.FechaDocRef = "";
        this.IDRazon = "";
        this.RazonDesc = "";
    }
    
    
    

    public String getTipoDocRef() {
        return TipoDocRef;
    }

    public void setTipoDocRef(String TipoDocRef) {
        this.TipoDocRef = TipoDocRef;
    }

    public String getFolioRef() {
        return FolioRef;
    }

    public void setFolioRef(String FolioRef) {
        this.FolioRef = FolioRef;
    }

    public String getFechaDocRef() {
        return FechaDocRef;
    }

    public void setFechaDocRef(String FechaDocRef) {
        this.FechaDocRef = FechaDocRef;
    }

    public String getIDRazon() {
        return IDRazon;
    }

    public void setIDRazon(String IDRazon) {
        this.IDRazon = IDRazon;
    }

    public String getRazonDesc() {
        return RazonDesc;
    }

    public void setRazonDesc(String RazonDesc) {
        this.RazonDesc = RazonDesc;
    }
    
    
    
    
    
}
