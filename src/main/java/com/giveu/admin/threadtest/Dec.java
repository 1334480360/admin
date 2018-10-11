package com.giveu.admin.threadtest;

public class Dec implements Runnable {
    private TestThread tt;

    public Dec(TestThread tt) {
        this.tt = tt;
    }

    @Override
    public void run() {
        tt.dec();
    }
}
