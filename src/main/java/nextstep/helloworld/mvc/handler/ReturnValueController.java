package nextstep.helloworld.mvc.handler;

import nextstep.helloworld.mvc.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/return-value")
public class ReturnValueController {

    @GetMapping("/message")
    public @ResponseBody String string() {
        return "message";
    }

    @GetMapping("/users")
    public @ResponseBody User responseBodyForUser() {
        return new User("name", "email");
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> responseEntity(@PathVariable Long id) {
        return ResponseEntity.ok(new User("name", "email"));
    }

    @GetMapping("/members")
    public ResponseEntity responseEntityFor400() {
        return ResponseEntity.badRequest().build();
    }
}