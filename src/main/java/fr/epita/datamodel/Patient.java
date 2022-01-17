package fr.epita.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@Table(name = "Patient")
public class Patient{
    @Id
    @Column(name = "num_HC")
    private Long pat_num_HC;

    @Column(name = "lastname")
    private String pat_lastname;

    @Column(name = "firstname")
    private String pat_firstname;

    @Column(name = "address")
    private String pat_address;

    @Column(name = "tel")
    private String pat_tel;

    @Column(name = "insurance_id")
    private int pat_insurance_id;

    @Column(name = "sub_date")
    private String pat_sub_date;

    public Patient() {
    }

    public Patient(Long pat_num_HC, String pat_lastname, String pat_firstname, String pat_address, String pat_tel, int pat_insurance_id, String pat_sub_date) {
        this.pat_num_HC = pat_num_HC;
        this.pat_lastname = pat_lastname;
        this.pat_firstname = pat_firstname;
        this.pat_address = pat_address;
        this.pat_tel = pat_tel;
        this.pat_insurance_id = pat_insurance_id;
        this.pat_sub_date = pat_sub_date;
    }

    public Long getPat_num_HC() {
        return pat_num_HC;
    }

    public void setPat_num_HC(Long pat_num_HC) {
        this.pat_num_HC = pat_num_HC;
    }

    public String getPat_lastname() {
        return pat_lastname;
    }

    public void setPat_lastname(String pat_lastname) {
        this.pat_lastname = pat_lastname;
    }

    public String getPat_firstname() {
        return pat_firstname;
    }

    public void setPat_firstname(String pat_firstname) {
        this.pat_firstname = pat_firstname;
    }

    public String getPat_address() {
        return pat_address;
    }

    public void setPat_address(String pat_address) {
        this.pat_address = pat_address;
    }

    public String getPat_tel() {
        return pat_tel;
    }

    public void setPat_tel(String pat_tel) {
        this.pat_tel = pat_tel;
    }

    public int getPat_insurance_id() {
        return pat_insurance_id;
    }

    public void setPat_insurance_id(int pat_insurance_id) {
        this.pat_insurance_id = pat_insurance_id;
    }

    public String getPat_sub_date() {
        return pat_sub_date;
    }

    public void setPat_sub_date(String pat_sub_date) {
        this.pat_sub_date = pat_sub_date;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pat_num_HC=" + pat_num_HC +
                ", pat_lastname='" + pat_lastname + '\'' +
                ", pat_firstname='" + pat_firstname + '\'' +
                ", pat_address='" + pat_address + '\'' +
                ", pat_tel='" + pat_tel + '\'' +
                ", pat_insurance_id=" + pat_insurance_id +
                ", pat_sub_date=" + pat_sub_date +
                '}';
    }
}