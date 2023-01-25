package com.demo.controller;

import com.demo.model.City;
import com.demo.model.User;
import com.demo.model.UserInput;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @QueryMapping
    public User userById(@Argument String id) {
        return User.getById(id);
    }

    @SchemaMapping
    public City city(User user) {
        return City.getById(user.getCityId());
    }

    @MutationMapping
    public String addUser(@Argument UserInput userInput) {
        return User.addFactApplication(userInput);
    }

    @MutationMapping
    public String updateUser(@Argument String id, @Argument UserInput userInput) {
        return User.updateFactApplication(id, userInput);
    }

    @MutationMapping
    public String deleteUser(@Argument String id) {
        return User.deleteFactApplication(id);
    }
}