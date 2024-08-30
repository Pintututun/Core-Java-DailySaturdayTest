package important_program3;

class NIT
{
  static String val = "NareshIT";
String language;
String faculty;
String student;
public NIT(String language, String faculty, String student) {
this.faculty = faculty;
this.language = language;
this.student = student;
}
 public static String get()
{
return val; // line 1
}
public void getValues()
{
System.out.println(NIT.this.faculty+" "+NIT.this.language+" "+NIT.this.student); // line 2
}
}
class OopsTest
{
public static void main(String[] args) {
System.out.println("Welcome to "+NIT.get());
NIT obj = new NIT("Java", "Naresh", "IT");
obj.getValues(); // line 3
}
}
