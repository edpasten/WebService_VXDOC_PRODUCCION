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
@XmlType(name = "factCabecera", propOrder = { "TipoDTE", "Folio", "FchEmis", "TermPagoGlosa", "TermPagoDias", "FchVenc","IndServicio","IdVendedor","OrdenDeCompra","Tag802","FechaOC", /*------ IdDoc ------*/
                                              "RUTEmisor", "RznSoc", "GiroEmis", "Acteco", "DirOrigen", "CmnaOrigen", "CiudadOrigen", /*------ Emisor ------*/
                                              "RUTRecep","cdgInRecep","RznSocRecep","GiroRecep","Contacto","DirRecep","CmnaRecep","CiudadRecep","DirPostal","CorreoRecep", /*------ Receptor ------*/
                                              "mntNeto","TasaIVA","IVA","MntTotal","TpoMoneda","MntExe","TpoCambio","MntExeOtrMnda","MntTotOtrMnda","MntRetencion",/*------ Totales ------*/
                                              "NumReserva","Impresora","Pasaporte","Observaciones"}) /*------ Personalizados ------*/
public class FactCabecera 
{
    /*------ IdDoc ------*/
    @XmlElement(name = "TipoDTE")
    protected String TipoDTE;
    @XmlElement(name = "Folio")
    protected String Folio;
    @XmlElement(name = "FchEmis")
    protected String FchEmis;
    @XmlElement(name = "TermPagoGlosa")
    protected String TermPagoGlosa;   
    @XmlElement(name = "TermPagoDias")
    protected String TermPagoDias;
    @XmlElement(name = "FchVenc")
    protected String FchVenc;    
    @XmlElement(name = "IndServicio")
    protected String IndServicio;
    @XmlElement(name = "IdVendedor")
    protected String IdVendedor;
    @XmlElement(name = "OrdenDeCompra")
    protected String OrdenDeCompra;
    @XmlElement(name = "Tag802")
    protected String Tag802;
    @XmlElement(name = "FechaOC")
    protected String FechaOC;
    
    
    /*------ Emisor ------*/
    @XmlElement(name = "RUTEmisor")
    protected String RUTEmisor;
    @XmlElement(name = "RznSoc")
    protected String RznSoc;
    @XmlElement(name = "GiroEmis")
    protected String GiroEmis;
    @XmlElement(name = "Acteco")
    protected String Acteco;
    @XmlElement(name = "DirOrigen")
    protected String DirOrigen;
    @XmlElement(name = "CmnaOrigen")
    protected String CmnaOrigen;   
    @XmlElement(name = "CiudadOrigen")
    protected String CiudadOrigen;
        
    /*------ Receptor ------*/
    @XmlElement(name = "RUTRecep")
    protected String RUTRecep;
    @XmlElement(name = "cdgInRecep")
    protected String cdgInRecep;
    @XmlElement(name = "RznSocRecep")
    protected String RznSocRecep;
    @XmlElement(name = "GiroRecep")
    protected String GiroRecep;
    @XmlElement(name = "Contacto")
    protected String Contacto;
    @XmlElement(name = "DirRecep")
    protected String DirRecep;
    @XmlElement(name = "CmnaRecep")
    protected String CmnaRecep;   
    @XmlElement(name = "CiudadRecep")
    protected String CiudadRecep;    
    @XmlElement(name = "DirPostal")
    protected String DirPostal;
    @XmlElement(name = "CorreoRecep")
    protected String CorreoRecep;
    
    /*------ Totales ------*/
    @XmlElement(name = "mntNeto")
    protected String mntNeto;
    @XmlElement(name = "TasaIVA")
    protected String TasaIVA;   
    @XmlElement(name = "IVA")
    protected String IVA;    
    @XmlElement(name = "MntTotal")
    protected String MntTotal;    
    @XmlElement(name = "TpoMoneda")
    protected String TpoMoneda;
    @XmlElement(name = "MntExe")
    protected String MntExe;    
    @XmlElement(name = "TpoCambio")
    protected String TpoCambio;
    @XmlElement(name = "MntExeOtrMnda")
    protected String MntExeOtrMnda;
    @XmlElement(name = "MntTotOtrMnda")
    protected String MntTotOtrMnda;
    @XmlElement(name = "MntRetencion")
    protected String MntRetencion;
        
