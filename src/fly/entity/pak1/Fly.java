/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package fly.entity.pak1;

import java.io.Serializable;
import javax.persistence.*;
/**
 * پرواز
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Fly")
public class Fly implements Serializable {
	public Fly() {
	}
	
	@Column(name="Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FLY_ENTITY_PAK1_FLY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FLY_ENTITY_PAK1_FLY_ID_GENERATOR", strategy="native")	
	private Long id;
	
	@ManyToOne(targetEntity=fly.entity.pak1.Plane.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PlaneId", referencedColumnName="Id") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private fly.entity.pak1.Plane plane;
	
	@ManyToOne(targetEntity=fly.entity.pak1.Airport.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AirportId2", referencedColumnName="Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private fly.entity.pak1.Airport Origin;
	
	@ManyToOne(targetEntity=fly.entity.pak1.Airport.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AirportId", referencedColumnName="Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private fly.entity.pak1.Airport destination;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Code", nullable=true, length=255)	
	private String code;
	
	@ManyToMany(targetEntity=fly.entity.pak1.Passenger.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Passenger_Fly", joinColumns={ @JoinColumn(name="FlyId") }, inverseJoinColumns={ @JoinColumn(name="PassengerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set<fly.entity.pak1.Passenger> passenger = new java.util.HashSet<fly.entity.pak1.Passenger>();
	
	@OneToMany(targetEntity=fly.entity.pak1.Ticket.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FlyId", nullable=true) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set<fly.entity.pak1.Ticket> ticket = new java.util.HashSet<fly.entity.pak1.Ticket>();
	
	private void setId(long value) {
		setId(new Long(value));
	}
	
	private void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getORMID() {
		return getId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setPassenger(java.util.Set<fly.entity.pak1.Passenger> value) {
		this.passenger = value;
	}
	
	public java.util.Set<fly.entity.pak1.Passenger> getPassenger() {
		return passenger;
	}
	
	
	public void setTicket(java.util.Set<fly.entity.pak1.Ticket> value) {
		this.ticket = value;
	}
	
	public java.util.Set<fly.entity.pak1.Ticket> getTicket() {
		return ticket;
	}
	
	
	public void setOrigin(fly.entity.pak1.Airport value) {
		this.Origin = value;
	}
	
	public fly.entity.pak1.Airport getOrigin() {
		return Origin;
	}
	
	public void setPlane(fly.entity.pak1.Plane value) {
		this.plane = value;
	}
	
	public fly.entity.pak1.Plane getPlane() {
		return plane;
	}
	
	public void setDestination(fly.entity.pak1.Airport value) {
		this.destination = value;
	}
	
	public fly.entity.pak1.Airport getDestination() {
		return destination;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
