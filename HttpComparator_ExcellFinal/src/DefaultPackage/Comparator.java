package DefaultPackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Comparator {

	void startCompare(String file1, String file2, String report) throws Exception {
  //System.out.println("started");
		try {

			ExcelReaderWriter readerWriter = new ExcelReaderWriter();
			ArrayList<String> list1 = readerWriter.ReadExel(file1);
			ArrayList<String> list2 = readerWriter.ReadExel(file2);

			FileWriter writer = null;
			writer = new FileWriter(report);
 
			int maxCount = list1.size() > list2.size() ? list1.size() : list2.size();

			for (int i = 0; i < maxCount; i++)
			{
				String url1 = list1.get(i);
				String url2 = list2.get(i);

				if (url1 == null) {
					writer.write("NO URL found in file" + file1 + "\n");
				}

				if (url2 == null) {
					writer.write("NO URL found in file" + file2 + "\n");
				}

				if (url1 != null && url2 != null) {

					boolean isEqual = isResponseEqual(url1, url2);

					if (isEqual) {

						writer.write("The URL :" + url1 + " of file " + file1 + " and URL: " + url2 + " of file "
								+ file2 + " are Equal ");
					} else {
						writer.write("The URL :" + url1 + " of file " + file1 + " and URL: " + url2 + " of file "
								+ file2 + " are NOT Equal ");
					}
					writer.write("\n");
				}

			}

			//
			// Scanner scanFile1 = new Scanner(new FileInputStream(file1));
			// Scanner scanFile2 = new Scanner(new FileInputStream(file2));
			// FileWriter writer = null;
			// writer = new FileWriter(report);
			//
			// String url1 = getNextLine(scanFile1);
			// String url2 = getNextLine(scanFile2);
			//
			// writer = new FileWriter(report);
			//
			// while (url1 != null || url2 != null) {
			// try {
			//
			// System.out.println(url1);
			// System.out.println(url2);
			//
			// if (url1 == null) {
			// writer.write("NO URL found in file" + file1 + "\n");
			// }
			//
			// if (url2 == null) {
			// writer.write("NO URL found in file" + file2 + "\n");
			// }
			//
			// if (url1 != null && url2 != null) {
			// boolean isEqual = isResponseEqual(url1, url2);
			//
			// if (isEqual) {
			//
			// writer.write("The URL :" + url1 + " of file " + file1 + " and URL: " + url2 +
			// " of file "
			// + file2 + " are Equal ");
			// } else {
			// writer.write("The URL :" + url1 + " of file " + file1 + " and URL: " + url2 +
			// " of file "
			// + file2 + " are NOT Equal ");
			// }
			// writer.write("\n");
			//
			// }
			// } catch (IOException e) {
			// System.err.println("Error while writing report" + e.getMessage());
			// }
			//
			// url1 = getNextLine(scanFile1);
			// url2 = getNextLine(scanFile2);
			//
			// }
			 writer.flush();
			 writer.close();

		} catch (FileNotFoundException e) {
			System.err.print("File not found on disk" + e.getMessage());
		} finally {

		}
	}

	String getNextLine(Scanner scan) {
		if (scan.hasNextLine()) {
			return scan.nextLine().trim();
		} else {
			return null;
		}
	}

	boolean isResponseEqual(String firstURL, String secondURL) {
		try {
			String firstURLRes = readHTTPResponse(firstURL);
			String secondURLRes = readHTTPResponse(secondURL);

			if (firstURLRes != null && secondURLRes != null) {

				if (firstURLRes.length() == secondURLRes.length()) {
					if (firstURLRes.equals(secondURLRes)) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			}  

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	String readHTTPResponse(String URL) throws IOException {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(URL);
		CloseableHttpResponse response = null;
		try {
			response = httpclient.execute(httpget);

			HttpEntity entity = response.getEntity();

			return EntityUtils.toString(entity);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (response != null) {
				response.close();

			}
		}
		return null;
	}
}
