/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Paty Ramirez
 */
public class mensaje {
     private int idmensaje;
     private String sugerencia;
     private String fecha;
     private String destinatario;
     private String remitente;
     private String folio;

    public mensaje() {
    }

    public mensaje(int idmensaje, String sugerencia, String fecha, String destinatario, String remitente, String folio) {
        this.idmensaje = idmensaje;
        this.sugerencia = sugerencia;
        this.fecha = fecha;
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.folio = folio;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getIdmensaje() {
        return idmensaje;
    }

    public void setIdmensaje(int idmensaje) {
        this.idmensaje = idmensaje;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
     
}
