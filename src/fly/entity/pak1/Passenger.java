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
 * مسافر
 */
@Entity
@Table(name="Passenger")
public class Passenger implements Serializable {
	public Passenger() {
	}
	
	@Column(name="Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FLY_ENTITY_PAK1_PASSENGER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FLY_ENTITY_PAK1_PASSENGER_ID_GENERATOR", strategy="native")	
	private Long id;
	
	@ManyToOne(targetEntity=fly.entity.pak1.Ticket.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="TicketId", referencedColumnName="Id") })
	private fly.entity.pak1.Ticket passenger;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="BirthDate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date birthDate;
	
	@ManyToMany(mappedBy="passenger", targetEntity=fly.entity.pak1.Fly.class)	
	private java.util.Set<fly.entity.pak1.Fly> fly = new java.util.HashSet<fly.entity.pak1.Fly>();
	
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
	
	public void setBirthDate(java.util.Date value) {
		this.birthDate = value;
	}
	
	public java.util.Date getBirthDate() {
		return birthDate;
	}
	
	public void setPassenger(fly.entity.pak1.Ticket value) {
		this.passenger = value;
	}
	
	public fly.entity.pak1.Ticket getPassenger() {
		return passenger;
	}
	
	public void setFly(java.util.Set<fly.entity.pak1.Fly> value) {
		this.fly = value;
	}
	
	public java.util.Set<fly.entity.pak1.Fly> getFly() {
		return fly;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
