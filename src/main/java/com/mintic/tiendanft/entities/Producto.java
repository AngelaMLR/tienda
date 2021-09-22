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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Angela Lozano
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByCodigoProducto", query = "SELECT p FROM Producto p WHERE p.codigoProducto = :codigoProducto")
    , @NamedQuery(name = "Producto.findByIvacompra", query = "SELECT p FROM Producto p WHERE p.ivacompra = :ivacompra")
    , @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "Producto.findByPrecioCompra", query = "SELECT p FROM Producto p WHERE p.precioCompra = :precioCompra")
    , @NamedQuery(name = "Producto.findByPrecioVenta", query = "SELECT p FROM Producto p WHERE p.precioVenta = :precioVenta")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_producto")
    private Long codigoProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ivacompra")
    private double ivacompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_compra")
    private double precioCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_venta")
    private double precioVenta;
    @JoinColumn(name = "nitproveedor", referencedColumnName = "nitproveedor")
    @ManyToOne(optional = false)
    private Proveedores nitproveedor;

    public Producto() {
    }

    public Producto(Long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Producto(Long codigoProducto, double ivacompra, String nombreProducto, double precioCompra, double precioVenta) {
        this.codigoProducto = codigoProducto;
        this.ivacompra = ivacompra;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public Long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getIvacompra() {
        return ivacompra;
    }

    public void setIvacompra(double ivacompra) {
        this.ivacompra = ivacompra;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Proveedores getNitproveedor() {
        return nitproveedor;
    }

    public void setNitproveedor(Proveedores nitproveedor) {
        this.nitproveedor = nitproveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoProducto != null ? codigoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.codigoProducto == null && other.codigoProducto != null) || (this.codigoProducto != null && !this.codigoProducto.equals(other.codigoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.gov.mntc.tenda.enttys.Producto[ codigoProducto=" + codigoProducto + " ]";
    }
    
}
