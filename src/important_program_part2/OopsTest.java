package important_program_part2;

class NIT
{
static String val = "Welcome to nareshIT";
String language;
String faculty;
String student;
public NIT(String language, String faculty, String student) {
this.faculty = faculty;
this.language = language;
this.student = student;
}
public void get()
{
System.out.println(this.faculty+" "+this.language+" "+this.student);
}
}
class OopsTest
{

public static void main(String[] args) {
NIT nit = new NIT("Java", "Naresh", "IT");
nit.get();
}
}
