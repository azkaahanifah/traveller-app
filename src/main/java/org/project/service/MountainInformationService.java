package org.project.service;

import org.project.entity.MountainInformation;

public class MountainInformationService implements IMountainInformationService {

    @Override
    public void createInformation(MountainInformation request) {
        //LOGIC
        //LAKUKAN VALIDASI TERHADAP REQUEST YANG MASUK
        if (isValidateRequestParam(request)) {
            //1. PROSES DATA ATAU REQUEST YANG MASUK
            //2. SIMPAN DATA KE DATABASE
            System.out.println("Output: " + "Success");
        } else {
            System.out.println("Output: " + "Failed");
        }
    }

    private boolean isValidateRequestParam(MountainInformation request) {
        //DATA KOSONG
        //1. NULL -> null
        //2. EMPTY STRING --> ""

        if (null != request.getMountainName() && !request.getMountainName().isEmpty()) {
           return true;
        }

        return false;
    }
}
