package com.example.demo.controller;

import com.example.demo.model.Ems;
import com.example.demo.model.GenericServiceResponse;
import com.example.demo.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ems")
public class EmsController {

    @Autowired
    EmsService emsService;


  @PostMapping
    public ResponseEntity addDetails(@RequestBody  Ems ems){
        GenericServiceResponse genericServiceResponse = emsService.addDetails(ems );
        return new ResponseEntity<>(genericServiceResponse,genericServiceResponse.getHttpStatus());
    }


}
