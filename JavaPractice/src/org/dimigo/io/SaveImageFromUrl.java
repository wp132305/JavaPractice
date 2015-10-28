package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		String imageUrl = "http://file2.instiz.net/data/cached_img/upload/2015/09/26/10/271c195aa7a689679a9779c8402aa2c5.jpg";

		try {
			URL url = new URL(imageUrl);
			
			try (InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/image.jpg");){
				
				byte[] buf = new byte[100];
				int result;
				
				while ((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
