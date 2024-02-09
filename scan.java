public class scan {
    public static void main(String[] args) {
        String nameIv = "Ivancho";
        String nameAn = "Ani";
        String namePen = "Pencho";
        String nameMar = "Mariyka";
        String namebor = "Borislavcho";
        int gradeIv = 2;
        int gradeAn = 5;
        int gradeMar = 6;
        int gradePen = 4;
        int gradeBor = 5;
        System.out.printf("|%-11s|%4d|%n", nameIv, gradeIv);
        System.out.printf("|%-11s|%4d|%n", nameAn, gradeAn);
        System.out.printf("|%-11s|%4d|%n", nameMar ,gradeMar);
        System.out.printf("|%-11s|%4d|%n", namePen ,gradePen);
        System.out.printf("|%s|%4d|%n", namebor, gradeBor);
    }
}
