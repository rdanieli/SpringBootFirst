package br.eng.rdtracker.rest;

import br.eng.rdtracker.domain.User;
import br.eng.rdtracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * Created by rafael-danieli on 06/03/2017.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/newUser")
    public User newUser() {
        User user = new User();
        user.setName("Rafael");
        user.setCreationDate(Calendar.getInstance());
        user.setPwd("mazá");
        userService.save(user);
        return user;
    }

    @RequestMapping("/alive")
    public String alive(){
        return "I'm a REST service alive";
    }
}
