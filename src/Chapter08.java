// Chapter08 - 패키지와 접근 제어자
// package com.example.chapter08;

class PackageExample {
    private String message = "Hello";

    protected void showMessage() {
        System.out.println("메시지: " + message);
    }
}

public class Chapter08 extends PackageExample {
    public static void main(String[] args) {
        Chapter08 example = new Chapter08();
        example.showMessage();
    }
}