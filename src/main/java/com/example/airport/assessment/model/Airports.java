package com.example.airport.assessment.model;

import javax.persistence.*;

@Entity
public class Airports {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String ident;
    @Column
    private String type;
    @Column
    private String name;
    @Column
    private String latitude_dag;
    @Column
    private String longitude_;
    @Column
    private String elevation_ft;
    @Column
    private String contient;
    @Column
    private String iso_country;
    @Column
    private String iso_region;
    @Column
    private String municipality;
    @Column
    private String scheduled;
    @Column
    private String gps_code;
    @Column
    private String iata_code;
    @Column
    private String local_code;

    @Override
    public String toString() {
        return "Airports{" +
                "id=" + id +
                ", ident='" + ident + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", latitude_dag='" + latitude_dag + '\'' +
                ", longitude_='" + longitude_ + '\'' +
                ", elevation_ft='" + elevation_ft + '\'' +
                ", contient='" + contient + '\'' +
                ", iso_country='" + iso_country + '\'' +
                ", iso_region='" + iso_region + '\'' +
                ", municipality='" + municipality + '\'' +
                ", scheduled='" + scheduled + '\'' +
                ", gps_code='" + gps_code + '\'' +
                ", iata_code='" + iata_code + '\'' +
                ", local_code='" + local_code + '\'' +
                '}';
    }

    public String getContient() {
        return contient;
    }

    public void setContient(String contient) {
        this.contient = contient;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude_dag() {
        return latitude_dag;
    }

    public void setLatitude_dag(String latitude_dag) {
        this.latitude_dag = latitude_dag;
    }

    public String getLongitude_() {
        return longitude_;
    }

    public void setLongitude_(String longitude_) {
        this.longitude_ = longitude_;
    }

    public String getElevation_ft() {
        return elevation_ft;
    }

    public void setElevation_ft(String elevation_ft) {
        this.elevation_ft = elevation_ft;
    }

    public String getIso_region() {
        return iso_region;
    }

    public void setIso_region(String iso_region) {
        this.iso_region = iso_region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getGps_code() {
        return gps_code;
    }

    public void setGps_code(String gps_code) {
        this.gps_code = gps_code;
    }

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getLocal_code() {
        return local_code;
    }

    public void setLocal_code(String local_code) {
        this.local_code = local_code;
    }
}
