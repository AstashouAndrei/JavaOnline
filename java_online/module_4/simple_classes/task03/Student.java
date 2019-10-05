package by.java_online.module_4.simple_classes.task03;

public class Student {

    private String fullName;
    private int groupNumber;
    private int[] performanceChart;

    public Student(String fullName, int groupNumber, int[] performanceChart) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.performanceChart = performanceChart;
    }

    public boolean isExcellent() {

        int lessThanNineCounter = 0;

        for (int i = 0; i < performanceChart.length; i++) {
            if (performanceChart[i] < 9) {
                lessThanNineCounter++;
            }
        }
        return lessThanNineCounter == 0;
    }

    public static void printExcellentStudents(Student[] students) {
        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println(student);
            }
        }
    }

    public String toString() {
        return "Student: " + fullName + ". Group number " + groupNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getPerformanceChart() {
        return performanceChart;
    }

    public void setPerformanceChart(int[] performanceChart) {
        this.performanceChart = performanceChart;
    }
}
