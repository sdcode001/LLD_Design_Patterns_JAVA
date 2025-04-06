
public class File implements IFile{
    private String filePath;
    
    public File(String filePath) {
    	this.filePath = filePath;
    }
    
	@Override
	public void write(String data) {
		System.out.println("Data: "+data+" write to file: "+this.filePath);
		// code to write data to file
	}

}
