package duj.utils.factory;

import java.text.SimpleDateFormat;

public class SimpleDateFormatFactory {

	public SimpleDateFormatFactory() {

	}
	
	//静态工厂方法拿到simpleDateFormat对象
	public static SimpleDateFormat getSimpleDateFormat(){
		return new SimpleDateFormat();
	}
	
}
