package com.example.MapStructL.mapper.POJO;

import java.util.Objects;

public class Person2 {
    String id;
    String field2;
    String sameField;

    public Person2() {
    }

    public Person2(String id, String field2, String sameField) {
        this.id = id;
        this.field2 = field2;
        this.sameField = sameField;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id='" + id + '\'' +
                ", field2='" + field2 + '\'' +
                ", sameField='" + sameField + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return Objects.equals(id, person2.id) && Objects.equals(field2, person2.field2) && Objects.equals(sameField, person2.sameField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field2, sameField);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getSameField() {
        return sameField;
    }

    public void setSameField(String sameField) {
        this.sameField = sameField;
    }
}
