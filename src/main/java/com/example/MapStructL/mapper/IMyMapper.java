package com.example.MapStructL.mapper;

import com.example.MapStructL.mapper.POJO.Person1;
import com.example.MapStructL.mapper.POJO.Person2;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(DecClass.class)
public interface IMyMapper {

    public Person1 toPerson1(Person2 person2);

    public Person2 toPerson2(Person1 person1);

}
