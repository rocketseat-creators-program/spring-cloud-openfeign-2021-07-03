package com.expertsclub.openfeign.resource;

import com.expertsclub.openfeign.dto.UserResponseDTO;
import com.expertsclub.openfeign.dto.mapper.UserMapper;
import com.expertsclub.openfeign.entity.User;
import com.expertsclub.openfeign.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserResource {

    private UserService userService;

    @GetMapping("/{id}/covid")
    public UserResponseDTO getUserWithConvidInfo(@PathVariable String id) {
        return this.userService.findByIdWithCovidInfo(id);
    }

    @PostMapping
    public UserResponseDTO create(@RequestBody User user) {
        return UserMapper.toDTO(this.userService.create(user));
    }

}
