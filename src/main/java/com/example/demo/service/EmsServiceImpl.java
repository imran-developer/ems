package com.example.demo.service;

import com.example.demo.dao.EmsDao;
import com.example.demo.model.Ems;
import com.example.demo.model.GenericServiceResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Log4j2
public class EmsServiceImpl implements EmsService{
    @Autowired
    EmsDao emsDao;


    @Override
    public GenericServiceResponse addDetails(Ems ems) {
        GenericServiceResponse genericServiceResponse= new GenericServiceResponse();
      try {
          genericServiceResponse =emsDao.addDetails(ems);
      }
      catch (Exception e){
          log.info("Exception is EmsServiceimol addDetails"+e.getMessage());
          e.printStackTrace();
          genericServiceResponse.setData(ems);
          genericServiceResponse.setErrorMessage(e.getMessage());
          genericServiceResponse.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
          genericServiceResponse.setMessage("Error in fetching details");



      }

        return genericServiceResponse ;
    }
}
