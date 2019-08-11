package com.minhle.data.school;

import java.util.List;

public class SchoolBus {
    String sRegisterNumber;
    String sDriverName;
    String sServicer;
    int iIdNum;
    String sVendor;
    int iMaxCount;
    //List<Human> listHuman;
    public  SchoolBus(String aRegisterNum, String aDriverName ,String aVendor,String aServicer,int aIdNum)
    {
        sRegisterNumber = aRegisterNum;
        sDriverName =  aDriverName;
        sVendor =  aVendor;
        iMaxCount = 18;
        sServicer = aServicer;
        iIdNum = aIdNum;
    }

}
