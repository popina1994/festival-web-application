package entity;
// Generated Feb 14, 2017 6:22:11 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Comment generated by hbm2java
 */
@Entity
@Table(name="comment"
    ,catalog="projekat"
)
public class Comment  implements java.io.Serializable {


     private Integer idreservation;
     private Reservation reservation;
     private String text;

    public Comment() {
    }

    public Comment(Reservation reservation, String text) {
       this.reservation = reservation;
       this.text = text;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="reservation"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="IDReservation", unique=true, nullable=false)
    public Integer getIdreservation() {
        return this.idreservation;
    }
    
    public void setIdreservation(Integer idreservation) {
        this.idreservation = idreservation;
    }

@OneToOne(fetch=FetchType.EAGER)@PrimaryKeyJoinColumn
    public Reservation getReservation() {
        return this.reservation;
    }
    
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    
    @Column(name="Text", nullable=false, length=65535)
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }




}


