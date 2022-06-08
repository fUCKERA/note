package com.example.note.system.menu.view;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangzhe
 * @version 1.0
 * @date 2021/6/8 19:32
 */
@Data
public class MenuNoteVo implements Serializable {

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "菜单名称")
    private String menuName;

    @ApiModelProperty(value = "菜单url")
    private String menuUrl;

    @ApiModelProperty(value = "菜单样式")
    private String menuStyle;

    @ApiModelProperty(value = "菜单calss")
    private String menuClass;

    @ApiModelProperty(value = "是否末级菜单: 1是 0否")
    private Integer isLastLevel;

    @ApiModelProperty(value = "排序")
    private Integer sort;
}