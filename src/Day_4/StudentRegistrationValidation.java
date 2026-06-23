package Day_4;

public class StudentRegistrationValidation {

    public static void main(String[] args) {

        String rollNo = "101";
        String age = "19";
        String mobile = "9876543210";
        String cgpa = "8.7";
        char section = 'A';

        boolean isValid = true;

        try {

            int rollNumber = Integer.parseInt(rollNo);

            int ageValue = Integer.parseInt(age);

            double cgpaValue = Double.parseDouble(cgpa);

            boolean isLetter = Character.isLetter(section);

            boolean mobileValid = true;

            for (int i = 0; i < mobile.length(); i++) {
                if (!Character.isDigit(mobile.charAt(i))) {
                    mobileValid = false;
                    break;
                }
            }

            char lowerSection = Character.toLowerCase(section);

            char upperSection = Character.toUpperCase(section);

            String ageString = Integer.toString(ageValue);

            if (!isLetter || !mobileValid) {
                isValid = false;
            }

            System.out.println("Roll No: " + rollNumber);
            System.out.println("Age: " + ageValue);
            System.out.println("CGPA: " + cgpaValue);
            System.out.println("Section is Letter: " + isLetter);
            System.out.println("Mobile Number Valid: " + mobileValid);
            System.out.println("Lowercase Section: " + lowerSection);
            System.out.println("Uppercase Section: " + upperSection);
            System.out.println("Age as String: " + ageString);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format entered.");
            isValid = false;
        }
        if (isValid) {
            System.out.println("Student Details Valid");
        } else {
            System.out.println("Student Details Invalid");
        }
    }
}