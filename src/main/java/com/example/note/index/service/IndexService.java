package com.example.note.index.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.note.index.entity.IndexNotePo;

import java.util.List;

public interface IndexService extends IService<IndexNotePo> {

    List<IndexNotePo> findIndexNoteList();
}
