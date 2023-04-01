package kr.spring.miraclestep_web.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 관리자 페이지 메뉴 이동 시 Mapping 해주는 컨트롤러 (2023-04-02 인범)
@Controller
@RequiredArgsConstructor
public class AdminPageController {

    // MAIN
    @GetMapping("/admin-main")
    public String main() {
        return "admin/main";
    }

    // USER
    @GetMapping("/admin-searchUser")
    public String searchUser() {
        return "admin/searchUser";
    }

    @GetMapping("/admin-addUser")
    public String addUser() {
        return "admin/addingUser";
    }

    @GetMapping("/admin-modifyUser")
    public String modifyUser() {
        return "admin/modifyingUser";
    }

    @GetMapping("/admin-removeUser")
    public String removeUser() {
        return "admin/removingUser";
    }

    // CAMPAIGN
    @GetMapping("/admin-searchCampaign")
    public String searchCampaign() {
        return "admin/searchCampaign";
    }

    @GetMapping("/admin-removeCampaign")
    public String removeCampaign() {
        return "admin/removeCampaign";
    }


}
