package com.example.note.system.menu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.note.system.menu.dao.MenuMapper;
import com.example.note.system.menu.entity.MenuNotePo;
import com.example.note.system.menu.service.MenuService;
import com.example.note.system.menu.view.MenuNoteRequestBody;
import com.example.note.system.menu.view.MenuNoteVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/6/8 19:38
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuNotePo> implements MenuService {

    @Override
    public List<MenuNoteVo> findChildMenuList(MenuNoteRequestBody body){
        List<MenuNoteVo> lits = this.baseMapper.findChildMenuList(body);
        return lits;
    }
}