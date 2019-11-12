package lecteurFichier;

import java.io.File;

public interface FileReaderImpl {
	abstract public void readFile(File file);
	abstract public void readFileLinesReverse(File file);
	abstract public void readFileWordsReverse(File file);
	abstract public void diff(File file1, File file2);
}
