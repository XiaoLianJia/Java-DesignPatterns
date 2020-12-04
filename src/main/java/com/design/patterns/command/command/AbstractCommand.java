package com.design.patterns.command.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 *     抽象命令类
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
@Getter
@NoArgsConstructor
@Setter
public abstract class AbstractCommand {

    /**
     * 执行
     */
    public abstract void execute();
}
