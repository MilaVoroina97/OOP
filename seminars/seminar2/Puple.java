package OOP_all.seminars.seminar2;
// На языке C# написать следующие классы:
// 1. Школьник, содержащий следующие свойства:
// 1.1. ФИО
// 1.2. Средний балл
// 1.3. Номер класса,
// а так же содержащие следующие методы:
// 1.4 Играть
// 1.5 Учиться,
// выводящие на экран фразы "Я играю" и "Я учусь" соответственно.
// Реализовать следующие классы-наследники:
// 2. Малдшеклассник(начальная школа), содержащий следующее свойство:
// 2.1. Ходит ли в группу продлённого дня?
// А так же перегрузки методов базового класса, выводящие фразы "Я играю в игрушки" и "Я люблю школу" соотвественно, 
// а так же метод записаться в группу продлённого дня.
// 3. Ученик средней школы, содержащий перегрузки методов базового класса, выводящие на экран фразы "Я играю в Minecraft" и 
// "Ненавижу школу" соответственно.
// 4. Старшеклассник, следующее свойство:
// 4.1. Список сдаваемых экзаменов
// А так же следующие методы:
// 4.2 Записаться на экзамен
// 4.3 Играть, выводящий на экран фразу "Я играю в Dota"
// 4.4 Учиться, выводящий на экран фразу "Я должен учиться"
// У всех классов перегрузит
public abstract class Puple {

    private String name;
    private String lastName;
    private String familyName;
    private int meanScore;
    private int classNumber;
    protected Puple(String name,String lastName,String familyName,int meanScore,int classNumber){
        this.name = name;
        this.lastName = lastName;
        this.familyName = familyName;
        this.meanScore = meanScore;
        this.classNumber = classNumber;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetLastName(String lastName){
        this.lastName = lastName;
    }

    public void SetFamilytName(String familyName){
        this.familyName = familyName;
    }

    public void SetMeanAcore(int meanScore){
        this.meanScore = meanScore;
    }

    public void SetClassNumber(int classNumber){
        this.classNumber = classNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFamilyName(){
        return this.familyName;
    }

    public int getMeanScore(){
        return this.meanScore;
    }

    public int getClassNumber(){
        return this.classNumber;
    }

    public abstract void play();
    public abstract void study();

}
