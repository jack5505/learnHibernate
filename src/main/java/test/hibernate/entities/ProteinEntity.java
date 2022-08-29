package test.hibernate.entities;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class ProteinEntity {
    private Long id;
    private Integer goal;
    private Integer total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
