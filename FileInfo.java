import java.util.*;
import java.io.*;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f = new File(sc.nextLine());

        System.out.println("Readable: " + f.canRead());
        System.out.println("Writable: " + f.canWrite());
        System.out.println("File type: " + (f.isDirectory() ? "Directory" : "File"));
        System.out.println("File length: " + f.length() + " bytes");
    }
}