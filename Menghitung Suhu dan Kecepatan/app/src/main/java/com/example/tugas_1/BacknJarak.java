package com.example.tugas_1;

public class BacknJarak {
    private float kec;
    private float waktu;

    public BacknJarak(float kec, float waktu) {
        this.kec = kec;
        this.waktu = waktu;
    }

    public float getKec() {
        return kec;
    }

    public void setKec(float kec) {
        this.kec = kec;
    }

    public float getWaktu() {
        return waktu;
    }

    public void setWaktu(float waktu) {
        this.waktu = waktu;
    }

    public float getJarak(){
        return (float) ((this.kec * (this.waktu * 60 * 60)) / 1000);
    }
}
