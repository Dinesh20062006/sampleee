package Day_3;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer username = new StringBuffer("JavaUser");

        username.append("123");
        System.out.println("1. Append 123: " + username);

        username.insert(4, "Pro");
        System.out.println("2. Insert Pro: " + username);

        int pos = username.indexOf("User");
        username.replace(pos, pos + 4, "Developer");
        System.out.println("3. Replace User: " + username);

        username.delete(username.length() - 3, username.length());
        System.out.println("4. Delete Last 3: " + username);

        username.reverse();
        System.out.println("5. Reverse: " + username);

        System.out.println("6. Length: " + username.length());

        System.out.println("7. Capacity: " + username.capacity());

        System.out.println("8. Character at Index 2: " + username.charAt(2));

        username.setCharAt(0, 'X');
        System.out.println("9. Modified StringBuffer: " + username);

        String result = username.toString();
        System.out.println("10. Converted String: " + result);
    }
}