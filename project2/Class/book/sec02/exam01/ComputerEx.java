package project2.Class.book.sec02.exam01;

public class ComputerEx {

    public static void main(String[] args) {
        int r = 10;

        Calculator Calc = new Calculator();
        System.out.println("원 면적 : " + Calc.areaCircle(r));
        System.out.println();

        Computer Com = new Computer();
        System.out.println("원 면적 : " + Com.areaCircle(r));
    }
}
