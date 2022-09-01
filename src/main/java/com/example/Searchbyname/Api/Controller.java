package com.example.Searchbyname.Api;


import com.example.Searchbyname.Domain.User;
import com.example.Searchbyname.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class Controller {

     private UserService userService;

    @GetMapping(value="/find/{id}")
    public Optional<User> getAdd(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    // Find by Brand name
    @GetMapping("/find/brand/{brand}")
    public List<User> getByBrand (@PathVariable("brand") String brand ){
        return userService.getBrandByName(brand);
    }
    // Find by Model name
    @GetMapping("/find/model/{model}")
    public List<User> getByModel(@PathVariable("model") String model){
        return userService.getModelByName(model);
    }
    // Find by Price
    @GetMapping("/find/price/{price}")
    public List<User> getByPrice (@PathVariable("price") Double price ) { return userService.getByPrice(price);}

}
