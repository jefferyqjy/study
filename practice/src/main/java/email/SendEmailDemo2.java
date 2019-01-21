package email;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

/**
 * 
 * @description java发送邮件实例代码
 * @author jefferyqjy
 *
 */
public class SendEmailDemo2 {
	
	public static void main(String[] args) throws MessagingException, FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.put("mail.host", "smtp.exmail.qq.com"); // 主机名
		prop.put("mail.transport.protocol", "smtp"); // 连接协议
		prop.put("mail.transport.port", 465); // 端口号
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.ssl.enable", "true"); // 设置是否使用ssl安全连接 --- 一般都使用
		prop.put("mail.debug", "true"); // 设置是否显示debug信息 true 会在控制台显示相关信息
		
		// 1. 创建session
		//Authenticator authenticator = new MailAuthenticator("4355472925@qq.com", "xxx");
		Session session = Session.getInstance(prop);
		// 开启session的debug模式，这样就可以查看到程序发送Email的运行状态
		session.setDebug(true);
		// 2. 通过session得到transport对象
		Transport ts = session.getTransport();
		// 3. 连上邮件服务器，需要发件人提供邮箱的用户名和密码进行验证
		// ps：以qq为例，这里的密码不是qq邮箱的登录密码，而是在qq邮箱的设置-账户-账户安全-开启服务-POP3/SMTP服务，按照步骤开启服务后qq提供的验证码，此码一个账户可以获取多个。
		ts.connect("435542925@qq.com", "xxx");
		// 4. 创建邮件
		//Message message = createAttachMail(session);
		Message message = createMixedMail(session);
		// 5. 发送邮件
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
	}
	
	/**
	 * 
	 * 创建带附件的邮件
	 * @param session
	 * @return
	 * @throws AddressException
	 * @throws MessagingException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings({ "unused" })
	private static Message createAttachMail(Session session) throws AddressException, MessagingException, FileNotFoundException, IOException {
		MimeMessage message = new MimeMessage(session);
		
		// 设置邮件的基本信息
		// 发件人
		message.setFrom(new InternetAddress("435542925@qq.com"));
		// 收件人
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("435542925@qq.com"));
		// 邮件标题
		message.setSubject("Java邮件发送测试");
		
		// 创建邮件正文，为了避免邮件正文中文乱码的问题，需要使用charset=UTF-8指明字符编码
		MimeBodyPart text = new MimeBodyPart();
		text.setContent("使用JavaMail创建的带附件的邮件", "text/html;charset=UTF-8");
		
		// 创建邮件附件
		MimeBodyPart attach = new MimeBodyPart();
		DataHandler df = new DataHandler(new FileDataSource("D:\\demo.png"));
		attach.setDataHandler(df);
		attach.setFileName(df.getName());
		
		// 创建容器描述数据关系
		MimeMultipart mp = new MimeMultipart();
		mp.addBodyPart(text);
		mp.addBodyPart(attach);
		mp.setSubType("mixed");
		
		message.setContent(mp);
		message.saveChanges();
		// 将创建的Email写入到E盘存储
		message.writeTo(new FileOutputStream("D:\\attachMail.eml"));
		// 返回生成的邮件
		return message;
	}
	
	/**
	 * 生成一封带附件和带图片的邮件
	 * @param session
	 * @return
	 * @throws MessagingException 
	 * @throws AddressException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static MimeMessage createMixedMail(Session session) throws AddressException, MessagingException, FileNotFoundException, IOException {
		// 创建邮件
		MimeMessage message = new MimeMessage(session);
		
		// 设置邮件的基本信息
		message.setFrom(new InternetAddress("435542925@qq.com"));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("435542925@qq.com"));
		message.setSubject("电子发票邮件");
		
		// 正文
		MimeBodyPart text = new MimeBodyPart();
		//String location = "classpath:template/einvoice.vm";
		//String html = VelocityUtils.getMessage(null, location);
		String html = "";
		System.out.println(html);
		text.setContent(html, "text/html;charset=UTF-8");
		
		// 图片
		MimeBodyPart image = new MimeBodyPart();
		DataHandler dfimage = new DataHandler(new FileDataSource("D:\\测试.pdf"));
		image.setDataHandler(dfimage);
		image.setFileName(MimeUtility.encodeText(dfimage.getName()));
		
		// 描述关系：正文和图片
		MimeMultipart mp1 = new MimeMultipart();
		mp1.addBodyPart(text);
		mp1.addBodyPart(image);
		mp1.setSubType("mixed");
		
		message.setContent(mp1);
		message.saveChanges();
	
		message.writeTo(new FileOutputStream("D:\\MixedMail.eml"));
		// 返回创建好的邮件
		return message;
	}

}
