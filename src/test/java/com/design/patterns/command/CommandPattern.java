package com.design.patterns.command;

import com.design.patterns.command.command.DeleteCommand;
import com.design.patterns.command.command.InsertCommand;
import com.design.patterns.command.command.QueryCommand;
import com.design.patterns.command.command.UpdateCommand;
import com.design.patterns.command.invoker.CommandQueue;
import com.design.patterns.command.invoker.Invoker;
import com.design.patterns.command.util.CommandLogUtil;

/**
 * <p>
 *     命令模式示例
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
public class CommandPattern {

    public static void main(String[] args) {
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(new InsertCommand());
        commandQueue.addCommand(new UpdateCommand());
        commandQueue.addCommand(new QueryCommand());
        commandQueue.addCommand(new DeleteCommand());

        Invoker invoker = new Invoker(commandQueue);
        invoker.call();
        invoker.call(new QueryCommand());
        System.out.println("##########");
        CommandLogUtil.showLogs();
        System.out.println("##########");
        invoker.unDo();
        invoker.unDo();
        invoker.unDo();
        invoker.unDo();
        invoker.unDo();
        System.out.println("##########");
        invoker.reDo();
        invoker.reDo();
        invoker.reDo();
        invoker.reDo();
        invoker.reDo();
        System.out.println("##########");
    }
}
