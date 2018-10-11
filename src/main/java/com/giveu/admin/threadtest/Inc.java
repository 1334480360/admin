package com.giveu.admin.threadtest;

public class Inc implements Runnable {
    private TestThread tt;

    public Inc(TestThread tt) {
        this.tt = tt;
    }

    @Override
    public void run() {
        tt.inc();
    }
}
