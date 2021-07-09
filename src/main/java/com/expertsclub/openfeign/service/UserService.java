package com.expertsclub.openfeign.service;

import com.expertsclub.openfeign.client.AddressAPI;
import com.expertsclub.openfeign.client.CovidAPI;
import com.expertsclub.openfeign.dto.AddressDTO;
import com.expertsclub.openfeign.dto.UserResponseDTO;
import com.expertsclub.openfeign.dto.mapper.UserMapper;
import com.expertsclub.openfeign.entity.User;
import com.expertsclub.openfeign.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private CovidAPI covidAPI;
    private AddressAPI addressAPI;
    private UserRepository userRepository;

    public List<UserResponseDTO> findAllWithCovidInfo() {
        return this.userRepository.findAll()
                .stream()
                .map(user -> {
                    UserResponseDTO dto = UserMapper.toDTO(user);
                        dto.setCovidInfo(this.covidAPI.getInfoByUF(user.getState()));
                    return dto;
                }).collect(Collectors.toList());
    }

    public UserResponseDTO findByIdWithCovidInfo(String id) {
        User user = this.userRepository.findById(id).orElseThrow();
        UserResponseDTO dto = UserMapper.toDTO(user);
            dto.setCovidInfo(this.covidAPI.getInfoByUF(user.getState()));
        return dto;
    }

    public User create(User user) {
        user.setId(UUID.randomUUID().toString());
        user.setCreatedAt(LocalDateTime.now());

        AddressDTO address = this.addressAPI.findByCep(user.getZipCode());
        BeanUtils.copyProperties(address, user);

        return this.userRepository.save(user);
    }


}
