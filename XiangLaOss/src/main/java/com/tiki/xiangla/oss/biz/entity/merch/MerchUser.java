package com.tiki.xiangla.oss.biz.entity.merch;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-29
 * Time: 17:58
 */
@TableName(value = "merchuser")
@Data
public class MerchUser extends Model<MerchUser> {
    @TableId(value = "merchuserid", type = IdType.INPUT)
    private int merchuserid;

    private String account;

    private String password;

    private String username;

    private String email;

    private String mobile;

    @Override
    protected Serializable pkVal() {
        return this.merchuserid;
    }
}
