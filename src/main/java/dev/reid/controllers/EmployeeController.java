package dev.reid.controllers;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import dev.reid.entities.Employee;
import dev.reid.repos.EmployeeRepo;
import dev.reid.services.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin // CORS is evil and I despise it
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    JwtService jwtService;

    @GetMapping("/teachers")
    public List<Employee> getAllEmployees(@RequestHeader("auth") String jwt)
    {

        System.out.println(jwt);
        if (jwtService.validateJwt(jwt))
        {
            DecodedJWT decodedJwt = JWT.decode(jwt);
            String role = decodedJwt.getClaim("role").asString();

            if (role.equals("admin"))
            {
                return employeeRepo.findAll();
            }
            else {
                throw new RuntimeException("You must be an admin to see these grades");
            }
        }
        throw new RuntimeException("invalid JWT");
    }
}
