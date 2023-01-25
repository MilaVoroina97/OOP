package OOP_all.seminars.seminar2.seminarPlanet;

/* Закрепляем Singleton pattern
1. Найти в гугле пример для - Singleton pattern Lazy initialization.
2. По образу и подобию в отдельных файлах создать три синглтон класса Sun, Moon, Earth.
3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
*/

import java.io.IOException;
import java.util.Scanner;
public class Solution {

    public static Planet thePlanet;
    static
    {
        try
        {
            readKeyFromConsoleAndInitPlanet();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException{
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if(x.equals(Planet.Sun)) thePlanet = (Planet) Sun.getInstance();
        else if(x.equals(Planet.Moon)) thePlanet = (Planet) Moon.getInstance();
        else if(x.equals(Planet.Earth)) thePlanet = (Planet) Earth.getInstance();
        else thePlanet = null;
        sc.close();
    }
    
}
