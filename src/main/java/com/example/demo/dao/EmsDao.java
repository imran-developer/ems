package com.example.demo.dao;

import com.example.demo.model.Ems;
import com.example.demo.model.GenericServiceResponse;

import java.lang.management.GarbageCollectorMXBean;

public interface EmsDao {
    public GenericServiceResponse addDetails(Ems ems);

}
