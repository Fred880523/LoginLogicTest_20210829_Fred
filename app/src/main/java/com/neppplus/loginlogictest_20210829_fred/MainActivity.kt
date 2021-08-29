package com.neppplus.loginlogictest_20210829_fred

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 로그인 버튼 눌렸을때 이벤트 처리

        loginBtn.setOnClickListener {

            //입력한 아이디 받아서 저장

            val inputID = idShowTxt.text.toString()

            //비밀번호도 받아서 저장

            val inputPW = passwordTxt.text.toString()

            //아이디 / 비번에 저장된 값이 무엇인지 질문

            if (inputID == "admin" && inputPW == "qwer")

                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()

            else {

                Toast.makeText(this, "로그인에 실패하셨습니다.", Toast.LENGTH_SHORT).show()

            }
                


        }


    }
}