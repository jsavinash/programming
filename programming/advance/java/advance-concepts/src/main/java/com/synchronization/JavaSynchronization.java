package com.synchronization;

class JavaSynchronization {

    public static void main(String[] args) {
        //JavaSynchronizedMethodResource syncMethod = new JavaSynchronizedMethodResource();
        //JavaSynchronizedBlockResource syncBlock = new JavaSynchronizedBlockResource();
        // JavaThreadOne jto = new JavaThreadOne(staticBlock);
        // JavaThreadTwo jtt = new JavaThreadTwo(staticBlock);
        JavaThreadOneStatic jto = new JavaThreadOneStatic();
        JavaThreadTwoStatic jtt = new JavaThreadTwoStatic();
        jto.setName("name-1");
        jtt.setName("name-2");
        jto.start();
        jtt.start();
    }
}