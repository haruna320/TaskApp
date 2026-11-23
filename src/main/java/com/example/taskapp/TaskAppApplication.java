package com.example.taskapp; // このクラスが所属するパッケージを指定する

import org.springframework.boot.SpringApplication; // Spring Bootの起動処理を読み込む
import org.springframework.boot.autoconfigure.SpringBootApplication; // 自動設定を行うアノテーションを読み込む

@SpringBootApplication // Spring Bootアプリケーションの起点を示す
public class TaskAppApplication { // アプリケーションの起動クラスを定義する
    public static void main(String[] args) { // Javaプログラムの開始点を定義する
        SpringApplication.run(TaskAppApplication.class, args); // Webサーバを含むアプリケーションを起動する
    } // mainメソッドを終了する
} // TaskAppApplicationクラスを終了する