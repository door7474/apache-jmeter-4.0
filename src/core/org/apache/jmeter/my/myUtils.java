package org.apache.jmeter.my;

import org.apache.jmeter.util.JMeterUtils;
import java.util.regex.Pattern;

public class myUtils {
    public static long getGranularity(long granularity) {
        String my_report_granularity = JMeterUtils.getProperty("my_report_granularity");
        System.out.println("hello");
        //为空返回默认时间粒度
        if (my_report_granularity == null) {
            System.out.println("hello1");
            return granularity;
        }
        //非正整数回默认时间粒度
        if (! isNumeric(my_report_granularity)){
            System.out.println("hello2");
            return granularity;
        }
        System.out.println("hello3");
        //返回设置的时间粒度
        return Long.valueOf(my_report_granularity);
    }

    //判断是否为正整数
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[1-9][0-9]*");
        return pattern.matcher(str).matches();
    }
}