    /*------ Personalizados ------*/
    @XmlElement(name = "NumReserva")
    protected String NumReserva;
    @XmlElement(name = "Impresora")
    protected String Impresora;
    @XmlElement(name = "Pasaporte")
    protected String Pasaporte;
    @XmlElement(name = "Observaciones")
    protected String Observaciones;

    public FactCabecera() 
    {
        this.TipoDTE = "";
        this.Folio = "";
        this.FchEmis = "";
        this.TermPagoGlosa = "";
        this.TermPagoDias = "";
        this.FchVenc = "";
        this.IndServicio = "";
        this.IdVendedor = "";
        this.OrdenDeCompra = "";
        this.Tag802 = "";
        this.FechaOC = "";
        this.RUTEmisor = "";
        this.RznSoc = "";
        this.GiroEmis = "";
        this.Acteco = "";
        this.DirOrigen = "";
        this.CmnaOrigen = "";
        this.CiudadOrigen = "";
        this.RUTRecep = "";
        this.cdgInRecep = "";
        this.RznSocRecep = "";
        this.GiroRecep = "";
        this.Contacto = "";
        this.DirRecep = "";
        this.CmnaRecep = "";
        this.CiudadRecep = "";
        this.DirPostal = "";
        this.CorreoRecep = "";
        this.mntNeto = "";
        this.TasaIVA = "";
        this.IVA = "";
        this.MntTotal = "";
        this.TpoMoneda = "";
        this.MntExe = "";
        this.TpoCambio = "";
        this.MntExeOtrMnda = "";
        this.MntTotOtrMnda = "";
        this.MntRetencion = "";
        this.NumReserva = "";
        this.Impresora = "";
        this.Pasaporte = "";
        this.Observaciones = "";
    }           

    public String getTipoDTE() {
        return TipoDTE;
    }

    public void setTipoDTE(String TipoDTE) {
        this.TipoDTE = TipoDTE;
    }

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    public String getFchEmis() {
        return FchEmis;
    }

    public void setFchEmis(String FchEmis) {
        this.FchEmis = FchEmis;
    }

    public String getTermPagoGlosa() {
        return TermPagoGlosa;
    }

    public void setTermPagoGlosa(String TermPagoGlosa) {
        this.TermPagoGlosa = TermPagoGlosa;
    }

    public String getTermPagoDias() {
        return TermPagoDias;
    }

    public void setTermPagoDias(String TermPagoDias) {
        this.TermPagoDias = TermPagoDias;
    }

    public String getFchVenc() {
        return FchVenc;
    }

    public void setFchVenc(String FchVenc) {
        this.FchVenc = FchVenc;
    }

    public String getIndServicio() {
        return IndServicio;
    }

    public void setIndServicio(String IndServicio) {
        this.IndServicio = IndServicio;
    }

    public String getIdVendedor() {
        return IdVendedor;
    }

    public void setIdVendedor(String IdVendedor) {
        this.IdVendedor = IdVendedor;
    }

    public String getOrdenDeCompra() {
        return OrdenDeCompra;
    }

    public void setOrdenDeCompra(String OrdenDeCompra) {
        this.OrdenDeCompra = OrdenDeCompra;
    }
    
    public String getRUTEmisor() {
        return RUTEmisor;
    }

    public void setRUTEmisor(String RUTEmisor) {
        this.RUTEmisor = RUTEmisor;
    }

    public String getRznSoc() {
        return RznSoc;
    }

    public void setRznSoc(String RznSoc) {
        this.RznSoc = RznSoc;
    }

    public String getGiroEmis() {
        return GiroEmis;
    }

    public void setGiroEmis(String GiroEmis) {
        this.GiroEmis = GiroEmis;
    }

    public String getActeco() {
        return Acteco;
    }

    public void setActeco(String Acteco) {
        this.Acteco = Acteco;
    }

    public String getDirOrigen() {
        return DirOrigen;
    }

    public void setDirOrigen(String DirOrigen) {
        this.DirOrigen = DirOrigen;
    }

