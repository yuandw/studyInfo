package studyInfo.pack_one;

	//AppletViewer使用方法介绍
	import java.applet.*;

	import java.awt.*;

	@SuppressWarnings("serial")
	public class AppletViewer extends Applet{

	 public void paint(Graphics g)
	 {
	  g.drawString("Hello 哈哈小哥",10,10);
	 }
	
	 
	 /**
	运行javac AppletViewer.java进行编译
	运行appletviewer AppletViewer.java命令，大家注意后面的参数是.java文件而不是类名。
        然后就可以但到结果了
        也可以右键run as -->java Applet
	 * **/

}
