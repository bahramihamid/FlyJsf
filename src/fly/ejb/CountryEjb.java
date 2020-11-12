package fly.ejb;

import fly.entity.pak1.Country;
import fly.entity.pak1.Passenger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CountryEjb {
    @PersistenceContext(unitName = "FlyPU")
    private EntityManager em;

    public void save(Country country){
        em.merge(country);
    }
}
