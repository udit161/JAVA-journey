
public class Main {
    public static void main(String[] args) {

        String name = "TheSketchMan";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf('S');
        int lastIndex = name.lastIndexOf('M');

        name = name.toUpperCase();
        name = name.replace("SKETCH", "ART");
        name = name.substring(0, 3) + name.substring(6);
        name = name.trim();
        name = name.concat(" is awesome!");
        name = name.replaceAll(" ", "_");
        name = name.toLowerCase();
        name = name.replaceFirst("the", "a");
        name = name.replaceAll("[aeiou]", "*");

        System.out.println("Length of the string: " + length);
        System.out.println("First letter of the string: " + letter);
        System.out.println("Index of 'S': " + index);
        System.out.println("Last index of 'M': " + lastIndex);
        System.out.println("String in uppercase: " + name);
        System.out.println("String after replacement: " + name);
        System.out.println("String after substring: " + name);
        System.out.println("String after trim: " + name);
        System.out.println("String after concatenation: " + name);
        System.out.println("String after space replacement: " + name);
        System.out.println("String in lowercase: " + name);
        System.out.println("String after first occurrence replacement: " + name);
        System.out.println("String after vowel replacement: " + name);

    }

}