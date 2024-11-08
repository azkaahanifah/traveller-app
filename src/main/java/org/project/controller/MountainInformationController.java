package org.project.controller;

import org.project.entity.MountainInformation;
import org.project.service.IMountainInformationService;
import org.project.service.MountainInformationService;

import java.util.ArrayList;

public class MountainInformationController {

    public static void main(String[] args) {
        //SIAPKAN DATA REQUEST
        MountainInformation request = setRequestParameter();

        //PANGGIL LOGIC UNTUK MEMPROSES DATA YANG MASUK
        //AGAR DATA TSB DISIMPAN KE DATABASE
        IMountainInformationService service = new MountainInformationService();
        service.createInformation(request);
    }

    private static MountainInformation setRequestParameter() {
        MountainInformation request = new MountainInformation();
        request.setMountainName(null);
        request.setLocation("Dieng Plateu, Central Java");
        request.setDescription("Located in Dieng");
        request.setMdpl(2565);
        request.setRate("4.93");
        request.setImages(new ArrayList<>());

        return request;
    }
}
