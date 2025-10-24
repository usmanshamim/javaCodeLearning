public class StringMethodsDemo {
    public static void main(String[] args) {
        // String methods
        String str = "Hello Java";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(6));
        System.out.println("Replace: " + str.replace("Java", "World"));
        // StringBuilder methods
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(6, "Java ");
        sb.delete(6, 11);
        System.out.println("StringBuilder: " + sb);
        // StringBuffer methods
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java");
        sbf.reverse();
        System.out.println("StringBuffer reversed: " + sbf);
    }
}
