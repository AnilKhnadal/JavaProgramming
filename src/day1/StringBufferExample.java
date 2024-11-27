package day1;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Java");
        buffer.append(" Programming");
        buffer.insert(4, " Language");
        buffer.delete(4, 12);
        buffer.reverse();
        
        System.out.println(buffer);  // Output: gnimmargorP avaJ
    }

