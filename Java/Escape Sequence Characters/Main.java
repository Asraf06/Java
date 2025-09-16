public class Main {
    public static void main(String[] args) throws InterruptedException {
        int total = 20;

        for (int i = 0; i <= total; i++) {
            int width = 20; // Width of the progress bar
            int progress = (i * width) / total;
            String bar = "[" + "=".repeat(progress) + " ".repeat(width - progress) + "] " + (i*5) + "%";
            
            System.out.print("\r" + bar); // Overwrite the previous bar
            Thread.sleep(200);
        }
        System.out.println("\n\f"); // Move to the next line when done
    }
}