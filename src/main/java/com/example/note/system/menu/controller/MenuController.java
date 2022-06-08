package com.example.note.system.menu.controller;

import com.example.note.system.base.response.BaseController;
import com.example.note.system.base.response.BaseResponse;
import com.example.note.system.menu.service.MenuService;
import com.example.note.system.menu.view.MenuNoteRequestBody;
import com.example.note.system.menu.view.MenuNoteVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/6/8 19:43
 */
@RestController
@RequestMapping("base/menu")
public class MenuController extends BaseController {

    @Autowired
    private MenuService menuService;

    @ApiOperation(value = "查询菜单列表", notes = "查询菜单列表")
    @PostMapping("/findChildMenuList")
    public BaseResponse<List<MenuNoteVo>> findChildMenuList(@RequestBody MenuNoteRequestBody body){
        return ok(menuService.findChildMenuList(body));
    }


}