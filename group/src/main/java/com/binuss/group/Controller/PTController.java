package com.binuss.group.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binuss.group.Entity.PT;
import com.binuss.group.Repository.PTRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/binuss/pt")
public class PTController {
    @Autowired
    private PTRepository ptRepository;

    @PostMapping("/add")
    public PT addPT(@RequestBody PT newPt) {
        PT pt = new PT(newPt);
        System.out.println(pt.getEmail());
        
        // pt.setNamaPT(namaPT);
        // pt.setAlamatLengkap(alamatLengkap);
        // pt.setKota(kota);
        // pt.setEmail(email);
        // pt.setLogo(logo);
        // pt.setNpwpPT(npwpPT);
        ptRepository.save(pt);
        return pt;
    }
    
    @GetMapping("/all")
    public List<PT> retrieveAllPT(){
        return ptRepository.findAll();
    }

}
