package entity;
// Generated Feb 14, 2017 6:22:11 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Event generated by hbm2java
 */
@Entity
@Table(name="event"
    ,catalog="projekat"
)
public class Event  implements java.io.Serializable {


     private Integer idevent;
     private Date beginDateTime;
     private Date endDateTime;
     private int ticketPerUser;
     private int ticketPerDay;
     private int cntClick;
     private String place;
     private int ticketPriceInd;
     private int ticketPriceFull;
     private String info;
     private String name;
     private boolean cancelled;
     private Set<Hours> hourses = new HashSet<Hours>(0);
     private Set<Link> links = new HashSet<Link>(0);
     private Set<Reservation> reservations = new HashSet<Reservation>(0);
     private Set<Video> videos = new HashSet<Video>(0);
     private Set<Picture> pictures = new HashSet<Picture>(0);

    public Event() {
    }

	
    public Event(Date beginDateTime, Date endDateTime, int ticketPerUser, int ticketPerDay, int cntClick, String place, int ticketPriceInd, int ticketPriceFull, String info, String name) {
        this.beginDateTime = beginDateTime;
        this.endDateTime = endDateTime;
        this.ticketPerUser = ticketPerUser;
        this.ticketPerDay = ticketPerDay;
        this.cntClick = cntClick;
        this.place = place;
        this.ticketPriceInd = ticketPriceInd;
        this.ticketPriceFull = ticketPriceFull;
        this.info = info;
        this.name = name;
    }
    public Event(Date beginDateTime, Date endDateTime, int ticketPerUser, int ticketPerDay, int cntClick, String place, int ticketPriceInd, int ticketPriceFull, String info, String name, Set<Hours> hourses, Set<Link> links, Set<Reservation> reservations, Set<Video> videos, Set<Picture> pictures) {
       this.beginDateTime = beginDateTime;
       this.endDateTime = endDateTime;
       this.ticketPerUser = ticketPerUser;
       this.ticketPerDay = ticketPerDay;
       this.cntClick = cntClick;
       this.place = place;
       this.ticketPriceInd = ticketPriceInd;
       this.ticketPriceFull = ticketPriceFull;
       this.info = info;
       this.name = name;
       this.hourses = hourses;
       this.links = links;
       this.reservations = reservations;
       this.videos = videos;
       this.pictures = pictures;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDEvent", unique=true, nullable=false)
    public Integer getIdevent() {
        return this.idevent;
    }
    
    public void setIdevent(Integer idevent) {
        this.idevent = idevent;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BeginDateTime", nullable=false, length=19)
    public Date getBeginDateTime() {
        return this.beginDateTime;
    }
    
    public void setBeginDateTime(Date beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EndDateTime", nullable=false, length=19)
    public Date getEndDateTime() {
        return this.endDateTime;
    }
    
    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    
    @Column(name="TicketPerUser", nullable=false)
    public int getTicketPerUser() {
        return this.ticketPerUser;
    }
    
    public void setTicketPerUser(int ticketPerUser) {
        this.ticketPerUser = ticketPerUser;
    }

    
    @Column(name="TicketPerDay", nullable=false)
    public int getTicketPerDay() {
        return this.ticketPerDay;
    }
    
    public void setTicketPerDay(int ticketPerDay) {
        this.ticketPerDay = ticketPerDay;
    }

    
    @Column(name="CntClick", nullable=false)
    public int getCntClick() {
        return this.cntClick;
    }
    
    public void setCntClick(int cntClick) {
        this.cntClick = cntClick;
    }

    
    @Column(name="Place", nullable=false, length=30)
    public String getPlace() {
        return this.place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }

    
    @Column(name="TicketPriceInd", nullable=false)
    public int getTicketPriceInd() {
        return this.ticketPriceInd;
    }
    
    public void setTicketPriceInd(int ticketPriceInd) {
        this.ticketPriceInd = ticketPriceInd;
    }

    
    @Column(name="ticketPriceFull", nullable=false)
    public int getTicketPriceFull() {
        return this.ticketPriceFull;
    }
    
    public void setTicketPriceFull(int ticketPriceFull) {
        this.ticketPriceFull = ticketPriceFull;
    }

    
    @Column(name="Info", nullable=false, length=65535)
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }

    
    @Column(name="Name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    @Column(name="Cancelled", nullable=false)
    public boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="event")
    public Set<Hours> getHourses() {
        return this.hourses;
    }
    
    public void setHourses(Set<Hours> hourses) {
        this.hourses = hourses;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="event")
    public Set<Link> getLinks() {
        return this.links;
    }
    
    public void setLinks(Set<Link> links) {
        this.links = links;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="event")
    public Set<Reservation> getReservations() {
        return this.reservations;
    }
    
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="event")
    public Set<Video> getVideos() {
        return this.videos;
    }
    
    public void setVideos(Set<Video> videos) {
        this.videos = videos;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="event")
    public Set<Picture> getPictures() {
        return this.pictures;
    }
    
    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }




}


