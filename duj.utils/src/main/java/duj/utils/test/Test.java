package duj.utils.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import duj.utils.dateutil.DateToString;
import duj.utils.ioc.GetObjectUtil;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		SimpleDateFormat simpleDateFormat = (SimpleDateFormat) GetObjectUtil.getBeanByName("simpleDateFormatFactory");
//		System.out.println(simpleDateFormat);
//		SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) GetObjectUtil.getBeanByName("simpleDateFormatFactory");
//		System.out.println(simpleDateFormat2);
		
		System.out.println(DateToString.getcurrentStringTime());
		System.out.println(DateToString.getCustomcurrentStringTime("yy"));
	}

}
