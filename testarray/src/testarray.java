public class testarray {

    public static  void main(String[] args){
        String Str=new String("abcd");
        String Str2=new String("abcd");
        String Str3="def";
        System.out.println(Str.equals(Str2));
        System.out.println(Str.charAt(2));
        System.out.println(Str3.indexOf('e'));
        String S=Str3.substring(2);
        System.out.println(S);
        System.out.println(Str3.replace('e','x'));
        String Str6="abcdc,rtt,ccceee";
        String[] strArray=Str6.split(",");
        for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
        String Str7="  aa  bb  ";
        String Str77=Str7.trim();
        System.out.println(Str77);
        System.out.println("Abcbd".indexOf('d'));
        System.out.println("Abc".equalsIgnoreCase("abc"));
        System.out.println("Abcbd".lastIndexOf("b"));
        System.out.println("Abcbd".endsWith("b"));
        System.out.println("Abcbd".toLowerCase());
        System.out.println("Abcbd".toUpperCase());

    }
}
