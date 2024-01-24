package com.metacoding.myhttp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    String[] geo = new String[2];
}

@AllArgsConstructor
class Company {
    String name;
    String catchPhrase;
    String bs;
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Users {
    private String id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
