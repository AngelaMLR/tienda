/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.tiendanft.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Angela Lozano
 */
@Entity
@Table(name = "detalle_ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleVentas.findAll", query = "SELECT d FROM DetalleVentas d")
    , @NamedQuery(name = "DetalleVentas.findByCodigoDetalleVenta", query = "SELECT d FROM DetalleVentas d WHERE d.codigoDetalleVenta = :codigoDetalleVenta")
    , @NamedQuery(name = "DetalleVentas.findByCantidadProducto", query = "SELECT d FROM DetalleVentas d WHERE d.cantidadProducto = :cantidadProducto")
    , @NamedQuery(name = "DetalleVentas.findByCodigoProducto", query = "SELECT d FROM DetalleVentas d WHERE d.codigoProducto = :codigoProducto")
    , @NamedQuery(name = "DetalleVentas.findByValorTotal", query = "SELECT d FROM DetalleVentas d WHERE d.valorTotal = :valorTotal")
    , @NamedQuery(name = "DetalleVentas.findByValorVenta", query = "SELECT d FROM DetalleVentas d WHERE d.valorVenta = :valorVenta")
    , @NamedQuery(name = "DetalleVentas.findByValoriva", query = "SELECT d FROM DetalleVentas d WHERE d.valoriva = :valoriva")})
public class DetalleVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_detalle_venta")
    private Long codigoDetalleVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_producto")
    private int cantidadProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_producto")
    private long codigoProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_total")
    private double valorTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_venta")
    private double valorVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valoriva")
    private double valoriva;
    @JoinColumn(name = "codigo_venta", referencedColumnName = "codigo_venta")
    @ManyToOne(optional = false)
    private Ventas codigoVenta;

    public DetalleVentas() {
    }

    public DetalleVentas(Long codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }

    public DetalleVentas(Long codigoDetalleVenta, int cantidadProducto, long codigoProducto, double valorTotal, double valorVenta, double valoriva) {
        this.codigoDetalleVenta = codigoDetalleVenta;
        this.cantidadProducto = cantidadProducto;
        this.codigoProducto = codigoProducto;
        this.valorTotal = valorTotal;
        this.valorVenta = valorVenta;
        this.valoriva = valoriva;
    }

    public Long getCodigoDetalleVenta() {
        return codigoDetalleVenta;
    }

    public void setCodigoDetalleVenta(Long codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public double getValoriva() {
        return valoriva;
    }

    public void setValoriva(double valoriva) {
        this.valoriva = valoriva;
    }

    public Ventas getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(Ventas codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoDetalleVenta != null ? codigoDetalleVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVentas)) {
            return false;
        }
        DetalleVentas other = (DetalleVentas) object;
        if ((this.codigoDetalleVenta == null && other.codigoDetalleVenta != null) || (this.codigoDetalleVenta != null && !this.codigoDetalleVenta.equals(other.codigoDetalleVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.gov.mntc.tenda.enttys.DetalleVentas[ codigoDetalleVenta=" + codigoDetalleVenta + " ]";
    }
    
}
