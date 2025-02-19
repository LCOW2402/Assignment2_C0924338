package com.blog.model;  // ✅ Ensure the correct package

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

@Getter
@ToString
@EqualsAndHashCode
@Builder
public class Person {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String gender;

    public Person(String id, String firstName, String lastName, Integer age, String gender) {
        if (id == null) throw new IllegalArgumentException("ID cannot be null.");
        if (StringUtils.isBlank(firstName)) throw new IllegalArgumentException("First name cannot be blank.");
        if (StringUtils.isBlank(lastName)) throw new IllegalArgumentException("Last name cannot be blank.");
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative.");

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
}
