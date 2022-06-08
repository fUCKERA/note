package com.example.note.index.controller;

import com.example.note.index.entity.IndexNotePo;
import com.example.note.index.service.IndexService;
import com.example.note.system.anotation.TestAnnotation;
import com.example.note.system.menu.service.MenuService;
import com.example.note.system.menu.view.MenuNoteRequestBody;
import com.example.note.system.menu.view.MenuNoteVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/5/18 11:30
 */
@Slf4j
@Controller
public class IndexContrller {

    @Autowired
    private IndexService indexService;

    @Autowired
    private MenuService menuService;

    /*@RequestMapping("/")
    @TestAnnotation("传入的参数")
    public String bootJson(){
        log.info("==============================");
        return "backend/index";
    }*/


    @RequestMapping("/findIndexNoteList")
    public @ResponseBody
    List<IndexNotePo> findIndexNoteList(){
        return indexService.findIndexNoteList();
    }
}