package com.example.myapplication   //  이 파일의 현재 위치

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {      // : extends 대신 : 콜론으로 상속을 나타낸다
    // AppCompatActivity 클래스는 구 버전 안드로이드 기기에서 최신 기능 사용하도록 돕는다, 하위 호환 앱 개발시 필수 상속

    // onCreate 메서드는 액티비티 시작되면 최초 호출, java main 메서드 같다
    override fun onCreate(savedInstanceState: Bundle?) {    // override 구문은 메서드를 오버라이드시 코틀린에서 쓰는 키워드
        super.onCreate(savedInstanceState)  // onCreate 메서드에서는 부모클래스의 생성자를 호출해야한다.
        setContentView(R.layout.activity_main)  // 액티비티가 표시할 레이아웃의 파일을 지정 , 여기서 R이란 안드로이드 스튜디오에서 자동으로 생성되는 리소스정보가지는 클래스
        // 리소스. 즉,  레이아웃, 메뉴, 그림, 문자열 모두 R클래스를 사용해 코드에서 조작
        clickButton.setOnClickListener {
            textView.text = "버튼을 눌렀습니다"
        }
    }
}