    public String getCmnaOrigen() {
        return CmnaOrigen;
    }

    public void setCmnaOrigen(String CmnaOrigen) {
        this.CmnaOrigen = CmnaOrigen;
    }

    public String getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public String getRUTRecep() {
        return RUTRecep;
    }

    public void setRUTRecep(String RUTRecep) {
        this.RUTRecep = RUTRecep;
    }

    public String getCdgInRecep() {
        return cdgInRecep;
    }

    public void setCdgInRecep(String cdgInRecep) {
        this.cdgInRecep = cdgInRecep;
    }

    public String getRznSocRecep() {
        return RznSocRecep;
    }

    public void setRznSocRecep(String RznSocRecep) {
        this.RznSocRecep = RznSocRecep;
    }

    public String getGiroRecep() {
        return GiroRecep;
    }

    public void setGiroRecep(String GiroRecep) {
        this.GiroRecep = GiroRecep;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getDirRecep() {
        return DirRecep;
    }

    public void setDirRecep(String DirRecep) {
        this.DirRecep = DirRecep;
    }

    public String getCmnaRecep() {
        return CmnaRecep;
    }

    public void setCmnaRecep(String CmnaRecep) {
        this.CmnaRecep = CmnaRecep;
    }

    public String getCiudadRecep() {
        return CiudadRecep;
    }

    public void setCiudadRecep(String CiudadRecep) {
        this.CiudadRecep = CiudadRecep;
    }

    public String getDirPostal() {
        return DirPostal;
    }

    public void setDirPostal(String DirPostal) {
        this.DirPostal = DirPostal;
    }

    public String getCorreoRecep() {
        return CorreoRecep;
    }

    public void setCorreoRecep(String CorreoRecep) {
        this.CorreoRecep = CorreoRecep;
    }

    public String getMntNeto() {
        return mntNeto;
    }

    public void setMntNeto(String mntNeto) {
        this.mntNeto = mntNeto;
    }

    public String getTasaIVA() {
        return TasaIVA;
    }

    public void setTasaIVA(String TasaIVA) {
        this.TasaIVA = TasaIVA;
    }

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public String getMntTotal() {
        return MntTotal;
    }

    public void setMntTotal(String MntTotal) {
        this.MntTotal = MntTotal;
    }

    public String getTpoMoneda() {
        return TpoMoneda;
    }

    public void setTpoMoneda(String TpoMoneda) {
        this.TpoMoneda = TpoMoneda;
    }

    public String getMntExe() {
        return MntExe;
    }

    public void setMntExe(String MntExe) {
        this.MntExe = MntExe;
    }

    public String getTpoCambio() {
        return TpoCambio;
    }

    public void setTpoCambio(String TpoCambio) {
        this.TpoCambio = TpoCambio;
    }

    public String getMntExeOtrMnda() {
        return MntExeOtrMnda;
    }

    public void setMntExeOtrMnda(String MntExeOtrMnda) {
        this.MntExeOtrMnda = MntExeOtrMnda;
    }

    public String getMntTotOtrMnda() {
        return MntTotOtrMnda;
    }

    public void setMntTotOtrMnda(String MntTotOtrMnda) {
        this.MntTotOtrMnda = MntTotOtrMnda;
    }

    public String getMntRetencion() {
        return MntRetencion;
    }

    public void setMntRetencion(String MntRetencion) {
        this.MntRetencion = MntRetencion;
    }

    public String getNumReserva() {
        return NumReserva;
    }

    public void setNumReserva(String NumReserva) {
        this.NumReserva = NumReserva;
    }

    public String getImpresora() {
        return Impresora;
    }

    public void setImpresora(String Impresora) {
        this.Impresora = Impresora;
    }

    public String getPasaporte() {
        return Pasaporte;
    }

    public void setPasaporte(String Pasaporte) {
        this.Pasaporte = Pasaporte;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }            

    public String getTag802() {
        return Tag802;
    }

    public void setTag802(String Tag802) {
        this.Tag802 = Tag802;
    }
    
    public String getFechaOC() {
        return FechaOC;
    }

    public void setFechaOC(String FechaOC) {
        this.FechaOC = FechaOC;
    }
    

}
