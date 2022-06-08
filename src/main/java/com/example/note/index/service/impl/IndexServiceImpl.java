package com.example.note.index.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.note.index.dao.IndexMapper;
import com.example.note.index.entity.IndexNotePo;
import com.example.note.index.service.IndexService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/6/5 14:33
 */
@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, IndexNotePo> implements IndexService {


    @Override
    public List<IndexNotePo> findIndexNoteList(){
        QueryWrapper<IndexNotePo> queryWrapper = new QueryWrapper();
        List<IndexNotePo> list = this.baseMapper.selectList(queryWrapper);
        return list;
    }

}