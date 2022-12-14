package test.hibernate.lesson3.entity;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
@Entity(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "exp_date")
    private LocalDate expdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getExpdate() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
        this.expdate = expdate;
    }
}
