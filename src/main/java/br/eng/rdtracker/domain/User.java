package br.eng.rdtracker.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by rafael-danieli on 08/03/2017.
 */
@Table(name = "USERS")
@Entity
public class User implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @Id
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String pwd;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE")
    private Calendar creationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
