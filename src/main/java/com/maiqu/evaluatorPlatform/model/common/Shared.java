package com.maiqu.evaluatorPlatform.model.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

/**
 * @author ht
 */
@Data
public class Shared {

    @TableId(type = IdType.AUTO)
    protected long id;

    @TableLogic
    protected int isDelete;

    @JsonFormat(pattern="yyyy年MM月dd")
    protected Date createTime;

    @JsonFormat(pattern="yyyy年MM月dd日")
    protected Date updateTime;

}
