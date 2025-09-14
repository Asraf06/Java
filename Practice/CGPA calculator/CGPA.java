public class CGPA {
    public static void main(String[] args) {
        // CGPA calculator for 8 semesters
        float cradit = 4;
        
        float firstSem = 4.00f ;
        float secondSem = 3.00f ;
        float thirdSem = 2.80f ;
        float fourthSem = 4.00f ;
        float fifthSem = 3.75f ;
        float sixthSem = 3.50f ;
        float seventhSem = 4.00f ;
        float eighthSem = 4.00f ;

        float course = 4 * 8;

        float cgpa = ((firstSem + secondSem + thirdSem + fourthSem + 
                      fifthSem + sixthSem + seventhSem + eighthSem) * cradit) / course;

        System.out.printf("Final CGPA: %.2f\n", cgpa);
    }
}