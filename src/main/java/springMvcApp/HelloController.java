package springMvcApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println(name);
        return "hello";
    }
}
