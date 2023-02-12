package OOP_all.seminars.seminar4;


public class JSON{

    public static <T> String Marshal(T obj){
        if(obj instanceof Worker){
            Worker temp = (Worker) obj;
            return String.format("{\n\t\"id\": %d ; \n\t\"name\": \"%s\"\n}",temp.getId(),temp.getName());
        }else if(obj instanceof String){
                String temp = (String) obj;
                return String.format("\"%s\"",temp);
                
        }else if(obj instanceof Integer){
            Integer temp = (Integer) obj;
            return String.format("%d", temp);
        }
        return "";
    }


    public static Object UnMarshal(String json){

        if(!json.contains("\"")) return Integer.parseInt(json);
        else if(!json.contains(":") && json.contains("\""))return json.replace("\"", "").trim();
        else if(json.contains(":")) {
            json = json.replace("{", "").replace("}", "");
            String[] fields = json.split(",");
            int id = 0;
            String name = "";
            for(String field : fields){
                String[] fieldSplit = field.trim().split(":");
                if(fieldSplit[0].contains("id")){
                    id = Integer.parseInt(fieldSplit[1].trim());
                }else if(fieldSplit[2].contains("name")){
                    name = fieldSplit[3].trim();
                }
                return new Worker(id, name);

            }

            
        }
        return new Object();
    }





    
}
