package DefaultPackage;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Comparator {

	void startCompare(String file1, String file2, String report) throws Exception {
		System.out.println("Comparison started");
		//FileWriter writer = null;
		ExcelReaderWriter readerWriter = new ExcelReaderWriter();
		ArrayList<String> list1 = null;
		ArrayList<String> list2 = null;
		ArrayList<String> reportList = null;
		try {

			list1 = readerWriter.readExel(file1);
			list2 = readerWriter.readExel(file2);
			reportList = new ArrayList<String>();

			int maxCount = list1.size() > list2.size() ? list1.size() : list2.size();

			for (int i = 0; i < maxCount; i++) {
				String url1 = list1.get(i);
				String url2 = list2.get(i);

				if (url1 == null) {

					reportList.add("NO URL found in file" + file1);
				}

				if (url2 == null) {

					reportList.add("NO URL found in file" + file2);
				}

				if (url1 != null && url2 != null) {

					boolean isEqual = isResponseEqual(url1, url2);

					 if (isEqual) {

						reportList.add("The URL :" + url1 + " of file " + file1 + " and URL: " + url2 + " of file "
								+ file2 + " are Equal ");

					} else {

						reportList.add("The URL :" + url1 + " of file " + file1 + " and URL: " + url2 + " of file "
								+ file2 + " are NOT Equal ");
					}

				}

			}

		} catch (FileNotFoundException e) {
			System.err.print("File not found on disk" + e.getMessage());
		} 

		readerWriter.writeToExcel(report, reportList);
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
			System.out.println(e.getMessage());
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
			System.out.println(e.getMessage());
		} finally {
			if (response != null) {
				response.close();

			}
		}
		return null;
	}
}
