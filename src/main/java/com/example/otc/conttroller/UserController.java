package com.example.otc.conttroller;
import com.example.otc.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
//    private UserMapper user;
    @GetMapping("/info")
    public Object info(){
//        return user.selectById(1);
        return "hello";
    }
}
