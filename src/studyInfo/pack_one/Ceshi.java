package studyInfo.pack_one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ceshi {
	public static void main(String[] args) {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	Calendar c = Calendar.getInstance();
//     
//     //过去二个月
//     c.setTime(new Date());
//     c.add(Calendar.MONTH, -2);
//     Date m3 = c.getTime();
//     String mon3 = format.format(m3);
//     Date mon4=null;
//     try {
//		 mon4 = format.parse(format.format(m3));
//	} catch (ParseException e) {
//		e.printStackTrace();
//	}
//     System.out.println("过去二个月："+mon4);
		try {
			// #人传人活动开始时间start_time,结束时间end_time，过期时间expire_time
			// RCRDate=[{"start_time":"2019-01-09
			// 00:00:00","end_time":"2019-03-31
			// 24:00:00","expire_time":"2019-04-30 24:00:00"}]
			String start_time = "2019-01-02 00:00:00";
			String end_time = "2019-01-06 24:00:00";
			String expire_time = "2019-01-06 24:00:00";
			Date sd1 = format.parse(start_time);
			Date sd2 = format.parse(end_time);
			Date sd3 = format.parse(expire_time);
			Date d4 = new Date();
			if (d4.before(sd2) && d4.after(sd1)) {
				System.out.println("活动内");
			}
			if (d4.before(sd3) && d4.after(sd2)) {
				System.out.println("活动外，有效期内");
			}
			if (d4.before(sd1)) {
				System.out.println("活动开始前");
			}
			if (d4.after(sd3)) {
				System.out.println("活动有效期后");
			}

		} catch (ParseException e) {

		}
 
		
		
		
		
		
		
		
		
}
}
