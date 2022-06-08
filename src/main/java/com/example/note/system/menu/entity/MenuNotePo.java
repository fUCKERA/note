package com.example.note.system.menu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/6/8 19:09
 */
@Data
@TableName("menu_note")
public class MenuNotePo implements Serializable {

    @TableId
    private String id;

    private String menuName;

    private String menuUrl;

    private String menuStyle;

    private Integer isLastLevel;

    private Integer sort;
}