package duj.utils.dateutil;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import duj.utils.ioc.GetObjectUtil;

/**
 * ����ת�ַ���������
 * @author duj
 */
public class DateToString {
	private static ApplicationContext applicationContext;
	private static SimpleDateFormat simpleDateFormat;

	//��̬������Զ�ִ�л�ȡsimpleDateFormat����
	static{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		simpleDateFormat = (SimpleDateFormat) GetObjectUtil.getBeanByName("simpleDateFormatFactory");
	}

	//�õ���ǰ�ַ���ʱ��
	public static String getcurrentStringTime() {
		Date now = new Date();
		String nowTime = simpleDateFormat.format(now);
		return nowTime;
	}

	//�Զ����ʽ�õ���ǰ�ַ���ʱ��
	public static String getCustomcurrentStringTime(String pattern) {
		if(pattern==null){
			return null;
		}
		Date now = new Date();
		simpleDateFormat.applyPattern(pattern);
		String nowTime = simpleDateFormat.format(now);
		return nowTime;
	}

	//�õ�����֮���ʱ����������
	public static long compareTo(Date beforeDate, Date afterDate) {
		long beforeTime = (beforeDate == null ? 0 : beforeDate.getTime());
		long afterTime = (afterDate == null ? 0 : afterDate.getTime());
		return (beforeTime - afterTime);
	}



}
