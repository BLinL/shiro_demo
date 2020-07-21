package com.bliu.sd.controller;

import com.bliu.sd.common.OpenResultDTO;
import com.bliu.sd.common.StatusCode;
import com.bliu.sd.entity.User;
import com.bliu.sd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
@RequestMapping("/api/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ModelAndView login(@Validated User user, RedirectAttributes redirectAttributes){
        ModelAndView mv = new ModelAndView("redirect:/api/user/login/prev");

        System.out.println(user);
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(user.getUser_name());
        token.setPassword(user.getPassword().toCharArray());

        try {
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
        } catch (UnknownAccountException unknownAccountException){
//            unknownAccountException.printStackTrace();
            OpenResultDTO openResultDTO = new OpenResultDTO(StatusCode.USER_NOT_FOUND_ERR);
            setRedirectAttributes(redirectAttributes,"result", openResultDTO);
            return mv;
        } catch (IncorrectCredentialsException incorrectCredentialsException){
//            incorrectCredentialsException.printStackTrace();
            OpenResultDTO openResultDTO = new OpenResultDTO(StatusCode.USERNAME_OR_PASSWORD_ERR);
            setRedirectAttributes(redirectAttributes,"result", openResultDTO);
            return mv;
        } catch (LockedAccountException lockedAccountException){
//            lockedAccountException.printStackTrace();
            OpenResultDTO openResultDTO = new OpenResultDTO(StatusCode.USER_LOCKED_ERR);
            setRedirectAttributes(redirectAttributes,"result", openResultDTO);
            return mv;
        } catch (AuthenticationException authenticationException){
//            authenticationException.printStackTrace();
            OpenResultDTO openResultDTO = new OpenResultDTO(StatusCode.FAIL,"认证异常");
            setRedirectAttributes(redirectAttributes,"result", openResultDTO);
            return mv;
        } catch (Exception e){
            e.printStackTrace();
            OpenResultDTO openResultDTO = new OpenResultDTO(StatusCode.FAIL,"系统异常");
            setRedirectAttributes(redirectAttributes,"result", openResultDTO);
            return mv;
        }

        log.info("login successfully");
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/login/prev")
    public ModelAndView login(@ModelAttribute("result") OpenResultDTO openResultDTO){
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("user",new User());
        mv.addObject("result",openResultDTO);
        return mv;
    }

    /**
     * 设置重定向参数
     */
    private void setRedirectAttributes(RedirectAttributes redirectAttributes, String attributeKey, Object attributeValue){
        redirectAttributes.addFlashAttribute(attributeKey, attributeValue);
    }
}
