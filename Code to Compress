package BreadcrumbsCompress_Decompress ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Compressor {
	
	public static void method(File file)throws IOException{
		
		String fileDirectory = file.getParent();
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(fileDirectory+"/commpressedFile.gz");
		GZIPOutputStream gzip = new GZIPOutputStream(fos);
		
		byte[] buffer = new byte[1024];
		int length;
		
		while((length =fis.read(buffer)) != -1){
			gzip.write(buffer,0 ,length);
		}
		
		gzip.close();
		fis.close();
		fos.close();
	}

	
	// Main method
	public static void Main( String[] args) throws IOException {
		
		File path = new File("");
		method(path);
	}
}
