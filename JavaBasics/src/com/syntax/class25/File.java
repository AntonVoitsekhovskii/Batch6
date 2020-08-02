package com.syntax.class25;

public abstract class File {

	
	public void Edit() {
		System.out.println("FIle has been edit");
	}
	
	public void Close() {
		System.out.println("File has been closed");
	}
	
	public abstract void Open();
}

class JavaFile extends File {
	
	public void Open() {
		
		System.out.println("to open .java file we need notepad++ or sublime text");
	}
}

class WordFile extends File {
	public void Open() {
		System.out.println("to open .doc file we need Microsoft Word to be installed");
	}
}

class PDFFile extends File {
	public void Open() {
		System.out.println("to open .pdf file we need Adobe to be installed");
	}
}
