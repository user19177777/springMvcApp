package springMvcApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam("name")String name){

        System.out.println(name);
        return "hello";
    }
}
