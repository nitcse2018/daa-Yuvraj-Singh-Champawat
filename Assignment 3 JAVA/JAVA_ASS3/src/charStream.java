import java.io.*;

public class charStream {
	
	public static void main(String[] args) throws IOException{
		
		File infile = new File("C:\\Users\\HP\\Desktop\\4sem\\java\\charStreamInput.txt");
		File outfile = new File("C:\\Users\\HP\\Desktop\\4sem\\java\\charStreamOutput.txt");
		
		FileReader inputstream = null;
		FileWriter outputstream = null;
		
		
		try {
			inputstream = new FileReader(infile);
			outputstream = new FileWriter(outfile);
			
			int c;
			while((c = inputstream.read()) != -1){
				outputstream.write(c);					//outputstream.write((char) c);
			}
		}
		finally {
			if (inputstream != null) 
            {
                inputstream.close();
            }
            if (outputstream != null)
            {
                outputstream.close();
            }
		}
		
	}

}
