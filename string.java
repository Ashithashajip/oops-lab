
class string
{
public static void main(String args[])
{
String s1="welcome";
String s2="nice to meet you";
String s3=new String("SNGCE");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s1.length());
System.out.println(s1.concat(s2));
System.out.println(s1+" "+s2);
System.out.println(s1.compareTo(s2));
System.out.println(s2.substring(0,3));
System.out.println(s1.equals(s2));
System.out.println(s2.replace('e','z'));
System.out.println(s2.toUpperCase());
System.out.println(s2.toLowerCase());
}
}