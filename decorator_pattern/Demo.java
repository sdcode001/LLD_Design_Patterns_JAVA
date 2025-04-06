
public class Demo {
	public static void main(String[] args) {
         String data = "Hi Souvik 001";
         File file = new File("C://downloads/data");
         file.write(data);
         
         //use decorator to encrypt data
         FileEncryptDecorator encryptFile = new FileEncryptDecorator(file);
         encryptFile.write(data);
	}
}
