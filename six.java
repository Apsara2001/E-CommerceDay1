public class six {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        int[] m1 = {70, 80, 56};
        int[] m2 = {89, 62, 34};
        int[] m3 = {90, 92, 78};
        int[] m4 = {78, 65, 23};
        int[] m5 = {89, 98, 100};

        Student s1 = new Student("kamal", m1);
        Student s2 = new Student("bimal", m2);
        Student s3 = new Student("sunil", m3);
        Student s4 = new Student("lamal", m4);
        Student s5 = new Student("munil", m5);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            s.getAverage();
            System.out.println("-----------------------");
        }

    }
}