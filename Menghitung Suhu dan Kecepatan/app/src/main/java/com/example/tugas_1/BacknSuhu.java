package com.example.tugas_1;

public class BacknSuhu {
    private float suhu;

    public BacknSuhu(float suhu) {
        this.suhu = suhu;
    }

    public float getSuhu() {
        return suhu;
    }

    public void setSuhu(float suhu) {
        this.suhu = suhu;
    }

    public float getKelvin(){
        return (this.suhu + 273);
    }

    public float getFarenheit(){
        return ((this.suhu * 9/5) + 32);
    }

    public float getReamur(){
        return (float) (0.8 * this.suhu);
    }
}
