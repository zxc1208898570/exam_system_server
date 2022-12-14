package com.ly.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {
    //id
    @TableId(type = IdType.AUTO)
    private Integer studentId;
    //姓名
    private String studentName;
    //年级
    private String grade;
    //专业
    private String major;
    //班级
    private String clazz;
    //学院
    private String institute;
    //电话
    private String tel;
    //邮箱
    private String email;
    //密码
    private String pwd;
    //身份证号
    private String cardId;
    //性别
    private String sex;
    //角色
    private String role;
}
