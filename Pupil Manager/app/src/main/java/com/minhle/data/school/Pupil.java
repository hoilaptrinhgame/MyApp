package com.minhle.data.school;

import com.minhle.data.Human;

public class Pupil extends Human {
    String sGrade;
    String sParentMobile;

    public Pupil(String aName, int aAge, int aBirth, int aSex,String aGrade, String aParentMobile) {
        super(aName, aAge, aBirth, aSex);
    }
}
