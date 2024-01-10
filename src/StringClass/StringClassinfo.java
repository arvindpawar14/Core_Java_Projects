package StringClass;

public class StringClassinfo {
	public static void main(String[] args) {
		String str1= "Fusion";
		String str2= "FUSION";
		String str3= "";
		String str4= "ION";
		String str5= "Class";
		String str6= "Java Programs";
		// to convert the data small letter to capital letters
		System.out.println(str1.toUpperCase());
		//to convert the info from capital letter to small letter
		System.out.println(str2.toLowerCase());
		//to find out length of String
		System.out.println(str1.length());
		//To find out the index of the respective char
		System.out.println(str1.indexOf('i')); //3
		//To find out char at index
		System.out.println(str1.charAt(4));
		//To find out whether my String is empty
		System.out.println(str3.isEmpty());
		//To find out the Strings whether are those equal in nature
		System.out.println(str2.equals(str6));
		System.out.println(str2.equalsIgnoreCase(str3));
		//To find out whether my string contains this info
		System.out.println(str2.contains(str4));
		//To concatenate to strings with each other
		System.out.println(str1.concat(str4));
		//To check whether your string starts with these chars
		System.out.println(str1.startsWith("Fus"));		
		//To check whether your string ends with these chars
		System.out.println(str1.endsWith("ion"));			
		//SubString 
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(2, 4));		
		//Replace
		System.out.println(str6.replace("Java", "Python"));
		System.out.println(str2.replaceFirst(str4, str6));
	}

}
