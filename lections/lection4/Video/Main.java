package OOP_all.lections.lection4.Video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



public class Main {

    public static void main(String[] args) {
        Repository<AudioContent> mGlinka = new Repository<>("mGlinka");
        mGlinka.addElem(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 1"));
        mGlinka.addElem(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 2"));

        for(int i =0 ; i<mGlinka.count();i++){
            System.out.println(mGlinka.get(i));
        }

        Repository<AudioContent> pTchaikovsky = new Repository<>("pTchaikovsky");
        pTchaikovsky.addElem(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 1"));
        pTchaikovsky.addElem(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 2"));
        System.out.println();
        for(int i = 0; i < pTchaikovsky.count(); i++){
            System.out.println(pTchaikovsky.get(i));
        }


        Repository<VIdeoContent> youtubeVideo = new Repository<>("youtubeVideo");
        youtubeVideo.addElem(new VIdeoContent("youtube kotiki"));
        youtubeVideo.addElem(new VIdeoContent("youtube komiki"));
        System.out.println();

        for(int i = 0; i< youtubeVideo.count(); i ++){
            System.out.println(youtubeVideo.get(i));
        }


        pTchaikovsky.merge(youtubeVideo);
        System.out.println();
        for(int i = 0; i < pTchaikovsky.count(); i++){
            System.out.println(pTchaikovsky.get(i));
        }

    }



}
