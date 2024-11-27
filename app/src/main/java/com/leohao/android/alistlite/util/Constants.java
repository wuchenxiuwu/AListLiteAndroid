package com.leohao.android.alistlite.util;

import java.util.Arrays;
import java.util.List;

/**
 * @author LeoHao
 */
public class Constants {
    public static String ALIST_VERSION = "3.40.0";
    public static String ALIST_CONFIG_FILENAME = "config.json";
    public static String ALIST_STORAGE_DRIVER_MOUNT_PATH = "本地存储";
    public static String ALIST_DEFAULT_ADMIN_USERNAME = "admin";
    public static String ALIST_DEFAULT_PASSWORD = "123456";
    public static Integer RECENT_RELEASE_RECORD_SIZE = 10;
    public static String URL_RELEASE_LATEST = "https://api.github.com/repos/LeoHaoVIP/AListLiteAndroid/releases/latest";
    public static String URL_RELEASES = "https://api.github.com/repos/LeoHaoVIP/AListLiteAndroid/releases";
    public static String URL_OPEN_ISSUE = "https://github.com/LeoHaoVIP/AListLiteAndroid/issues";
    public static String URL_OPEN_DISCUSSION = "https://github.com/LeoHaoVIP/AListLiteAndroid/discussions";
    public static String URL_ABOUT_BLANK = "about:blank";
    public static String QUICK_DOWNLOAD_ADDRESS = "https://pan.leohao.cn/d/LeoHao/files/share/APP/AListLite";
    public static String ERROR_MSG_CONFIG_DATA_READ = "{\"info\":\"无法读取配置，请检查存储权限\",\"msg\":\"MSG\"}";
    public static String ERROR_MSG_CONFIG_DATA_WRITE = "配置更新失败";
    public static String ANDROID_SHARED_DATA_PREFERENCES_NAME = "USER_INFO";
    public static String ANDROID_SHARED_DATA_KEY_ALIST_INITIALIZED = "alist_initialized";
    public static String UNIVERSAL_ABI_NAME = "universal";
    public static List<String> SUPPORTED_DOWNLOAD_ABI_NAMES = Arrays.asList("x86", "armeabi-v7a", "x86_64", "arm64-v8a");
}
