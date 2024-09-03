package com.exam.mauibinding;

public class Calculator {
    // 附加题
    private final AddListener addListener;
    private final SubtractListener subtractListener;

    // 附加题构造函数
     public Calculator(AddListener addListener, SubtractListener subtractListener) {
        this.addListener = addListener;
        this.subtractListener = subtractListener;
     }

    // 加法方法：返回两个整数的和
    public void add(int a, int b) {
        int result = a + b;
        if (addListener != null) {
            addListener.onResult(a, b, result);
        }
    }

    // 减法方法：返回两个整数的差
    public void subtract(int a, int b) {
        int result = a - b;
        if (addListener != null) {
            subtractListener.onResult(a, b, result);
        }
    }
}
