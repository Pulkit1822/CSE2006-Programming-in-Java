import java.io.File;
import java.io.FilenameFilter;

public class FileExtensionFilter {
    public static void main(String[] args) {
        String folderPath = "/path/to/your/folder";
        String fileExtension = ".txt"; 
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            FilenameFilter filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(fileExtension);
                }
            };
            String[] matchingFiles = folder.list(filter);

            if (matchingFiles != null && matchingFiles.length > 0) {
                System.out.println("Matching files with extension " + fileExtension + ":");
                for (String fileName : matchingFiles) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("No files with extension " + fileExtension + " found in the specified folder.");
            }
        } else {
            System.out.println("The specified folder does not exist or is not a directory.");
        }
    }
}
