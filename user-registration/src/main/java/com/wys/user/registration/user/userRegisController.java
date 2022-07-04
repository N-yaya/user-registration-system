package com.wys.user.registration.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RequestMapping(path = "api/v1/registration")
@RestController
public class userRegisController {
   private final userRegisService userRegisService;
    @Autowired
    public userRegisController(userRegisService userRegisService) {

        this.userRegisService = userRegisService;
    }

    @RequestMapping("/")
    public String viewHomePage(Model model ) {
        model.addAttribute("users",userRegisService.getUser());
        return"index";
    }
    @PostMapping
    public String registerNewUser(@RequestBody  userRegis userRegis) {
        userRegisService.addNewUser(userRegis);
        return "user_registration";
    }
    @DeleteMapping( path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId ) {

        userRegisService.deleteUser(userId);
    }

}
