
import java.util.Scanner;  // ব্যবহারকারী ইনপুট নেওয়ার জন্য Scanner ক্লাস ইমপোর্ট করা হয়েছে

public class FloatingPointSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ব্যবহারকারীর ইনপুট নেওয়ার জন্য Scanner অবজেক্ট তৈরি করা
        double sum = 0; // মোট যোগফল সংরক্ষণ করার জন্য একটি ভেরিয়েবল, শুরুতে 0
        int attempts = 0; // ভুল ইনপুটের সংখ্যা ট্র্যাক করার জন্য একটি ভেরিয়েবল

        System.out.println("Enter floating-point numbers (Type 'done' to finish):");

        while (true) { // লুপটি চালু থাকবে যতক্ষণ না এটি ভেঙে দেওয়া হয়
            if (attempts >= 2) { // যদি ভুল ইনপুটের সংখ্যা ২ বা তার বেশি হয়, লুপ বন্ধ করবে
                System.out.println("Too many invalid inputs. Exiting...");
                break; // লুপ থেকে বের হয়ে যাওয়া
            }

            String input = scanner.next(); // ব্যবহারকারীর ইনপুট স্ট্রিং আকারে নেওয়া
            if (input.equalsIgnoreCase("done")) { // যদি ইনপুট 'done' হয়, লুপ বন্ধ হবে
                break;
            }

            try { // ইনপুট পার্স করার চেষ্টা করা
                double value = Double.parseDouble(input); // স্ট্রিং থেকে double এ রূপান্তর
                sum += value; // ভ্যালু যোগ করা
                attempts = 0; // সঠিক ইনপুট পেলে ভুল গণনা রিসেট
            } catch (NumberFormatException e) { // যদি ইনপুট সঠিক না হয়
                System.out.println("Invalid input. Try again."); // ব্যবহারকারীকে বার্তা দেওয়া
                attempts++; // ভুল ইনপুটের সংখ্যা ১ বাড়ানো
            }
        }

        System.out.println("The total sum is: " + sum); // ফলাফল প্রিন্ট করা
        scanner.close(); // Scanner ক্লোজ করা
    }
}
