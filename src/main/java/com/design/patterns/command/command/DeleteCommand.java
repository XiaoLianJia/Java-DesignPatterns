package com.design.patterns.command.command;

import com.design.patterns.command.util.CommandLogUtil;
import com.design.patterns.command.receiver.Receiver;

/**
 * <p>
 *     具体指令：删除
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
public class DeleteCommand extends AbstractCommand {

    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.delete();
        CommandLogUtil.addLog("执行了删除操作。");
    }
}
