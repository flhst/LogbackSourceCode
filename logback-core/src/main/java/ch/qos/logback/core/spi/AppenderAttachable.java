/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.core.spi;

import java.util.Iterator;

import ch.qos.logback.core.Appender;

/**
 * Interface for attaching appenders to objects.
 * 
 * @author Ceki G&uuml;lc&uuml;
 */
// 用于将appenders附加到对象的接口。
public interface AppenderAttachable<E> {
    /**
     * Add an appender.
     */
    // 添加一个Appender
    void addAppender(Appender<E> newAppender);

    /**
     * Get an iterator for appenders contained in the parent object.
     */
    // 获取Appender的迭代器
    Iterator<Appender<E>> iteratorForAppenders();

    /**
     * Get an appender by name.
     */
    // 根据name获取Appender
    Appender<E> getAppender(String name);

    /**
     * Returns <code>true</code> if the specified appender is in list of
     * attached attached, <code>false</code> otherwise.
     */
    // Appender是否在当前对象中存在
    boolean isAttached(Appender<E> appender);

    /**
     * Detach and processPriorToRemoval all previously added appenders.
     */
    // 分离和processPriorToRemoval所有以前添加的追加程序。
    void detachAndStopAllAppenders();

    /**
     * Detach the appender passed as parameter from the list of appenders.
     */
    // 分离指定的Appender
    boolean detachAppender(Appender<E> appender);

    /**
     * Detach the appender with the name passed as parameter from the list of
     * appenders.
     */
    // 按name分离某个Appender
    boolean detachAppender(String name);
}
