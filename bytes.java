package bytes;
import java.util.*;
import java.io.*;


public class Bytes {

    
    public static void main(String[] args) {
        FileInputStream filex=null;
        System.out.println("Escreva diretoria do ficheiro que pretende converter \n");
        Scanner s;
        s = new Scanner(System.in);
        String aux = s.nextLine();
        s.close();            
        System.out.println(aux);
        File file = new File(aux);
        byte[] bFile = new byte[(int) file.length()];
        try{
            filex = new FileInputStream(file);
            filex.read(bFile);
            filex.close();
            int i;
            for (i=0;i<bFile.length; i++){
                System.out.print((byte)bFile[i]);
            }
            //System.out.println("Done");
            }
            catch(Exception e){
        	e.printStackTrace();
            }
            int i;
            for(i=0;i<bFile.length;i++){
                System.out.println((byte)bFile[i]);
            }
        
    }
}
    
