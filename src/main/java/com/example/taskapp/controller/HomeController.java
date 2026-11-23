package com.example.taskapp.controller; // Controller用パッケージを指定する
import org.springframework.stereotype.Controller; // Controllerアノテーションを読み込む
import org.springframework.web.bind.annotation.GetMapping; // GETのURLとメソッドを対応付ける
@Controller // Springが管理するControllerであることを示す
public class HomeController { // トップページのControllerを定義する
    @GetMapping("/") // トップページへのGETリクエストを受け取る
    public String home() { // 画面を表示するメソッドを定義する
        return "home"; // templates/home.htmlを表示する
    } // homeメソッドを終了する
} // HomeControllerクラスを終了する