package com.wys.user.registration.user;


import javax.persistence.*;

@Entity
@Table
public class userRegis {
@Id
@SequenceGenerator(name = "user_sequence",
                   sequenceName = "user_sequence",
                   allocationSize = 1
                  )
@GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "user_sequence"
)

    private Long id;
    private String name;
    private Long password;
    private String email;
    private String placeOB;

    public userRegis(Long id, String name, Long password, String email, String placeOB) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.placeOB = placeOB;
    }

    public userRegis(String name, Long password, String email, String placeOB) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.placeOB = placeOB;
    }

    public userRegis() {
    }

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

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlaceOB() {
        return placeOB;
    }

    public void setPlaceOB(String placeOB) {
        this.placeOB = placeOB;
    }

    @Override
    public String toString() {
        return "userRegis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", placeOB='" + placeOB + '\'' +
                '}';
    }
}

