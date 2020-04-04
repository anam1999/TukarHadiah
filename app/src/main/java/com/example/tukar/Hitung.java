package com.example.tukar;

public class Hitung {

    public String hitung(double poinsaya,double poin1) {

        String hitunglah;
        double hitungpoinhadiah=poinsaya;
        double poin1saya=poin1;

        if (hitungpoinhadiah>=poin1saya){
            hitunglah="dapat hadiah 100";

        }else{
            hitunglah="kurang";

        }
        return(hitunglah);

    }


    public String hitung2(double poinsaya,double poin2) {
        String hitunglah;
        double hitungpoinhadiah=poinsaya;
        double poinsaya2=poin2;


        if (hitungpoinhadiah>=poinsaya2){
            hitunglah="dapat hadiah 150";

        }else{
            hitunglah="kurang";

        }
        return(hitunglah);

    }

}

