package test.hibernate.entities;

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
@Entity(name = "sbns_user")
public class UserEntity {

    @Id
    private Long id;

    @Column
    private String name;



    private ProteinEntity proteinEntity = new ProteinEntity();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProteinEntity getProteinEntity() {
        return proteinEntity;
    }

    public void setProteinEntity(ProteinEntity proteinEntity) {
        this.proteinEntity = proteinEntity;
    }
}
