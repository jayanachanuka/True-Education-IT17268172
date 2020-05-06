/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jayana
 */
@Entity
@Table(name = "MANAGECP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Managecp.findAll", query = "SELECT m FROM Managecp m")
    , @NamedQuery(name = "Managecp.findById", query = "SELECT m FROM Managecp m WHERE m.id = :id")
    , @NamedQuery(name = "Managecp.findByName", query = "SELECT m FROM Managecp m WHERE m.name = :name")})
public class Managecp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = true)
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String name;
    @Lob
    @Column(name = "DURATION")
    private String duration;
    @Lob
    @Column(name = "FEES")
    private String fees;
    @Lob
    @Column(name = "CONTENT")
    private String content;

    public Managecp() {
    }

    public Managecp(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        String oldDuration = this.duration;
        this.duration = duration;
        changeSupport.firePropertyChange("duration", oldDuration, duration);
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        String oldFees = this.fees;
        this.fees = fees;
        changeSupport.firePropertyChange("fees", oldFees, fees);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        String oldContent = this.content;
        this.content = content;
        changeSupport.firePropertyChange("content", oldContent, content);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Managecp)) {
            return false;
        }
        Managecp other = (Managecp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CODE.Managecp[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
