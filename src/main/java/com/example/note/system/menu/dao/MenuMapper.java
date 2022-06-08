package com.example.note.system.menu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.note.system.menu.entity.MenuNotePo;
import com.example.note.system.menu.view.MenuNoteRequestBody;
import com.example.note.system.menu.view.MenuNoteVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MenuMapper extends BaseMapper<MenuNotePo> {


  List<MenuNoteVo> findChildMenuList(@Param("body") MenuNoteRequestBody body);

}
