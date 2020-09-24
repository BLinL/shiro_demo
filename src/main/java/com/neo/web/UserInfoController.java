package com.neo.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neo.model.UserInfo;
import com.neo.sevice.UserInfoService;
import com.neo.util.CredentialUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(Model model) {
        Iterable<UserInfo> userList = userInfoService.findAll();
        userList.forEach(System.out::println);

        model.addAttribute("userList",userList);
        return "userInfo";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(UserInfo userInfo,Model model) {
        System.out.println("user add");
        String msg = "";
        if (userInfo.getUsername() != null) {
            userInfo.setSalt(CredentialUtil.hash(userInfo.getPassword()));
            userInfo.setPassword(CredentialUtil.hash(userInfo.getPassword(),userInfo.getCredentialsSalt()));
            if(userInfoService.save(userInfo)){
                msg = "添加成功！";
                System.out.println(msg);
            }else{
                msg = "添加失败！";
                System.out.println(msg);

            }
        }
        model.addAttribute("msg",msg);
        userInfo(model);
        return "userInfo";
    }

    /**
     * 用户更新
     */
    @PostMapping("userUpdate")
    public String updateUser(UserInfo userInfo,Model model){
        String msg = "";
        if(userInfoService.update(userInfo)){
            msg = "更新成功！";
            System.out.println(msg);
        }else{
            msg = "更新失败！";
            System.out.println(msg);

        }
        model.addAttribute("msg",msg);
        userInfo(model);
        return "userInfo";
    }

    /**
     * 用户删除;
     * @return
     */
    @DeleteMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(int uid,Model model)
    {
        userInfoService.delByUid(uid);
        model.addAttribute("msg","成功删除");
        Iterable<UserInfo> userList = userInfoService.findAll();
        userList.forEach(System.out::println);
        model.addAttribute("userList",userList);
        return "userInfo";
    }
}