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


    @GetMapping("/main")
    public String main7() {
        return "main";
    }

    @GetMapping("/")
    public String main1() {
        return "enterprise/enterpriseMain";
    }

    @GetMapping("/mypage")
    public String main13() {
        return "mypage/mypage";
    }

    @GetMapping("/boardList")
    public String main2() {
        return "board/boardList";
    }

    @GetMapping("/boardPost")
    public String main3() {
        return "board/boardPost";
    }

    @GetMapping("/boardWritingPost")
    public String main4() {
        return "board/boardWritingPost";
    }

    @GetMapping("/campaignList")
    public String main5() {
        return "enterprise/campaignList";
    }

    @GetMapping("/campaignPost")
    public String main6() {
        return "enterprise/campaignPost";
    }

    @GetMapping("/writingPost")
    public String main8() {
        return "enterprise/writingPost";
    }

    @GetMapping("/mypageCampaign")
    public String main9() {
        return "mypage/mypageCampaign";
    }

    @GetMapping("/mypageUpdateMember")
    public String main10() {
        return "mypage/mypageUpdateMember";
    }

    @GetMapping("/login")
    public String main11() {
        return "member/login";
    }

    @GetMapping("/join")
    public String main12() {
        return "member/join";
    }


}
