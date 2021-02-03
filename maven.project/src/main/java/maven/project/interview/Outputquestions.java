package maven.project.interview;

public class Outputquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("OKAY1");
        String str2 = new String("OKAY1");
        String str3 = new String("OKAY1");
        String str4 = new String(str1);
        System.out.println(str1 == str2);
        System.out.println(str1 == str4);
        System.out.println(str2="str1");
        System.out.println(str2);
        System.out.println("str1 == str2:" + (str1 == str2)); // str1=OKAY1, str2=OKAY1
        System.out.println("str1 == str3:" + (str1 == str3)); 
        System.out.println("str1.equals(str2):" + str1.equals(str2)); 
        System.out.println("str1.equals(str2):" + str1.equals(str4)); 
	}

}
