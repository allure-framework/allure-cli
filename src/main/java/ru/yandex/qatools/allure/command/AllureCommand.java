package ru.yandex.qatools.allure.command;

import ru.yandex.qatools.allure.ExitCode;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 10.08.15
 */
public interface AllureCommand extends Runnable {

    /**
     * Returns the exit code for command. Should not be null.
     */
    ExitCode getExitCode();
}
