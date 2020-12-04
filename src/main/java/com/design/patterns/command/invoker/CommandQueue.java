package com.design.patterns.command.invoker;

import com.design.patterns.command.command.AbstractCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     命令队列
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
public class CommandQueue {

    private List<AbstractCommand> commands = new ArrayList<>();

    public void setCommands(List<AbstractCommand> commands) {
        this.commands = commands;
    }

    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    public void execute() {
        for (AbstractCommand command : commands) {
            command.execute();
        }
    }
}
