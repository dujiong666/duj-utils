package duj.utils.dateutil;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import duj.utils.ioc.GetObjectUtil;

/**
 * 日期转字符串工具类
 * @author duj
 */
public class DateToString {
	private static ApplicationContext applicationContext;
	private static SimpleDateFormat simpleDateFormat;

	//静态块代码自动执行获取simpleDateFormat对象
	static{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		simpleDateFormat = (SimpleDateFormat) GetObjectUtil.getBeanByName("simpleDateFormatFactory");
	}

	//得到当前字符串时间
	public static String getcurrentStringTime() {
		Date now = new Date();
		String nowTime = simpleDateFormat.format(now);
		return nowTime;
	}

	//自定义格式得到当前字符串时间
	public static String getCustomcurrentStringTime(String pattern) {
		if(pattern==null){
			return null;
		}
		Date now = new Date();
		simpleDateFormat.applyPattern(pattern);
		String nowTime = simpleDateFormat.format(now);
		return nowTime;
	}

	//得到两者之间的时间差（毫秒数）
	public static long compareTo(Date beforeDate, Date afterDate) {
		long beforeTime = (beforeDate == null ? 0 : beforeDate.getTime());
		long afterTime = (afterDate == null ? 0 : afterDate.getTime());
		return (beforeTime - afterTime);
	}



}
