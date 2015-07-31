package ru.yandex.qatools.allure.logging;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;
import org.apache.commons.codec.CharEncoding;

/**
 * @author eroshenkoam@yandex-team.ru
 */
@BaseName("messages")
@LocaleData(value = {@Locale("en"), @Locale("ru")}, defaultCharset = CharEncoding.UTF_8)
public enum Messages {

    //Common commands
    COMMAND_ALLURE_COMMAND_ABORTED,

    //Bundle command
    COMMAND_BUNDLE_LIST_BUNDLES_MISSING,
    COMMAND_BUNDLE_LIST_BUNDLE_VERSION_PRINT,

    COMMAND_BUNDLE_REMOVE_BUNDLE_ABSENT,
    COMMAND_BUNDLE_REMOVE_BUNDLE_REMOVING,
    COMMAND_BUNDLE_REMOVE_BUNDLE_REMOVED,

    COMMAND_BUNDLE_SWITCH_BUNDLE_VERSION_MISSING,
    COMMAND_BUNDLE_SWITCH_BUNDLE_VERSION_SWITCHED,

    COMMAND_REPORT_UPGRADE_BUNDLE_DOWNLOADING,

    //Report command
    COMMAND_REPORT_CLEAN_REPORT_CLEANED,
    COMMAND_REPORT_CLEAN_ITEM_DELETED,

    COMMAND_REPORT_GENERATE_CURRENT_VERSION_MISSING,
    COMMAND_REPORT_GENERATE_REPORT_GENERATED,
    COMMAND_REPORT_GENERATE_RESULTS_MISSING,

    COMMAND_REPORT_OPEN_REPORT_MISSING,
    COMMAND_REPORT_OPEN_SERVER_STARTING,
    COMMAND_REPORT_OPEN_SERVER_STARTED,

    COMMAND_REPORT_CANT_OPEN_BROWSER,

    //Version command
    COMMAND_VERSION_INFO
}