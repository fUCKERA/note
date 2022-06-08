package com.example.note.index.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.note.index.entity.IndexNotePo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 王哲
 */
@Mapper
public interface IndexMapper extends BaseMapper<IndexNotePo> {

   List<IndexNotePo> findIndexNoteList();

}
