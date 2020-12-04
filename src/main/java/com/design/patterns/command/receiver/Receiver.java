package com.design.patterns.command.receiver;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *     命令接收者
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
public class Receiver {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void insert() {
        System.out.println(String.format("%s：执行了新增操作。", simpleDateFormat.format(new Date())));
    }

    public void delete() {
        System.out.println(String.format("%s：执行了删除操作。", simpleDateFormat.format(new Date())));
    }

    public void update() {
        System.out.println(String.format("%s：执行了更新操作。", simpleDateFormat.format(new Date())));
    }

    public void query() {
        System.out.println(String.format("%s：执行了查询操作。", simpleDateFormat.format(new Date())));
    }
}
