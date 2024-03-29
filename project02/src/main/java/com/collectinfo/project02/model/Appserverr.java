package com.collectinfo.project02.model;

public class Appserverr {
    
    private String user_name;
    private String user_id;
    private String user_phno;





public Appserverr() {       //empty construtor
    }

public Appserverr( String user_name, String user_id,String user_phno ){
    this.user_name = user_name;
    this.user_id = user_id;
    this.user_phno = user_phno;

}

public String getUser_name() {
    return user_name;
}

public void setUser_name(String user_name) {
    this.user_name = user_name;
}

public String getUser_id() {
    return user_id;
}

public void setUser_id(String user_id) {
    this.user_id = user_id;
}

public String getUser_phno() {
    return user_phno;
}

public void setUser_phno(String user_phno) {
    this.user_phno = user_phno;
}
}