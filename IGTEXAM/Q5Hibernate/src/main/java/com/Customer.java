package com;

 

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

 

 

@Entity

 

public class Customer {
    @Id

    private int cid;
    //@Column(name="UserName")
    private String cname;
   // @Column(name="Designation")
    private String place;
    private String pancard;
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getPancard() {
        return pancard;
    }
    public void setPancard(String pancard) {
        this.pancard = pancard;
    }
}

 