import java.util.Arrays;
import java.util.Scanner;

public class Point {

    public double x; // абсцисса точки
    public double y; // ордината точки

    // возвращает строку с описанием точки
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    // выводит на экран описание точки
    public void print() {
        System.out.print(this.toString());
    }

    // метод перемещает точку на указанный вектор
    public void move(double a, double b) {
        x = x + a;
        y = y + b;
    }

    // метод изменяет координаты точки на указанные
    public void set(double a, double b) {
        x = a;
        y = b;
    }

    // конструктор по умолчанию, создающий точку с указанными пользователем координатами
    public void pointScanner() {
        boolean err;
        do {
            err = false;
            System.out.print("Введите абсциссу точки: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
            } else {
                System.out.println("Вы ввели не число, попробуйте снова");
                err = true;
            }
        } while (err);
        do {
            err = false;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите ординату точки: ");
            if (scan.hasNextDouble()) {
                y = scan.nextDouble();
            } else {
                System.out.println("Вы ввели не число, попробуйте снова");
                err = true;
            }
        } while (err);
    }

    public Point() {

    }

    // конструктор, создающий точку с указанными координатами
    public Point(double a, double b) {
        x = a;
        y = b;
    }

    // метод вычисляющий расстояние между точками
    public double length(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    // метод проверяющий совпадают ли точки
    public boolean equalsPoint(Point p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}

class Circle {
    public double r; // радиус
    public Point c; // центр

    // возвращает строку с описанием окружности
    public String toString() {
        return "Окружность с центром в точке " + c + " и радиусом " + r;
    }

    // выводит на экран описание окружности
    public void print() {
        System.out.print(this.toString());
    }

    // метод перемещает центр окружности на указанный вектор
    public void move(double a, double b) {
        c.move(a, b);
    }

    // метод изменяет окружность, перемещая центр в указанные координаты и меняя радиус
    public void set(double a, double b, double m) {
        c.set(a, b);
        r = m;
    }

    // метод изменяет окружность, перемещая центр в указанную точку и меняя радиус
    public void set(Point p, double m) {
        c.set(p.x, p.y);
        r = m;
    }

    // конструктор по умолчанию, создающий окружность с указанными пользователем параметрами
    Circle() {
        System.out.println("Задайте центр окружности");
        c = new Point();
        c.pointScanner();
        boolean err;
        do {
            err = false;
            Scanner scan = new Scanner(System.in);
            System.out.print("Задайте радиус: ");
            if (scan.hasNextDouble()) {
                r = scan.nextDouble();
                if (r <= 0) {
                    System.out.println("Радиус окружности должен быть положительным");
                    err = true;
                }
            } else {
                System.out.println("Вы ввели не число, попробуйте снова");
                err = true;
            }
        } while (err);
    }

    Circle(double a, double b, double m) {
        c = new Point();
        c.set(a, b);
        r = m;
    }

    // метод вычисляющий длину окружности
    public double length(Point p) {
        return 2 * Math.PI * r;
    }

    // метод проверяющий, совпадают ли две окружности
    public boolean equalsCircle(Circle o) {
        if (this.r == o.r && c.equalsPoint(o.c)) {
            return true;
        } else {
            return false;
        }
    }
}

//class Treug {
//    Treug() {
//        System.out.println("Задайте центр окружности");
//        c = new Point();
//        c.pointScanner();
//        boolean err;
//        do {
//            err = false;
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Задайте радиус: ");
//            if (scan.hasNextDouble()) {
//                r = scan.nextDouble();
//                if (r <= 0) {
//                    System.out.println("Радиус окружности должен быть положительным");
//                    err = true;
//                }
//            } else {
//                System.out.println("Вы ввели не число, попробуйте снова");
//                err = true;
//            }
//        } while (err);
//    }
//}


//
//


//   class Point implements Cloneable {
//    public double x; // абсцисса точки
//    public double y; // ордината точки
//
//    // возвращает строку с описанием точки
//    public String toString() {
//        return "("+x+";"+y+")";
//    }
//    // выводит на экран описание точки
//    public void printPoint() {
//        System.out.print(this.toString());
//    }
//    // метод перемещает точку на указанный вектор
//    public void movePoint(double a, double b) {
//        x = x + a;
//        y = y + b;
//    }
//    // метод изменяет координаты точки на указанные
//    public void setPoint(double a, double b) {
//        x = a;
//        y = b;
//    }
//    // конструктор по умолчанию, создающий точку в начале координат
//    public Point() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter x");
//
//            if (sc.hasNextDouble()) {
//                x = sc.nextDouble();
//                System.out.println("Enter y");
//                y = sc.nextDouble();
//            } else System.out.println("Not double");
//
//
//    }
//    // конструктор, создающий точку с указанными координатами
//    public Point(double a, double b) {
//        x = a;
//        y = b;
//    }
//    // метод вычисляющий расстояние между точками
//    public double length(Point p) {
//        return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
//    }
//    // метод проверяющий совпадают ли точки
//    public boolean equalsPoint(Point p) {
//        if(this.x == p.x && this.y == p.y) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public void wherePart (){
//        if (x>0 && y > 0) System.out.println("2");
//        if (x<0 && y < 0) System.out.println("3");
//        if (x>0 && y < 0) System.out.println("1");
//        if (x<0 && y > 0) System.out.println("4");
//    }
//}


// круги
//class Circle {
//    public double x; // абсцисса центра
//    public double y; // ордината центра
//    public double r; // радиус
//    Scanner sc = new Scanner(System.in);
//    public void printCircle() {
//        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
//    }
//    public void moveCircle(double a, double b) {
//        x = x + a;
//        y = y + b;
//    }
//    public void zoomCircle(double r) {
//        this.r = this.r * r;
//    }
//    public Circle() {
//        System.out.println("press x");
//        if (sc.hasNextDouble()) {
//            x = sc.nextDouble();
//            System.out.println("press y");
//            y = sc.nextDouble();
//            System.out.println("press radius");
//            r = sc.nextDouble();
//            printCircle();
//        } else System.out.println("Вы ввели что-то не то");
//    }
//    public Circle(double a, double b, double s) {
//        x = a;
//        y = b;
//        r = s;
//    }
//    // метод вычисляющий площадь круга
//    public double squareCircle() {
//        double s = Math.PI * r * r;
//        return s;
//    }
//    // метод проверяющий равны ли окружности по площадям
//    public boolean equalsCircle(Circle cir) {
//        if(this.squareCircle() == cir.squareCircle()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public double lineCir (){
//        double s = 2 * Math.PI * r;
//        return s;
//    }
//    public void blackHole (){
//        this.x = Math.random()*199-99;
//        this.y = Math.random()*199-99;
//    }
//    public void way (Circle opp){
//        double way33 = Math.sqrt(Math.)
//    }
//}


//       Задача про помощь учителю математики
//        int max = 0, max_j = 0, temp = 0;
//        int[][] mas1 = new int[15][3];
//        for (int i = 0; i < mas1.length; i++) {
//            for (int j = 0; j < mas1[i].length; j++) {
//                if (j==0) {
//                    mas1[i][j] = (int) (Math.random() * 8 + 2);
//                }
//               if (j==1) {
//                   do  mas1[i][j] = (int) (Math.random() * 8 + 2);
//                   while (mas1[i][1] == mas1[i][0]);
//               }
//
//                if (j == mas1[i].length - 1) {
//                    mas1[i][j] = mas1[i][j - 1] * mas1[i][j - 2];
//                    for(int q = 0; q < i; q++){
//                        if(mas1[i][j] == mas1[q][j] && i > 0) {
//                            if ((mas1[i][j - 1] == mas1[q][j - 2] && mas1[i][j - 2] == mas1[q][j - 1]) ||
//                                    (mas1[i][j - 1] == mas1[q][j - 1] && mas1[i][j - 2] == mas1[q][j - 2]))
//                                --i;
//                        }
//                    }System.out.print(mas1[i][j-2]+" * " + mas1[i][j - 1] + " = "+mas1[i][j]);
//
//                }
//            }
//            System.out.println("");
//        }
//        for(int i=0;i<mas1.length;i++){
//            for(int h=0;h<mas1[i].length;h++){
//                if(h==0)
//                    System.out.print(mas1[i][h]+"*");
//                if(h==1)
//                    System.out.print(mas1[i][h]+"= ");
//                if(h==2)
//                    System.out.println(mas1[i][h]);
//            }
//        }
//    }
//}


//   Преобразовать массив таким образом,
//   чтобы на первом месте в каждой строке стоял её наибольший элемент
//    int max = 0, max_j = 0, temp = 0;
//    int[][] mas1 = new int[6][7];
//        for (int i = 0; i < mas1.length; i++) {
//        for (int j = 0; j < mas1[i].length; j++) {
//        mas1[i][j] = (int) (Math.random() * 10);
//        System.out.print(mas1[i][j]);
//        if (j == 0) max = mas1[i][j];
//        else {
//        if (mas1[i][j] > max) {
//        max = mas1[i][j];
//        max_j = j;
//        }
//        }
//        if (j == mas1[i].length - 1) {
//        temp = mas1[i][0];
//        mas1[i][0] = max;
//        mas1[i][max_j] = temp;
//
//        }
//
//
//        }
//        System.out.println("");
//        }
//        System.out.println("");
//        for (int i = 0; i < mas1.length; i++) {
//        for (int j = 0; j < mas1[i].length; j++) {
//        System.out.print(mas1[i][j]);
//        }
//        System.out.println("");
//
//
//        }


//
//        int[] mas2 = new int [mas1.length];
//        for (int i = 0; i < mas1.length; i++) {
//            System.out.print("Строка № "+(i+1)+":");
//            for (int j = 0; j < mas1[i].length; j++) {
//                mas1[i][j] = (int) (Math.random() * 11 -5);
//                System.out.print(mas1[i][j] + " ");
//                if (j == 0) mas2[i] = mas1[i][j];
//                    else mas2[i] *= mas1[i][j];
//            }
//            System.out.println("");
//            System.out.println(mas2[i]);
//
//        }
//        for (int i=0; i < mas2.length; i++){
//            if (Math.abs(mas2[i])>b) {
//                b =  Math.abs(mas2[i]);
//                b2 = i+1;
//            }
//
//        }
//        System.out.println("Лучшая строка с номером:"+b2);
//


//    Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число больше 3х");
//                if (sc.hasNextInt()){
//                do {
//                b = sc.nextInt();
//                if (b < 3 || b==3)
//        System.out.println("маленькое число");
//        }
//        while (b < 3 || b==3);
//        } else System.out.println("Это не число!");
//
//        int [] mas = new int[b];
//        int [] mas2 = new int[b];
//        for (int i=0, j=0; i < mas.length; i++) {
//        mas[i] = (int) (Math.random()*b);
//        System.out.print(mas[i] + " ");
//        if (mas[i]%2==0 && mas [i]!=0) {
//        mas2[j] = mas[i];
//        j++;
//        }
//        }
//        System.out.println();
//        for (int i=0; i < mas2.length; i++)
//        System.out.print(mas2[i]+" ");
//        int [] mas2 = new int[10];
//        double [] mas3 = new double[10];
//        for (int i=0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random()*8+1);
//            System.out.print(mas[i] + " ");
//        }
//        System.out.println();
//        for (int i=0; i < mas2.length; i++) {
//            mas2[i] = (int) (Math.random()*8+1);
//            System.out.print(mas2[i] + " ");
//        }
//        System.out.println();
//        for (int i=0; i < mas.length; i++){
//            mas3[i] = (double) mas[i]/mas2[i];
//            System.out.print(mas3[i]+" ");
//            if (mas[i]%mas2[i] == 0)
//                b++;
//        }
//
//        System.out.println("\n"+b);

//        System.out.println();
//        System.out.println(b+" "+b2);


//        int [] mas2 = {0,2,3,5,4};
//        for (int i=0; i < mas2.length; i++) {
//           // mas2[i] = (int) (Math.random() * 6);
//            b2+= mas2[i]/5;
//        }

//        for (int i = 0; i < mas.length; i++) {
//        System.out.print(mas[i] + " ");
//        if (mas[i] % 2 != 0)
//        mas[i] = 0;


