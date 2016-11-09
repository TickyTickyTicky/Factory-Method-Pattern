package com.test;

public class Main {
    public static void main(String[] args) {
        System.out.println("刘老板，你这里有啥子手机啊");
        P9Factory P = new P9Factory();
        P.CreateTel();
        Mate9Factory M = new Mate9Factory();
        M.CreateTel();
        System.out.println("让我思考思考是买Mate9还是买P9");
        System.out.println("好的我决定去其他地方逛一逛");
    }
}
