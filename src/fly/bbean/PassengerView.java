package fly.bbean;

import fly.ejb.CountryEjb;
import fly.ejb.PassengerEjb;
import fly.entity.pak1.Country;
import fly.entity.pak1.Passenger;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class PassengerView implements Serializable {
    private Passenger passenger;
    private Country country;
    @EJB
    private PassengerEjb passengerEjb;
    @EJB
    private CountryEjb countryEjb;

    public void createPassenger(){
        passenger = new Passenger();
    }

    public void createCountry(){
        country = new Country();
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void save(){
       countryEjb.save(country);
    }
}
