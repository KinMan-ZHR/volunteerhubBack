package com.scuse.volunteerhub.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author DL
 * @since 2024-03-12 03:12:46
 */
@Getter
@Setter
@TableName("m_videomap")
public class Videomap implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long seqId;

    private Long userid;

    private String title;

    private String cover;

    private String path;

    private String link;

    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
}
