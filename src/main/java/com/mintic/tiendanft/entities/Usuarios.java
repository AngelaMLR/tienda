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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")

    ,@NamedQuery(name = "Usuarios.validate", query = "SELECT u FROM Usuarios u where u.usuario=:usuaro and u.password=:password")
    , @NamedQuery(name = "Usuarios.findByCedulaUsuario", query = "SELECT u FROM Usuarios u WHERE u.cedulaUsuario = :cedulaUsuario")
    , @NamedQuery(name = "Usuarios.findByEmailUsuario", query = "SELECT u FROM Usuarios u WHERE u.emailUsuario = :emailUsuario")
    , @NamedQuery(name = "Usuarios.findByNombreUsuario", query = "SELECT u FROM Usuarios u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password")
    , @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedula_usuario")
    private Long cedulaUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email_usuario")
    private String emailUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "usuario")
    private String usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cedulaUsuario")
    private Collection<Ventas> ventasCollection;

    public Usuarios() {
    }

    public Usuarios(Long cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public Usuarios(Long cedulaUsuario, String emailUsuario, String nombreUsuario, String password, String usuario) {
        this.cedulaUsuario = cedulaUsuario;
        this.emailUsuario = emailUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.usuario = usuario;
    }

    public Long getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(Long cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public Collection<Ventas> getVentasCollection() {
        return ventasCollection;
    }

    public void setVentasCollection(Collection<Ventas> ventasCollection) {
        this.ventasCollection = ventasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaUsuario != null ? cedulaUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.cedulaUsuario == null && other.cedulaUsuario != null) || (this.cedulaUsuario != null && !this.cedulaUsuario.equals(other.cedulaUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.gov.mntc.tenda.enttys.Usuarios[ cedulaUsuario=" + cedulaUsuario + " ]";
    }
    
}
