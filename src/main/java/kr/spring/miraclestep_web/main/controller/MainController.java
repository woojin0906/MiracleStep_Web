package kr.spring.miraclestep_web.main.controller;// 컨트롤러 테스트
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//일반적으로 @Controller를 적는다.
//아래에 있는 정보를 그대로 client에게 return
@Controller
@RequiredArgsConstructor
public class MainController {

    //	옛날방식
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String main() {
        return "enterprise/writingPost";
    }


}
