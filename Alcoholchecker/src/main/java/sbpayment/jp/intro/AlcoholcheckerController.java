package sbpayment.jp.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AlcoholcheckerController {
@Autowired
private JdbcTemplate jdbc;


@GetMapping("/index")
public String sample(Model model) {
//model.addAttribute("name", "hiroki");
//model.addAttribute("age", 23);

return "index";
}

@GetMapping("/form")
public String sample2(String name, int age, Model model) {

model.addAttribute("name", name);
model.addAttribute("age", age);

return "index";
}

@PostMapping("/post")
public String Post(String name, int age,RedirectAttributes attr){
    attr.addFlashAttribute("name", name);
    attr.addFlashAttribute("age", age);
    
    jdbc.update("insert into person (age,name) values(?,?);", age,name);
    attr.addFlashAttribute("people",jdbc.queryForList("SELECT * FROM person"));
    //Map<String, Object> person = jdbc.queryForList("SELECT * FROM person where name = ?", name).get(0);
    return "redirect:/index";
}


}
