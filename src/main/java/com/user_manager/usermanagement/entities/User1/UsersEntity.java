package com.user_manager.usermanagement.entities.User1;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users", schema = "gestionutilisateur", catalog = "")
public class UsersEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "about")
    private String about;
    @Basic
    @Column(name = "covertimg")
    private String covertimg;
    @Basic
    @Column(name = "profilimg")
    private String profilimg;
    @Basic
    @Column(name = "numbref")
    private int numbref;
    @Basic
    @Column(name = "issupporter")
    private boolean issupporter;

    private Date created_at;

    public UsersEntity(int user_id, String first_name, String email, String password, String about, String covertimg, String profilimg, int numberf, boolean issupporter, Date created_at) {
        this.userId = user_id;
        this.firstName = first_name;
        this.email = email;
        this.password = password;
        this.about = about;
        this.covertimg = covertimg;
        this.profilimg = profilimg;
        this.numbref = numberf;
        this.issupporter = issupporter;
        this.created_at = created_at;
    }

    public UsersEntity() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCovertimg() {
        return covertimg;
    }

    public void setCovertimg(String covertimg) {
        this.covertimg = covertimg;
    }

    public String getProfilimg() {
        return profilimg;
    }

    public void setProfilimg(String profilimg) {
        this.profilimg = profilimg;
    }

    public int getNumbref() {
        return numbref;
    }

    public void setNumbref(int numbref) {
        this.numbref = numbref;
    }

    public boolean getIssupporter() {
        return issupporter;
    }

    public void setIssupporter(boolean issupporter) {
        this.issupporter = issupporter;
    }




}
