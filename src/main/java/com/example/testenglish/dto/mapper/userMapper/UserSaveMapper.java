package com.example.testenglish.dto.mapper.userMapper;

import com.example.testenglish.dto.request.UserDto;
import com.example.testenglish.model.Role;
import com.example.testenglish.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserSaveMapper implements Converter<UserDto, User> {

    @Override
    public User convert(UserDto newUser) {
        User user = new User();
        user.setName(newUser.getName());
        user.setPassword(newUser.getPassword());
        user.setEmail(newUser.getEmail());
        Role role = new Role();
        role.setName("STUDENT");
        user.setRoles(role);

        return user;

    }
}
