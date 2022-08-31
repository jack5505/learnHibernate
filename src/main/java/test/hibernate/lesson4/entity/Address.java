package test.hibernate.lesson4.entity;

import javax.persistence.Embeddable;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
@Embeddable
public class Address {
    private String no;
    private String street;
    private String city;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
