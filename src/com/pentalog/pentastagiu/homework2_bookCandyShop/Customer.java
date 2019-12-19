package com.pentalog.pentastagiu.homework2_bookCandyShop;

public class Customer {
    private Integer idUser;
    private String password;
    private String name;
    private String email;
    private MembershipStatus membership;

    //constructors
    public Customer() {
    }

    public Customer(Integer idUser, String password, String name, String email,
                    MembershipStatus membership) {
        this.idUser = idUser;
        this.password = password;
        this.name = name;
        this.email = email;
        this.membership = membership;
    }

    //getters and setters
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public MembershipStatus getMembership() {
        return membership;
    }
    public void setMembership(MembershipStatus membership) {
        this.membership = membership;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idUser=" + idUser +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", membership=" + membership +
                '}';
    }
}
