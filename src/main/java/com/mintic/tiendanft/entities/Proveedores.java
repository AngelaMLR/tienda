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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Angela Lozano
 */
@Entity
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")
    , @NamedQuery(name = "Proveedores.findByNitproveedor", query = "SELECT p FROM Proveedores p WHERE p.nitproveedor = :nitproveedor")
    , @NamedQuery(name = "Proveedores.findByCiudadProveedor", query = "SELECT p FROM Proveedores p WHERE p.ciudadProveedor = :ciudadProveedor")
    , @NamedQuery(name = "Proveedores.findByDireccionProveedor", query = "SELECT p FROM Proveedores p WHERE p.direccionProveedor = :direccionProveedor")
    , @NamedQuery(name = "Proveedores.findByNombreProveedor", query = "SELECT p FROM Proveedores p WHERE p.nombreProveedor = :nombreProveedor")
    , @NamedQuery(name = "Proveedores.findByTelefonoProveedor", query = "SELECT p FROM Proveedores p WHERE p.telefonoProveedor = :telefonoProveedor")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "nitproveedor")
    private Long nitproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ciudad_proveedor")
    private String ciudadProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "direccion_proveedor")
    private String direccionProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre_proveedor")
    private String nombreProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "telefono_proveedor")
    private String telefonoProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nitproveedor")
    private Collection<Producto> productoCollection;

    public Proveedores() {
    }

    public Proveedores(Long nitproveedor) {
        this.nitproveedor = nitproveedor;
    }

    public Proveedores(Long nitproveedor, String ciudadProveedor, String direccionProveedor, String nombreProveedor, String telefonoProveedor) {
        this.nitproveedor = nitproveedor;
        this.ciudadProveedor = ciudadProveedor;
        this.direccionProveedor = direccionProveedor;
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
    }

    public Long getNitproveedor() {
        return nitproveedor;
    }

    public void setNitproveedor(Long nitproveedor) {
        this.nitproveedor = nitproveedor;
    }

    public String getCiudadProveedor() {
        return ciudadProveedor;
    }

    public void setCiudadProveedor(String ciudadProveedor) {
        this.ciudadProveedor = ciudadProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nitproveedor != null ? nitproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.nitproveedor == null && other.nitproveedor != null) || (this.nitproveedor != null && !this.nitproveedor.equals(other.nitproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.gov.mntc.tenda.enttys.Proveedores[ nitproveedor=" + nitproveedor + " ]";
    }
    
}
