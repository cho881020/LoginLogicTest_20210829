package com.neppplus.loginlogictest_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그인 버튼 눌렸을때 이벤트 처리
        loginBtn.setOnClickListener {

//            입력한 아이디를 받아서 저장
            val inputId = idEdt.text.toString()

//            입력한 비밀번호도 받아서 저장.
            val inputPw = passwordEdt.text.toString()

//            아이디 / 비번에 저장된 값이뭔지 질문. if문 활용

            if (inputId == "admin" && inputPw == "qwer") {

//                아이디/비번이 둘다 맞는 경우.
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()

            }
            else {

//                둘 중 하나라도 틀린 경우.
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }


        }

    }
}