package kg.easy.loginsevice.controllers;

import kg.easy.loginsevice.models.dto.SessionDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/session")
public class SessionController {
    @GetMapping("/auth")
    public SessionDto auth(@RequestParam String login,@RequestParam String password){
        return null;
    }
    @GetMapping("/out")
public boolean logOut(@RequestHeader("/auth") String auth){
        return false;
}
public boolean checkSession(@RequestHeader("/auth") String auth){
        return true;
}
}
