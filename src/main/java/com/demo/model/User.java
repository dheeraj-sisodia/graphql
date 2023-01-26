package com.demo.model;

import java.time.LocalDate;
import java.util.*;

public class User {

    private String userId;
    private String name;
    private String address;
    private Long phone;
    private Integer age;
    private String gender;

    private LocalDate dateOfBirth;
    private Integer cityId;

    private static Map<String, User> userDetails;

    static {
        userDetails = new HashMap<>();
    }

    public User(String userid, String name, String address, Long phone, Integer age, String gender, LocalDate dateOfBirth, Integer cityid) {
        this.userId = userid;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.cityId = cityid;
    }

    public static User getById(String id) {
        User app = userDetails.get(id);
        return app;
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(userDetails.values());
    }

    public static String addFactApplication(UserInput userInput) {
        String id = UUID.randomUUID().toString();
        userDetails.put(id, new User(id, userInput.getName(), userInput.getAddress(), userInput.getPhone(), userInput.getAge(), userInput.getGender(), userInput.getDateOfBirth(), userInput.getCityId()));
        return id;
    }

    public static String updateFactApplication(String id, UserInput userInput) {
        if (userDetails.containsKey(id)) {
            userDetails.put(id, new User(id, userInput.getName(), userInput.getAddress(), userInput.getPhone(), userInput.getAge(), userInput.getGender(), userInput.getDateOfBirth(), userInput.getCityId()));
            return "Success";
        }
        return "Not Found";
    }

    public static String deleteFactApplication(String id) {
        userDetails.remove(id);
        return "Success";
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Integer getCityId() {
        return cityId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}