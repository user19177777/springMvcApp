package springMvcApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//добавляет перед страницей
@RequestMapping("/calc")
public class CalculateController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam("a")int a, @RequestParam("b")int b,
                            @RequestParam("action")String action,
                            //добавляем модель для передачи данных от контроллера к представлению через таймлиф
                            Model model){
        double result;
        switch (action) {
            case "m":
                result = a * b;
                break;
            case "d":
                result = a / (double) b;
                break;
            case "s":
                result = a - b;
                break;
            case "a":
                result = a + b;
                break;
            default:
                result = 0;
        }
            //помещаем данные в модель
            model.addAttribute("result",result);
            model.addAttribute("a",a);
            model.addAttribute("b",b);
            model.addAttribute("action",action);

        return "calculator";
    }
}
