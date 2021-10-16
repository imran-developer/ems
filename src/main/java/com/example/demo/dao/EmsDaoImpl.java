package com.example.demo.dao;

import com.example.demo.Repository.EmsRepository;
import com.example.demo.model.Ems;
import com.example.demo.model.GenericServiceResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Log4j2
public class EmsDaoImpl implements EmsDao{
    @Autowired
    EmsRepository emsRepository;

    @Override
    public GenericServiceResponse addDetails(Ems ems) {
        GenericServiceResponse genericServiceResponse= new GenericServiceResponse();
        try {
            Ems emsList=  emsRepository.save(ems);
            genericServiceResponse.setData(ems);
            genericServiceResponse.setHttpStatus(HttpStatus.OK);
            genericServiceResponse.setMessage("Details added successfully");
        }
        catch (Exception e){
            log.info("Exception in EmsDaoiml in addDetails " + e.getMessage());
            e.printStackTrace();
            genericServiceResponse.setData(ems);
          genericServiceResponse.setErrorMessage(e.getMessage());
          genericServiceResponse.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
          genericServiceResponse.setMessage("Erroe in Adding details");



        }
        return genericServiceResponse;
    }
}
