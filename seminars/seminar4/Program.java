package OOP_all.seminars.seminar4;

public class Program {

    public static void main(String[] args) {
        Worker  w = new Worker(1,"Vasya");
        System.out.println(JSON.Marshal(w)); 

        String s = (String) JSON.UnMarshal("\"Ivan\"");
        System.out.println(s);
        String j = """
            {
            "id": 1,     
            "name": "Alex"
        }""";

        Worker w1 = (Worker) JSON.UnMarshal(j);
        System.out.println(w1);
    }
}