package com.example.MapStructL.mapper;

import com.example.MapStructL.mapper.POJO.Person1;
import com.example.MapStructL.mapper.POJO.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class DecClass implements IMyMapper{

    @Autowired
    @Qualifier("delegate")
    IMyMapper delegate;

    @Override
    public Person2 toPerson2(Person1 person1) {
        return null;//delegate.toPerson2(person1);
    }
}
