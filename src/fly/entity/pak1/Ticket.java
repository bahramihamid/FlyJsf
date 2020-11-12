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
 * بلیط
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Ticket")
public class Ticket implements Serializable {
	public Ticket() {
	}
	
	@Column(name="Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FLY_ENTITY_PAK1_TICKET_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FLY_ENTITY_PAK1_TICKET_ID_GENERATOR", strategy="native")	
	private Long id;
	
	@ManyToOne(targetEntity=fly.entity.pak1.Plane.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PlaneId", referencedColumnName="Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private fly.entity.pak1.Plane plane;
	
	@Column(name="Price", nullable=true)	
	private Long price;
	
	@Column(name="Type", nullable=true, length=255)	
	private String type;
	
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
	
	public void setPrice(long value) {
		setPrice(new Long(value));
	}
	
	public void setPrice(Long value) {
		this.price = value;
	}
	
	public Long getPrice() {
		return price;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	public void setPlane(fly.entity.pak1.Plane value) {
		this.plane = value;
	}
	
	public fly.entity.pak1.Plane getPlane() {
		return plane;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
