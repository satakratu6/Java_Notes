// // Import the File class
// import java.io.File;

// // Import the IOException class to handle errors
// import java.io.IOException;

// public class createfile {
// 	public static void main(String[] args)
// 	{

// 		try {
// 			File Obj = new File("myfile.txt");
// 			if (Obj.createNewFile()) {
// 				System.out.println("File created: "
// 								+ Obj.getName());
// 			}
// 			else {
// 				System.out.println("File already exists.");
// 			}
// 		}
// 		catch (IOException e) {
// 			System.out.println("An error has occurred.");
// 			e.printStackTrace();
// 		}
// 	}
// }

import java.io.File;
import java.io.IOException;
class createfile{
    public static void main(String[] args) {
        try{
            File obj=new File("myFile1.txt");
            if(obj.createNewFile()){
                System.out.println("File created: "+obj.getName());
            } else{
                System.out.println("File already exists");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}