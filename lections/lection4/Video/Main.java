package OOP_all.lections.lection4.Video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



public class Main {

    public static void main(String[] args) {
  
        ContentRepository<AudioContent> content1 = new ContentRepository<>();
        ContentRepository<VIdeoContent> content2 = new ContentRepository<>();
        Repository rep = new Repository();
        content1.addElem(new AudioContent("audio"));
        content1.addElem(new AudioContent("audio"));
        content1.addElem(new AudioContent("audio"));

        content2.addElem(new VIdeoContent("video"));
        content2.addElem(new VIdeoContent("video"));
        content2.addElem(new VIdeoContent("video"));

        rep.merge(content1.getAll(), content2.getAll());
        System.out.println(rep.get());


    }



}
