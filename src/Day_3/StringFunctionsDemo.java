package Day_3;

public class StringFunctionsDemo {

    public static void main(String[] args) {

        String name = " arul antran vijay ";
        String email = "arul@company.com";
        String department = "Computer Science";

        String trimmedName = name.trim();
        System.out.println("1. Trimmed Name: " + trimmedName);

        System.out.println("2. Uppercase: " + trimmedName.toUpperCase());

        System.out.println("3. Lowercase: " + trimmedName.toLowerCase());

        System.out.println("4. Length: " + trimmedName.length());

        System.out.println("5. Company Domain: "+ email.endsWith("@company.com"));

        System.out.println("6. Starts with A: "+ trimmedName.toUpperCase().startsWith("A"));

        System.out.println("7. First occurrence of 'a': "+ trimmedName.indexOf('a'));

        System.out.println("8. Replace Spaces: "+ trimmedName.replace(" ", "_"));

        System.out.println("9. First Four Characters: "+ trimmedName.substring(1, 6
        		));

        String anotherDepartment = "Computer Science";

        System.out.println("10. Department Comparison: "+ department.equals(anotherDepartment));
    }
}