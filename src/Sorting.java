import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Sorting {
	public   String dir;
	File file;

	public static  JFileChooser fc = new JFileChooser();
	

	
public  void selectFile() {
    
fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

int returnVal = fc.showDialog(null,"Select a File");
	
	if(returnVal == JFileChooser.APPROVE_OPTION) {
		dir= fc.getSelectedFile().getAbsolutePath();
	       sortit(dir);
	}
	
	
}


private void moveit(Path p1,Path p2) {
	try {
		Files.move(p1, p2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public int sortit(String f) {
    String path1,path2,path3,path4,path5,path6,path7,path8,path9;
    path1=f+"\\images";
    path2=f+"\\Compressed";
    path3=f+"\\Docs";
    path4=f+"\\Programs";
    path5=f+"\\Music";
    path6=f+"\\Folders";
    path7=f+"\\Videos";
    path8=f+"\\Others";
    path9=f+"\\Shortcuts";


    
    File f1,f2,f3,f4,f5,f6,f7,f8,f9;
    f1 = new File(path1);
    f2 = new File(path2);
    f3 = new File(path3);
    f4 = new File(path4);
    f5 = new File(path6);
    f6=  new File(path5);
    f7=  new File(path7);
    f8= new File(path8);
    f9=new File(path9)
    ;


    boolean bool;
    try {
   bool=f1.mkdir();
   bool=f2.mkdir();
   bool=f3.mkdir();
   bool=f4.mkdir();
   bool=f5.mkdir();
   bool=f6.mkdir();
   bool=f7.mkdir();
   bool=f8.mkdir();
   bool=f9.mkdir();


   
    }catch(SecurityException e) {

    	
    }

    
    
	file= new File(f);
	File[] files = file.listFiles();
    for(File file : files) {
 
    	if(file.toString().equalsIgnoreCase("this pc")||
    			file.toString().equalsIgnoreCase("network")
    			||file.toString().equalsIgnoreCase("control panle")) {
    		continue;
    	}
    	
      if(file.isFile()) {
    	  String fromFile =file.getAbsolutePath();

    	         
        if(fromFile.endsWith("jpeg")||fromFile.endsWith("png")||fromFile.endsWith("jfif")||fromFile.endsWith("jpg")||fromFile.endsWith("JPG")||
        		fromFile.endsWith("PNG")||fromFile.endsWith("JPEG")) {
        	String toFile = path1+"\\"+file.getName();

            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);

        	moveit(source,target);
        }
        else if(fromFile.endsWith("rar")||fromFile.endsWith("zip")||fromFile.endsWith("iso")) {
        	String toFile = path2+"\\"+file.getName();

            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);

        	moveit(source,target);
        }
        else if(fromFile.endsWith("pdf")||fromFile.endsWith("docx")||fromFile.endsWith("ppt")||fromFile.endsWith("txt")
        		||fromFile.endsWith("csv")||fromFile.endsWith("xlsx")||fromFile.endsWith("ai")||fromFile.endsWith("doc")
        		||fromFile.endsWith("pptx")||fromFile.endsWith("html")) {
        	String toFile = path3+"\\"+file.getName();
            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);
        	moveit(source,target);
        }
        else if(fromFile.endsWith("exe")||fromFile.endsWith("url")||fromFile.endsWith("msi")||fromFile.endsWith("jar")) {
        	String toFile = path4+"\\"+file.getName();
            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);

        	moveit(source,target);
        }
        else if(fromFile.endsWith("lnk")) {
        	String toFile = path9+"\\"+file.getName();
            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);

        	moveit(source,target);
        }
        else if(fromFile.endsWith("webm")||fromFile.endsWith("vob")||fromFile.endsWith("drc")||fromFile.endsWith("gif")
        		||fromFile.endsWith("mkv")||fromFile.endsWith("ogv")||fromFile.endsWith("ogg")||fromFile.endsWith("gifv")
        		||fromFile.endsWith("flv")||
        		fromFile.endsWith("mng")||fromFile.endsWith("avi")||fromFile.endsWith("wmv")||fromFile.endsWith("mov")||
        		fromFile.endsWith("mpeg")||fromFile.endsWith("mpg")||fromFile.endsWith("mp4")||fromFile.endsWith("m4p")||
        		fromFile.endsWith("viv")||fromFile.endsWith("asf")||fromFile.endsWith("amv")||fromFile.endsWith("m4v")||
        		fromFile.endsWith("nsv")||fromFile.endsWith("3g2")||fromFile.endsWith("svi")||fromFile.endsWith("3gp")
        		||fromFile.endsWith("vtt")||fromFile.endsWith("m3u")) {
        	String toFile = path7+"\\"+file.getName();

            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);
        	moveit(source,target);
        }
        else if(fromFile.endsWith("mp3")||fromFile.endsWith("wav")||fromFile.endsWith("m4a")
        		||fromFile.endsWith("flac")||fromFile.endsWith("wma")||fromFile.endsWith("aac")) {
        	String toFile = path5+"\\"+file.getName();

            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);

        	moveit(source,target);
        }
        else {
        	String toFile = path8+"\\"+file.getName();

            Path source = Paths.get(fromFile);
            Path target = Paths.get(toFile);

        	moveit(source,target);
        }
      }
      else {
    	  if(file.toString().endsWith("images")||file.toString().endsWith("Compressed")||file.toString().endsWith("Docs")||
    			  file.toString().endsWith("Programs")|| file.toString().endsWith("Music")|| file.toString().endsWith("Videos")
    			  || file.toString().endsWith("Folders")|| file.toString().endsWith("Others")|| file.toString().endsWith("Shortcuts")) {
    		  
    		  continue;
    	  }
    	  else {
    		  
    	  String toFile = path6+"\\"+file.getName();
    	  String fromFile =file.getAbsolutePath();

          Path source = Paths.get(fromFile);
          Path target = Paths.get(toFile);
      	moveit(source,target);
    	  
      }
      }
    }
    JOptionPane.showMessageDialog(null, "Succfully Sorted");

	
	return 0;
	
	
}
	
	

	public static void main(String[] args) {
  Sorting s1;
  s1=new Sorting();
  s1.selectFile();
	}

}
