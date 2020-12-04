package com.design.patterns.command.command;

import com.design.patterns.command.util.CommandLogUtil;
import com.design.patterns.command.receiver.Receiver;

/**
 * <p>
 *     具体指令：新增
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
public class InsertCommand extends AbstractCommand {

    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.insert();
        CommandLogUtil.addLog("执行了新增操作。");
    }
}
