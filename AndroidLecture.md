## 2024-07-31
    1. 뷰의 개요
        - view 클래스
            * 안드로이드 화면에 실제로 사용되는 것들 
            * 다른 말로 위젯
            * 다른 위젯을 담을 수 있는 위젯은 레이아웃이라고 함
            * viewgroup 클래스 아래에 있음
                * button의 xml 속성
                    <pre>
                        <code>
                            <button
                                android:id="@+id/btn1"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:background="#ff0000"
                                android:text="버튼입니다"
                            >
                        </code>
                    <pre>
        - id 속성
            * 모든 위젯의 id를 나타냄
            * 자바 코드에서 위젯에 접근할 때 id 속성에 지저이한 아이디를 사용
            * id 속성 -> 위젯에 id를 새로 부여 (@+id/<> 형식으로 지정)
                * @+id/btn1
            * 자바 소스에서 사용
                <pre>
                    <code>
                        Button button1;
                        button1 = findViewById(R.id.btn1);
                    </code>
                </pre>
        - layout_width, layout_height 속성
            * match_parent : 자신의 부모(대게는 레이아웃)에 폭이나 높이를 맞춘다는 의미
            * wrap_content : 자신의 폭이나 넓이를 자신 안의 글자가 들어갈 정도로 설정
        - background 속성
            * 주로 RGB값으로 지정 (#RRGGBB)
        - padding 속성
            * 위젯이 경계선으로부터 위젯 안의 요소가 떨어지도록 설정
        - layout_margin 속성
            * 위젯과 위젯 사이에 여유를 두고 싶을 때 사용
        - visibility 속성
            * 위젯을 보일 것인지 여부를 결정
            * visible -> 표시, invisible/gone -> 숨김
        - enabled 속성(t/f)
            * 위젯의 동작 여부 
        - clickable 속성(t/f)
            * 클릭, 터치가 가능하도록 함
        - rotation 속성
            * 위젯을 회전시켜서 출력
            * 값은 각도로 지정