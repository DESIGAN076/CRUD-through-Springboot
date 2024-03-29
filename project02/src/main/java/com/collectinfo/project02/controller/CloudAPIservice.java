
package com.collectinfo.project02.controller;

import com.collectinfo.project02.model.Appserverr;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appserverr")


public class CloudAPIservice

{
    Appserverr appServer;
    
    @GetMapping("{user_id}")
    public Appserverr getAppserverrdetails(String user_id)
    {
        return appServer;
        //new Appserverr("USER1","C1","XXXXXX");
    } 

    @PostMapping("/src/main/java/com/collectinfo/project02/controller/CloudAPIservice.java")
    public String createAppserverrdetails(@RequestBody Appserverr appServer){

        this.appServer = appServer;
        return " APP server created successfully";

    }
 
    @PutMapping
    public String updateAppserverrdetails(@RequestBody Appserverr appServer){

        this.appServer = appServer;
        return " APP server updated successfully";

    }

    @DeleteMapping("{user_id}")
    public String deleteAppserverrdetails(String user_id){

        this.appServer = null;
        return " APP server deleted successfully";




}
}