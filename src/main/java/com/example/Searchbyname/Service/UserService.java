package com.example.Searchbyname.Service;


import com.example.Searchbyname.Database.UserRepository;
import com.example.Searchbyname.Domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getBrandByName(String brand) {
        return userRepository.findByBrand(brand);
    }

    public List<User> getModelByName(String model) {return userRepository.findByModel(model);}

    public List<User> getByPrice(Double price) {return userRepository.findByPrice(price);}
}
