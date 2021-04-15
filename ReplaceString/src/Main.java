import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		String alarmReport = "This is an automatic email notification -"
				+ " please do not reply to this message. \r\n \r\n "
				+ "H-SAF Monitoring tool has found the following anomaly for the product %productId%:"
				+ "\r\n \r\n %message%";

		String newStr = alarmReport.replaceAll("%productId%", "pippo");
		newStr = newStr.replaceAll("%message%", "pluto");

		System.out.println(newStr);
		
	

		// process files in the product folder
		final File folder = new File("/ext_storage/HSAF_FTP_ORDERS");
			
		if (folder.isDirectory()) {
		System.out.println("SIZE: " + FileUtils.sizeOfDirectory(folder));
		}
		
	}

}
