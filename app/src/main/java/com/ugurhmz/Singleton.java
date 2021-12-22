package com.ugurhmz;

public class Singleton {

    private Landmark sentLandMark;
    private static Singleton singleton;

    private Singleton(){

    }


    public Landmark getSentLandMark() {
        return sentLandMark;
    }

    public void setSentLandMark(Landmark sentLandMark) {
        this.sentLandMark = sentLandMark;
    }

    public static Singleton getInstance(){
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

}
