package com.yxm.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 */
public class Utils {
    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");

    /**
     * 加密字符串
     */
    public static String sha1(String str) {
        return DigestUtils.sha1Hex(str);
    }

    /**
     * 日期格式化
     *
     * @param str 要格式的日期字符串
     * @return 格式化后的字符串
     * @throws ParseException 格式化错误
     */
    public static Date parseDate(String str) throws ParseException {
        return dateFormat.parse(str);
    }

    /**
     * 获取文件后缀名
     * @param str
     * @return
     */
    public static String getFileType(String str) {
        return str.substring(str.lastIndexOf("."));
    }

    /**
     * String转换成Integer
      * @param str
     * @return
     */
    public static Integer parseInt(String str) {
        Integer i;
        if (str == null) {
            return 0;
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
        return i;
    }
}
