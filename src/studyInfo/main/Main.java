package studyInfo.main;

import java.util.HashMap;
import java.util.Map;

import sun.applet.AppletViewer;

public class Main {

	public static void main(String[] args) {
		
		 /**
		  1、语法：必须比较熟悉，在写代码的时候IDE的编辑器对某一行报错应该能够根据报错信息知道是什么样的语法错误并且知道任何修正。
		  **/

		/**
		  2、命令：必须熟悉JDK带的一些常用命令及其常用选项，命令至少需要熟悉：appletviewer、 HtmlConverter、jar、 java、
		     javac、javadoc、javap、javaw、native2ascii、serialver，如果这些命令你没有全部使用过，那么你对java实际上还很不了解。
		**/     
		//javac编译，appletviewer执行窗口。例如：/studyInfo/src/studyInfo/pack_one/AppletViewer.java
		//HtmlConverter批量转换包括 Word 文档 (*.DOC)，Powerpoint 文件 (*.PPT)，Excel 工作簿 (*.XLS) 在内的各类 Office 文档为 HTML 网页文件。无需预装 Office，
		//只要把待转换的文件添加到列表然后直接点击转换即可
		//jar,打包成*.jar
		//java执行命令     
		//javac编译命令，javac A.java
		//javadoc注释文档生成命令，只包含/**  */之间的。 javadoc -d 文档存放目录 -author -version 源文件名.java
		//javap
		//javap命令参数
		//C:\>javap -help
						//用法: javap <options> <classes>
						//其中, 可能的选项包括:
						// -help  --help  -?        输出此用法消息
						// -version                 版本信息
						// -v  -verbose             输出附加信息
						// -l                       输出行号和本地变量表
						// -public                  仅显示公共类和成员
						//-protected               显示受保护的/公共类和成员
						//-package                 显示程序包/受保护的/公共类
						//                          和成员 (默认)
						//-p  -private             显示所有类和成员
	    				//-c                       对代码进行反汇编
						//-s                       输出内部类型签名
						// -sysinfo                 显示正在处理的类的
						//                       系统信息 (路径, 大小, 日期, MD5 散列)
						// -constants               显示静态最终常量
						//-classpath <path>        指定查找用户类文件的位置
						// -bootclasspath <path>    覆盖引导类文件的位置
		  /**   
		  3、工具：必须至少熟练使用一种IDE的开发工具，例如Eclipse、Netbeans、JBuilder、Jdeveloper、IDEA、JCreator或者Workshop，
		         包括进行工程管理、常用选项的设置、插件的安装配置以及进行调试。
		  **/
		
		
		/**
		  4、API：Java的核心API是非常庞大的，但是有一些内容笔者认为是必须熟悉的，否则不可能熟练的运用Java，包括：
		     	◆java.lang包下的80％以上的类的功能的灵活运用。
		  **/
		
		
		
		/**
		     	◆java.util包下的80％以上的类的灵活运用，特别是集合类体系、正则表达式、zip、以及时间、随机数、属性、资源和Timer.
		**/     
		
		
		     /**	
		     	◆java.io包下的60％以上的类的使用，理解IO体系的基于管道模型的设计思路以及常用IO类的特性和使用场合。
		      	◆java.math包下的100％的内容。
		      	◆java.net包下的60％以上的内容，对各个类的功能比较熟悉。
		      	◆java.text包下的60％以上的内容，特别是各种格式化类。
		      	◆熟练运用JDBC、java.security包下40％以上的内容，如果对于安全没有接触的话根本就不可能掌握java.
		      	◆AWT的基本内容，包括各种组件事件、监听器、布局管理器、常用组件、打印。
		      	◆Swing的基本内容，和AWT的要求类似。
		      	◆XML处理，熟悉SAX、DOM以及JDOM的优缺点并且能够使用其中的一种完成XML的解析及内容处理。
		  5、测试：必须熟悉使用junit编写测试用例完成代码的自动测试。
		  6、管理：必须熟悉使用ant完成工程管理的常用任务，例如工程编译、生成javadoc、生成jar、版本控制、自动测试。
		  7、排错：应该可以根据异常信息比较快速的定位问题的原因和大致位置。
		  8、思想：必须掌握OOP的主要要求，这样使用Java开发的系统才能是真正的Java系统。
		  9、规范：编写的代码必须符合流行的编码规范，例如类名首字母大写，成员和方法名首字母小写，方法名的第一个单词一般是动词，
		  	包名全部小写等，这样程序的可读性才比较好。
		  10、博学：掌握J2EE 、Oracle 、WebLogic、Jboss、Spring、Struts、Hibernate 等流行技术，掌握软件架构设计思想、
		  	搜索引擎优化、缓存系统设计、网站负载均衡、系统性能调优等实用技术。
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
