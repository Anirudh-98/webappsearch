package com.example.Searchbyname.Database;


import com.example.Searchbyname.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
         List<User> findByBrand(String brand);
         List<User> findByPrice(Double price);
         List<User> findByModel(String model);
}
