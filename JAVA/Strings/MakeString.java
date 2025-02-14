class MakeString {
 public static void main(String args[]) {
 char c[] = {'J', 'a', 'v', 'a'}; 
 String s1 = new String(c);
 String s2 = new String(s1);
 
 System.out.println(c);
 System.out.println(s2);
 System.out.println("lenth of string is : " + s1.length());
 System.out.println(s2);
 System.out.println("lenth of string is : " + s2.length());

 }
}