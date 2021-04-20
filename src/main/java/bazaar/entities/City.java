package bazaar.entities;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String cityName;
    private boolean active;
    private String lat;
    private String lng;
    @OneToOne
    private State state;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
