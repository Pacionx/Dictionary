package net.codejava;

import javax.persistence.*;

@Entity
public class Product {
    private Long id;
    private String spol;
    private String sang;

    protected Product() {
        super();

    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public String getSang() {
        return sang;
    }

    public void setSang(String sang) {
        this.sang = sang;
    }
}
