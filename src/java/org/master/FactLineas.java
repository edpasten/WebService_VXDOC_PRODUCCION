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
@XmlType(name = "factLineas", propOrder = {"NroLinDet","TpoCodigo","VlrCodigo","NumbItem","DscItem","QtyItem","UnmdItem","PrcItem","MontoItem","IndExe"}) /*------ Detalle ------*/
public class FactLineas 
{
    @XmlElement(name = "NroLinDet")
    protected String NroLinDet;
    @XmlElement(name = "TpoCodigo")
    protected String TpoCodigo;
    @XmlElement(name = "VlrCodigo")
    protected String VlrCodigo;
    @XmlElement(name = "NumbItem")
    protected String NumbItem;
    @XmlElement(name = "DscItem")
    protected String DscItem;
    @XmlElement(name = "QtyItem")
    protected String QtyItem;
    @XmlElement(name = "UnmdItem")
    protected String UnmdItem;   
    @XmlElement(name = "PrcItem")
    protected String PrcItem;
    @XmlElement(name = "MontoItem")
    protected String MontoItem;
    @XmlElement(name = "IndExe")
    protected String IndExe;
    
    public FactLineas()
    {
        NroLinDet = "";
        TpoCodigo = "";
        VlrCodigo = "";
        NumbItem = "";
        DscItem = "";
        QtyItem = "";
        UnmdItem = "";
        PrcItem = "";
        MontoItem = "";
        IndExe = "";
    }
       
    public String getNroLinDet() {
        return NroLinDet;
    }

    public void setNroLinDet(String NroLinDet) {
        this.NroLinDet = NroLinDet;
    }

    public String getTpoCodigo() {
        return TpoCodigo;
    }

    public void setTpoCodigo(String TpoCodigo) {
        this.TpoCodigo = TpoCodigo;
    }

    public String getVlrCodigo() {
        return VlrCodigo;
    }

    public void setVlrCodigo(String VlrCodigo) {
        this.VlrCodigo = VlrCodigo;
    }

    public String getNumbItem() {
        return NumbItem;
    }

    public void setNumbItem(String NumbItem) {
        this.NumbItem = NumbItem;
    }

    public String getDscItem() {
        return DscItem;
    }

    public void setDscItem(String DscItem) {
        this.DscItem = DscItem;
    }

    public String getQtyItem() {
        return QtyItem;
    }

    public void setQtyItem(String QtyItem) {
        this.QtyItem = QtyItem;
    }

    public String getUnmdItem() {
        return UnmdItem;
    }

    public void setUnmdItem(String UnmdItem) {
        this.UnmdItem = UnmdItem;
    }

    public String getPrcItem() {
        return PrcItem;
    }

    public void setPrcItem(String PrcItem) {
        this.PrcItem = PrcItem;
    }

    public String getMontoItem() {
        return MontoItem;
    }

    public void setMontoItem(String MontoItem) {
        this.MontoItem = MontoItem;
    }

    public String getIndExe() {
        return IndExe;
    }

    public void setIndExe(String IndExe) {
        this.IndExe = IndExe;
    }
            
    
    

}
