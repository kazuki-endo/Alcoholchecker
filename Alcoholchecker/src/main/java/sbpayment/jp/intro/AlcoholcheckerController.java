package sbpayment.jp.intro;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class AlcoholcheckerController {
@Autowired
private JdbcTemplate jdbc;


//topページを返す
@GetMapping("/index")
public String index(Model model) {
	return "index";
}

@GetMapping("/check")
public String check(Model model) {
	return "check";

}

/*@RequestMapping("check")
 * public String check(){
 * return "check";
 * }
 * 

 @RequestMapping("result")
 public String result(ModelMap modelmap, @RequestParam("") int a)
	int sum = a * 450;
	modelMap.addAttribute("a",a);
	modelMap.addAttribute("sum",sum);
	return "result"
}
	
	
	
////////入力された値を取得///////////
/*@RequestMapping(value = "/", method = RequestMethod.POST)
//public ModelAndView send(
	@RequestParam(value="check1")int check1,
	@RequestParam(value="check2")int check2,
	@RequestParam(value="check3")int check3,
	@RequestParam(value="check4")int check4,
	@RequestParam(value="check5")int check5,
	@RequestParam(value="check6")int check6,
	ModelAndView mav){
	
	入力された値 * DBから取得した値
	
//}
 * 
 * 
  ////リダイレクト 
 * @Requestmapping("/other")
 * public String other(){
 * 	return "redirect:"
 */
	


//結果を表示する
@GetMapping("/result")
public String result() {
	return "result";
}

//@PostMapping("/post")
//public String Post(String name, int age,RedirectAttributes attr){
   // attr.addFlashAttribute("number", number);
    
    
    /*jdbc.update("insert into person (age,name) values(?,?);", age,name);
    attr.addFlashAttribute("people",jdbc.queryForList("SELECT * FROM person"));
    //Map<String, Object> person = jdbc.queryForList("SELECT * FROM person where name = ?", name).get(0);
    return "redirect:/sample";*/
}


