package net.ivoa.pdr.commons;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Carlo Maria Zwolf
 * Observatoire de Paris
 * LERMA
 */

public class DateFinder {
	private static final DateFinder instance = new DateFinder();

	public static DateFinder getInstance() {
		return instance;
	}

	private DateFinder() {
	}
	
	public String getCurrentDate(){
		Date dateCourante = new Date();
		DateFormat formatJJMMAAAA = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return formatJJMMAAAA.format(dateCourante);
	}
	
	
	public String getDateOfNDaysAgo(Integer N){
		Calendar cal = Calendar.getInstance();
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   cal.add(Calendar.DATE, -N);
		  return dateFormat.format(cal.getTime());
	}
}
