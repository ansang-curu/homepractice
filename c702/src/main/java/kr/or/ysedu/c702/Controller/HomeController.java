package kr.or.ysedu.c702.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
public String home(){
    return "home";
}
@GetMapping("/fruits/create")
    public String create(){
        return "fruit-create";
}
}
