/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.tiendanft.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Angela Lozano
 */
@Entity
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")
    , @NamedQuery(name = "Ventas.findByCodigoVenta", query = "SELECT v FROM Ventas v WHERE v.codigoVenta = :codigoVenta")
    , @NamedQuery(name = "Ventas.findByCedulaCliente", query = "SELECT v FROM Ventas v WHERE v.cedulaCliente = :cedulaCliente")
    , @NamedQuery(name = "Ventas.findByIvaventa", query = "SELECT v FROM Ventas v WHERE v.ivaventa = :ivaventa")
    , @NamedQuery(name = "Ventas.findByTotalVenta", query = "SELECT v FROM Ventas v WHERE v.totalVenta = :totalVenta")
    , @NamedQuery(name = "Ventas.findByValorVenta", query = "SELECT v FROM Ventas v WHERE v.valorVenta = :valorVenta")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_venta")
    private Long codigoVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedula_cliente")
    private long cedulaCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ivaventa")
    private double ivaventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_venta")
    private double totalVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_venta")
    private double valorVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoVenta")
    private Collection<DetalleVentas> detalleVentasCollection;
    @JoinColumn(name = "cedula_usuario", referencedColumnName = "cedula_usuario")
    @ManyToOne(optional = false)
    private Usuarios cedulaUsuario;

    public Ventas() {
    }

    public Ventas(Long codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Ventas(Long codigoVenta, long cedulaCliente, double ivaventa, double totalVenta, double valorVenta) {
        this.codigoVenta = codigoVenta;
        this.cedulaCliente = cedulaCliente;
        this.ivaventa = ivaventa;
        this.totalVenta = totalVenta;
        this.valorVenta = valorVenta;
    }

    public Long getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(Long codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public long getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(long cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public double getIvaventa() {
        return ivaventa;
    }

    public void setIvaventa(double ivaventa) {
        this.ivaventa = ivaventa;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    @XmlTransient
    public Collection<DetalleVentas> getDetalleVentasCollection() {
        return detalleVentasCollection;
    }

    public void setDetalleVentasCollection(Collection<DetalleVentas> detalleVentasCollection) {
        this.detalleVentasCollection = detalleVentasCollection;
    }

    public Usuarios getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(Usuarios cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoVenta != null ? codigoVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.codigoVenta == null && other.codigoVenta != null) || (this.codigoVenta != null && !this.codigoVenta.equals(other.codigoVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.gov.mntc.tenda.enttys.Ventas[ codigoVenta=" + codigoVenta + " ]";
    }
    
}
