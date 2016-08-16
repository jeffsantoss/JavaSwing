import java.io.File;
import java.io.FileFilter;

import javax.swing.JOptionPane;
public class ListFilesTest {
	public static void main(String[] args) {
		dumpFiles(getAllFiles("c:/", null));
		//dumpFiles(getAllFiles("c:/", ".txt"));
		//dumpFiles(getAllFiles("c:/temp", ".tar.gz"));
	}
	private static void dumpFiles(File[] files) {
		for (File file : files) {
			JOptionPane.showMessageDialog(null,file);
		}
	}
	private static File[] getAllFiles(String path, final String extension) {
		File dir = new File(path);
		// filtro pela extensão procurada
		FileFilter filter = null;
		if (extension != null) {
			filter = new FileFilter() {
				public boolean accept(File pathname) {
					return pathname.getAbsolutePath().endsWith(extension);
				}
			};
		}
		// lista os arquivos que correspondem ao match
		return dir.listFiles(filter);
	}
}