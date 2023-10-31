import java.text.DecimalFormat;
        import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of the all subject.....");
        System.out.print("javaProgram: ");
        float jp = sc.nextFloat();
        System.out.print("computer Periferalce: ");
        float peri = sc.nextFloat();
        System.out.print("digital electronics: ");
        float dge = sc.nextFloat();
        System.out.print("environmental studies: ");
        float es = sc.nextFloat();
        System.out.print("web design: ");
        float wp = sc.nextFloat();
        System.out.print("math: ");
        float mt = sc.nextFloat();
        float totalMarks = jp + peri + dge + es + wp + mt;


        //for converting decimalformat for only two number after the point
        DecimalFormat df = new DecimalFormat("#.00");
        float percentage = ((totalMarks / 600) * 100);
        String formatPercentage = df.format(percentage);
        System.out.println("you get the percentage: " + formatPercentage + "%");
        double cgpa = ((percentage / 100) * 4.00);
        String formatCgpa = df.format(cgpa);
        System.out.println("you get the cgpa out of 4: " + formatCgpa);


        // for compare the value with grade point using condition
        double cgpaValue = Double.parseDouble(formatCgpa);
        if (cgpaValue == 4.00) {
            System.out.println("congratulation you got: A+");
        } else if (cgpaValue < 4.00 && cgpaValue > 3.50) {
            System.out.println("congratulation you got: A");
        } else if (cgpaValue < 3.50 && cgpaValue > 3.00) {
            System.out.println("congratulation you got: A-");
        } else if (cgpaValue < 3.00 && cgpaValue > 2.50) {
            System.out.println("congratulation you got: B+");
        } else if (cgpaValue < 2.50 && cgpaValue > 2.00) {
            System.out.println("congratulation you got: C");
        } else if (cgpaValue < 2.00 && cgpaValue > 1.50) {
            System.out.println("congratulation you got: D");
        } else {
            System.out.println("OPPS! you field the exam");
        }
    }
}
