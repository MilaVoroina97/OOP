package OOP_all.seminars.seminar1;
// На языке Java реализовать следующий набор классов, при этом должна быть выделена их иерархия:
// 2.1.Транспортное средство
// 2.2.Автомобиль
// 2.3.Мотоцикл
// 2.4.Грузовик
// 2.5.Велосипед
// Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
// В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как и с родителем, 
// то есть показать значение всех его публичных свойств и вызвать метод ехать.
public class task1 {

    private static void showAll(Transport[] all){
        for(Transport transport : all){
            System.out.println(transport);
            transport.drive();
            System.out.println("---------");
        }
    }

    public static void main(String[] args) {
        Transport baseTransport = new Transport();
        Transport car = new Car("black","Mercedes",4,300,100);
        Transport motobike = new Motobike("white","Yamakasi",2,150,200);
        Transport truck = new Truck("yellow","Scania",10,1000,80);
        Transport bicycle = new Bicycle("red","Shkolnik",2,50,15);

        Transport[] all = new Transport[] {baseTransport,car,motobike,truck,bicycle};
        showAll(all);

    }
}
