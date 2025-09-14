public class Main {
    public static void main(String[] args) {
        // Simulating content for Page 1
        System.out.println("Annual Report - Page 1");
        System.out.println("=====================");
        System.out.println("This is the content of the first page...");
        System.out.println("... more content ...");

        // Form Feed: Signal the end of Page 1 and start of Page 2
        System.out.println("\f"); // On a printer, this would eject the page.

        // Content for Page 2
        System.out.println("Annual Report - Page 2");
        System.out.println("=====================");
        System.out.println("This is the content on the second page.");

        // Another Form Feed
        System.out.println("\f"); // Eject for the next potential page.
        System.out.println("End of Report.");
    }
}