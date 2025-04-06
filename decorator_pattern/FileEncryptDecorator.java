
public class FileEncryptDecorator implements IFile{
    private IFile file;
    
    public FileEncryptDecorator(IFile file) {
    	this.file = file;
    }
    
	@Override
	public void write(String data) {
	   StringBuilder sb = new StringBuilder();
	   String encryptData = sb.append(data).reverse().toString();
	   this.file.write(encryptData);
	}

}
