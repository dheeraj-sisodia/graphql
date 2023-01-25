package com.demo.model;

import java.util.*;

public class User {

    private String userId;
    private String name;
    private String address;
    private String phone;
    private Integer age;
    private String gender;
    private Integer cityId;

    private static Map<String, User> userDetails;

    static {
        userDetails = new HashMap<>();
    }

    public User(String userid, String name, String address, String phone, Integer age, String gender, Integer cityid) {
        this.userId = userid;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.cityId = cityid;
    }

    public static User getById(String id) {
        User app = userDetails.get(id);
        return app;
    }

    public static String addFactApplication(UserInput userInput) {
        String id = UUID.randomUUID().toString();
        userDetails.put(id, new User(id, userInput.getName(), userInput.getAddress(), userInput.getPhone(), userInput.getAge(), userInput.getGender(), userInput.getCityId()));
        return id;
    }

    public static String updateFactApplication(String id, UserInput userInput) {
        if (userDetails.containsKey(id)) {
            userDetails.put(id, new User(id, userInput.getName(), userInput.getAddress(), userInput.getPhone(), userInput.getAge(), userInput.getGender(), userInput.getCityId()));
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

    public String getPhone() {
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

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}