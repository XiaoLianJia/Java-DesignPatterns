package com.design.patterns.command.invoker;

import com.design.patterns.command.command.AbstractCommand;
import com.design.patterns.command.util.CommandLogUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

/**
 * <p>
 *     命令调用者
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Invoker {

    private CommandQueue commandQueue;

    public void call() {
        commandQueue.execute();
    }

    public void call(@NotNull AbstractCommand command) {
        command.execute();
    }

    public void unDo() {
        CommandLogUtil.getPreviousLog();
    }

    public void reDo() {
        CommandLogUtil.getNextLog();
    }
}
