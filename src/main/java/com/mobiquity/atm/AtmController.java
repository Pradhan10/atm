package com.mobiquity.atm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AtmController {

    private String temp = "Works";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/atm")
    public Atm atm(@RequestParam(value = "name", defaultValue = "sampel") String name){
        Atm.GeoLocation geoLocation = new Atm.GeoLocation("72.11","53.01");
        return new Atm(new Atm.Address("Baker street","221 B","72811","ohio",geoLocation),"21","normal");
    }

}
