package com.example.MapStructL.mapper.POJO;

import java.util.Objects;

public class Person1 {
    String id;
    String field1;
    String sameField;

    public Person1() {
    }

    public Person1(String id, String field1, String sameField) {
        this.id = id;
        this.field1 = field1;
        this.sameField = sameField;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id='" + id + '\'' +
                ", field1='" + field1 + '\'' +
                ", sameField='" + sameField + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(id, person1.id) && Objects.equals(field1, person1.field1) && Objects.equals(sameField, person1.sameField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field1, sameField);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getSameField() {
        return sameField;
    }

    public void setSameField(String sameField) {
        this.sameField = sameField;
    }
}
