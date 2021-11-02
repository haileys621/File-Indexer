import java.io.*;
import java.util.*;
public class IndexFile extends AvlTree{
    public static void main( String [ ] args ){
        File f = new File(args[0]);
        AvlTree tree = new AvlTree();
        int lineNum = 0;
        
        try{
            Scanner fileReader = new Scanner(f);
            while(fileReader.hasNextLine()){
                String str = fileReader.nextLine();
                lineNum++;
                String[] lineWords = str.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().split("\\s+");
                for(int i = 0; i < lineWords.length; i++){
                    tree.indexWord(lineWords[i], lineNum);
                }
            }
            tree.printIndex();
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}