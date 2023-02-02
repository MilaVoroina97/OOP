package OOP_all.seminars.seminar3;

import java.util.ArrayList;

// Написать программу на языках С# или С++, в которой идёт со следующими геометрическими фигурами:
// 1.Треугольник
// 2.Квадрат
// 3.Прямоугольник
// 4.Круг
// В программе имеется массив фигур, с которым можно сделать следующие операции:
// 1.Добавить новую фигуру
// 2.Посчитать периметр у всех фигур
// 3.Посчитать площадь у всех фигур
// Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр и посчитать площадь фигуры. 
// Массив фигур в программе должен быть представлен как массив объектов этого базового класса. Массив фигур должен создаваться и вся 
// работа с ним идёт внутри main. При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной 
// фигуры и в случае ошибки выдавать соответствующие сообщения.
public class Program {

    public static void main(String[] args) {
        try{
            ArrayList<Figure> figures = new ArrayList<>();
            Circle circle = new Circle(3);
            Rectangle rectangle = new Rectangle(5, 10);
            // Triangle triangle = new Triangle(1, 2, 3);
            Triangle triangle = Triangle.newBuilder(-1, 2, 3);
            Square square = new Square(4);
    
            figures.add(circle);
            figures.add(rectangle);
            figures.add(triangle);
            figures.add(square);
    
            for(Figure fig : figures){
                if(fig instanceof Perimetr){
                    System.out.printf("Perimetr %s : ",fig.getName());
                    System.out.println(((Perimetr)fig).getPerimetr());
                } 
                if(fig instanceof Circle){
    
                    System.out.printf("Circle length %s : ", fig.getName());
                    System.out.println(((Circle)fig).getCircleLenght());
                }
    
                System.out.printf("Area %s : ", fig.getName());
                System.out.println(fig.getArea());
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

  
    }
    
}
