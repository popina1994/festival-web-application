package entity;
// Generated Feb 14, 2017 6:22:11 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Picture generated by hbm2java
 */
@Entity
@Table(name="picture"
    ,catalog="projekat"
)
public class Picture  implements java.io.Serializable {


     private Integer idpicture;
     private Event event;
     private String name;
     private String path;
     private boolean approved;
     private boolean needsApproval;

    public Picture() {
    }

    public Picture(Event event, String name, String path, boolean approved) {
       this.event = event;
       this.name = name;
       this.path = path;
       this.approved = approved;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDPicture", unique=true, nullable=false)
    public Integer getIdpicture() {
        return this.idpicture;
    }
    
    public void setIdpicture(Integer idpicture) {
        this.idpicture = idpicture;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="IDEvent", nullable=false)
    public Event getEvent() {
        return this.event;
    }
    
    public void setEvent(Event event) {
        this.event = event;
    }

    
    @Column(name="Name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Path", nullable=false)
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    
    @Column(name="Approved", nullable=false)
    public boolean isApproved() {
        return this.approved;
    }
    
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
    @Column(name="NeedsApproval", nullable=false)
    public boolean isNeedsApproval() {
        return needsApproval;
    }

    public void setNeedsApproval(boolean needsApproval) {
        this.needsApproval = needsApproval;
    }

    


}


