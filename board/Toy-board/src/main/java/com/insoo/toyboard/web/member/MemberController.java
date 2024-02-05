package com.insoo.toyboard.web.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping(value ="/member/new")
    public String createMemberFormView(Model model){
        model.addAttribute("data", "data");
        return "member/createMemberForm";
    }

    @PostMapping("/member/new")
    public String join(MemberDto member){
        System.out.println("test");
        return "redirect:/";
    }
}
