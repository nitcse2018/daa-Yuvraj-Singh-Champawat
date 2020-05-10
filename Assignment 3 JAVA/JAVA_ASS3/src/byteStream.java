import java.io.*;

public class byteStream {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("C:\\Users\\HP\\Desktop\\4sem\\java\\byteStreamInput.txt");
			outputStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\4sem\\java\\byteStreamOutput.txt");
			
			int ch;
			while((ch = inputStream.read()) != -1) {
				outputStream.write(ch);
			}
		}
		finally {
			if (inputStream != null) 
            {
                inputStream.close();
            }
            if (outputStream != null)
            {
                outputStream.close(); 
            }
		}
		
		
		
		
	}

}
