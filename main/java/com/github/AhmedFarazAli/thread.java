package com.github.AhmedFarazAli;
// https://github.com/AhmedFarazAli

public class thread extends Thread {

    public static final String TAG="output";

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            i++;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
// https://github.com/AhmedFarazAli
    public void stopwait(){
        synchronized (this){
            notify();
        }
    }

}
