package studyInfo.main;

import java.util.HashMap;
import java.util.Map;

import sun.applet.AppletViewer;

public class Main {

	public static void main(String[] args) {
		
		 /**
		  1���﷨������Ƚ���Ϥ����д�����ʱ��IDE�ı༭����ĳһ�б���Ӧ���ܹ����ݱ�����Ϣ֪����ʲô�����﷨������֪���κ�������
		  **/

		/**
		  2�����������ϤJDK����һЩ��������䳣��ѡ�����������Ҫ��Ϥ��appletviewer�� HtmlConverter��jar�� java��
		     javac��javadoc��javap��javaw��native2ascii��serialver�������Щ������û��ȫ��ʹ�ù�����ô���javaʵ���ϻ��ܲ��˽⡣
		**/     
		//javac���룬appletviewerִ�д��ڡ����磺/studyInfo/src/studyInfo/pack_one/AppletViewer.java
		//HtmlConverter����ת������ Word �ĵ� (*.DOC)��Powerpoint �ļ� (*.PPT)��Excel ������ (*.XLS) ���ڵĸ��� Office �ĵ�Ϊ HTML ��ҳ�ļ�������Ԥװ Office��
		//ֻҪ�Ѵ�ת�����ļ���ӵ��б�Ȼ��ֱ�ӵ��ת������
		//jar,�����*.jar
		//javaִ������     
		//javac�������javac A.java
		//javadocע���ĵ��������ֻ����/**  */֮��ġ� javadoc -d �ĵ����Ŀ¼ -author -version Դ�ļ���.java
		//javap
		//javap�������
		//C:\>javap -help
						//�÷�: javap <options> <classes>
						//����, ���ܵ�ѡ�����:
						// -help  --help  -?        ������÷���Ϣ
						// -version                 �汾��Ϣ
						// -v  -verbose             ���������Ϣ
						// -l                       ����кźͱ��ر�����
						// -public                  ����ʾ������ͳ�Ա
						//-protected               ��ʾ�ܱ�����/������ͳ�Ա
						//-package                 ��ʾ�����/�ܱ�����/������
						//                          �ͳ�Ա (Ĭ��)
						//-p  -private             ��ʾ������ͳ�Ա
	    				//-c                       �Դ�����з����
						//-s                       ����ڲ�����ǩ��
						// -sysinfo                 ��ʾ���ڴ�������
						//                       ϵͳ��Ϣ (·��, ��С, ����, MD5 ɢ��)
						// -constants               ��ʾ��̬���ճ���
						//-classpath <path>        ָ�������û����ļ���λ��
						// -bootclasspath <path>    �����������ļ���λ��
		  /**   
		  3�����ߣ�������������ʹ��һ��IDE�Ŀ������ߣ�����Eclipse��Netbeans��JBuilder��Jdeveloper��IDEA��JCreator����Workshop��
		         �������й��̹�������ѡ������á�����İ�װ�����Լ����е��ԡ�
		  **/
		
		
		/**
		  4��API��Java�ĺ���API�Ƿǳ��Ӵ�ģ�������һЩ���ݱ�����Ϊ�Ǳ�����Ϥ�ģ����򲻿�������������Java��������
		     	��java.lang���µ�80�����ϵ���Ĺ��ܵ�������á�
		  **/
		
		
		
		/**
		     	��java.util���µ�80�����ϵ����������ã��ر��Ǽ�������ϵ��������ʽ��zip���Լ�ʱ�䡢����������ԡ���Դ��Timer.
		**/     
		
		
		     /**	
		     	��java.io���µ�60�����ϵ����ʹ�ã����IO��ϵ�Ļ��ڹܵ�ģ�͵����˼·�Լ�����IO������Ժ�ʹ�ó��ϡ�
		      	��java.math���µ�100�������ݡ�
		      	��java.net���µ�60�����ϵ����ݣ��Ը�����Ĺ��ܱȽ���Ϥ��
		      	��java.text���µ�60�����ϵ����ݣ��ر��Ǹ��ָ�ʽ���ࡣ
		      	����������JDBC��java.security����40�����ϵ����ݣ�������ڰ�ȫû�нӴ��Ļ������Ͳ���������java.
		      	��AWT�Ļ������ݣ�������������¼��������������ֹ������������������ӡ��
		      	��Swing�Ļ������ݣ���AWT��Ҫ�����ơ�
		      	��XML������ϤSAX��DOM�Լ�JDOM����ȱ�㲢���ܹ�ʹ�����е�һ�����XML�Ľ��������ݴ���
		  5�����ԣ�������Ϥʹ��junit��д����������ɴ�����Զ����ԡ�
		  6������������Ϥʹ��ant��ɹ��̹���ĳ����������繤�̱��롢����javadoc������jar���汾���ơ��Զ����ԡ�
		  7���Ŵ�Ӧ�ÿ��Ը����쳣��Ϣ�ȽϿ��ٵĶ�λ�����ԭ��ʹ���λ�á�
		  8��˼�룺��������OOP����ҪҪ������ʹ��Java������ϵͳ������������Javaϵͳ��
		  9���淶����д�Ĵ������������еı���淶��������������ĸ��д����Ա�ͷ���������ĸСд���������ĵ�һ������һ���Ƕ��ʣ�
		  	����ȫ��Сд�ȣ���������Ŀɶ��ԲűȽϺá�
		  10����ѧ������J2EE ��Oracle ��WebLogic��Jboss��Spring��Struts��Hibernate �����м�������������ܹ����˼�롢
		  	���������Ż�������ϵͳ��ơ���վ���ؾ��⡢ϵͳ���ܵ��ŵ�ʵ�ü�����
		  **/
	//	String a= "100";
		//System.out.println(Long.valueOf(a));
	//	System.out.println(Double.valueOf(a.toString()));

		int a=12;
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("a", a);
		change(map);
		System.out.println(map.get("a"));
	}

	public static  void change(Map<String,Object> map){
		map.put("a", 18);
	}
	
}
