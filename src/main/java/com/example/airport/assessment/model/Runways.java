package com.example.airport.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Runways {
    @Id
    @GeneratedValue
private int id;
    @Column
    private String airport_re;
    @Column
    private String airport_ident;
    @Column
    private String length_ft;
    @Column
    private String width_fr;
    @Column
    private String surface;
    @Column
    private String lighted;
    @Column
    private String closed;
    @Column
    private String le_ident;
    @Column
    private String le_latitude;
    @Column
    private String le_longituon;
    @Column
    private String le_elevation;
    @Column
    private String le_heading;
    @Column
    private String le_displace;
    @Column
    private String he_ident;

    @Override
    public String toString() {
        return "Runways{" +
                "id=" + id +
                ", airport_re='" + airport_re + '\'' +
                ", airport_ident='" + airport_ident + '\'' +
                ", length_ft='" + length_ft + '\'' +
                ", width_fr='" + width_fr + '\'' +
                ", surface='" + surface + '\'' +
                ", lighted='" + lighted + '\'' +
                ", closed='" + closed + '\'' +
                ", le_ident='" + le_ident + '\'' +
                ", le_latitude='" + le_latitude + '\'' +
                ", le_longituon='" + le_longituon + '\'' +
                ", le_elevation='" + le_elevation + '\'' +
                ", le_heading='" + le_heading + '\'' +
                ", le_displace='" + le_displace + '\'' +
                ", he_ident='" + he_ident + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirport_re() {
        return airport_re;
    }

    public void setAirport_re(String airport_re) {
        this.airport_re = airport_re;
    }

    public String getAirport_ident() {
        return airport_ident;
    }

    public void setAirport_ident(String airport_ident) {
        this.airport_ident = airport_ident;
    }

    public String getLength_ft() {
        return length_ft;
    }

    public void setLength_ft(String length_ft) {
        this.length_ft = length_ft;
    }

    public String getWidth_fr() {
        return width_fr;
    }

    public void setWidth_fr(String width_fr) {
        this.width_fr = width_fr;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getLighted() {
        return lighted;
    }

    public void setLighted(String lighted) {
        this.lighted = lighted;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getLe_ident() {
        return le_ident;
    }

    public void setLe_ident(String le_ident) {
        this.le_ident = le_ident;
    }

    public String getLe_latitude() {
        return le_latitude;
    }

    public void setLe_latitude(String le_latitude) {
        this.le_latitude = le_latitude;
    }

    public String getLe_longituon() {
        return le_longituon;
    }

    public void setLe_longituon(String le_longituon) {
        this.le_longituon = le_longituon;
    }

    public String getLe_elevation() {
        return le_elevation;
    }

    public void setLe_elevation(String le_elevation) {
        this.le_elevation = le_elevation;
    }

    public String getLe_heading() {
        return le_heading;
    }

    public void setLe_heading(String le_heading) {
        this.le_heading = le_heading;
    }

    public String getLe_displace() {
        return le_displace;
    }

    public void setLe_displace(String le_displace) {
        this.le_displace = le_displace;
    }

    public String getHe_ident() {
        return he_ident;
    }

    public void setHe_ident(String he_ident) {
        this.he_ident = he_ident;
    }
}
