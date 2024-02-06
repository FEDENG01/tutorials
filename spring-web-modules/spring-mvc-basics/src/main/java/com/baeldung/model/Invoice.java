package com.baeldung.model;

import java.sql.SQLIntegrityConstraintViolationException;

public class Invoice {

    private String Concepto;
    private Integer Cantidad;
    private Integer PorcentajeRetencion;

    public Invoice() {
        super();
    }

    public Invoice(final String Concepto, final Integer Cantidad, final Integer PorcentajeRetencion) {
        this.Concepto = Concepto;
        this.Cantidad = Cantidad;
        this.PorcentajeRetencion = PorcentajeRetencion;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public Integer getPorcentajeRetencion() {
        return PorcentajeRetencion;
    }

    public void setPorcentajeRetencion(Integer porcentajeRetencion) {
        PorcentajeRetencion = porcentajeRetencion;
    }


}
