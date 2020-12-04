package com.design.patterns.command.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 *     命令日志工具
 * </p>
 * @author zhangbin
 * @date 2020-12-04
 */
public class CommandLogUtil {

    private static Map<Integer, String> logs = new LinkedHashMap<>();

    private static int stepNumber = 0;

    private static int stepIndex = 0;

    public static void addLog(String log) {
        stepNumber++;
        System.out.println("新增一条执行记录：" + log);
        logs.put(stepNumber, log);
        stepIndex = stepNumber;
    }

    public static void getPreviousLog() {
        stepIndex--;
        if (stepIndex <= 0) {
            stepIndex = 0;
            System.out.println("已经是第一条执行记录。");
        } else {
            System.out.println("上一条执行记录为：" + logs.get(stepIndex));
        }
    }

    public static void getNextLog() {
        stepIndex++;
        if (stepIndex > stepNumber) {
            stepIndex = stepNumber;
            System.out.println("已经是最后一条执行记录。");
        } else {
            System.out.println("下一条执行记录为：" + logs.get(stepIndex));
        }
    }

    public static void showLogs() {
        for (Integer i : logs.keySet()) {
            System.out.println(logs.get(i));
        }
    }
}
