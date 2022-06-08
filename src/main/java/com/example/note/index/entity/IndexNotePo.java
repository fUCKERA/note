package com.example.note.index.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/6/5 14:26
 */
@Data
@TableName("index_note")
public class IndexNotePo implements Serializable {

    @TableId
    private String id;


    private String content;
}