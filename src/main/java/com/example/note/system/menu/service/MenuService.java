package com.example.note.system.menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.note.system.menu.entity.MenuNotePo;
import com.example.note.system.menu.view.MenuNoteRequestBody;
import com.example.note.system.menu.view.MenuNoteVo;

import java.util.List;

public interface MenuService extends IService<MenuNotePo> {

    List<MenuNoteVo> findChildMenuList(MenuNoteRequestBody body);
}
