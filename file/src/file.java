import java.io.File;

public class file {
    public static void main(String[] args) {
        File f=new File("G:\\java\\textwarppedclass\\out\\production\\textwarppedclass\\textwrappedclass.class");
        File f2=new File("G:\\java\\textwarppedclass\\out\\production\\textwarppedclass");
        File f3=new File(f2,"textdata");
        if(f.isFile()){
            System.out.println("shi");
        }
        else System.out.println("bushi");
        ;
        File f1=new File("");
        f1.delete();
        String str1=new String("fuckjava");
       String s= str1.substring(0,5);
        System.out.println(str1.substring(0,5));
        String str2=new String("fuckjavas");
      String s1=  str2.substring(1,5);
        if(s.equals(s1)){
            System.out.println("相等");}

                    else{
                        System.out.println("不相等");
        };
                    String text="";
                    if(text.length()==11){
                        System.out.println("No problem");
                    }




        }
    }


