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

## 2024-08-07
    1. 레이아웃의 개요
        1. 기본 개념
            - ViewGroup 클래스로부터 상속받으며 내부에 무엇을 담는 용도로 사용
            - LinearLayout을 가장 많이 사용
            - 자주 사용되는 속성
                - orientation : 레이아웃 안에 배치할 위젯의 수직, 수평 방향을 설정
                - gravity : 레이아웃 안에 배치할 위젯의 절렬 방향을 좌측, 우츳, 중앙으로 설정
                - padding : 레이아웃 안에 배치할 위젯의 여백을 결정
                - layout_weight : 레이아웃이 전체 화면에서 차지하는 공간의 가중 값을 설정
                    - 여러개의 레이아웃이 중복 될 때 주로 사용
                - baselineAligned : 레이아웃 안에 배치할 위젯들을 보기 좋게 정렬
        2. 레이아웃의 종류
            - 리니어 (선형) 레이아웃 : 왼쪽 위부터 아래쪽 또는 오른쪽으로 차레로 배치
            - 릴레이티브 (상대) 레이아웃 : 위젯 자싱이 속한 레이아웃의 상하좌우의 위치를 지정하여 배치
            - 테이블 레이아웃 : 위젯을 행과 열의 개수를 지정한 테이블 형태로 배열
            - 그리드 레이아웃 : 테이블레이아웃과 비슷하지만, 행 또는 열을 확장하여 다양하게 배치할 때 더 편리
            - 프레임 레이아웃 : 위젯들을 왼쪽 위에 일륜적으로 겹쳐서 배칳여 중복해서 보이는 효과를 냄
        3. 기본 리니어 레이아웃 형태
            - orientation 속성 : 리니어 레이아웃의 가장 기본적인 속성
                - vertical : 리니어레이아웃 안에 포함될 위젯의 배치를 수직방향으로 쌓음
                - horizontal : 수평방향으로 쌓겠다는 의미
            - gravity 속성 : 레이아웃 안의 위젯을 어디에 배치할 것이지를 결정
            - layout_gravity 속성 : 자신의 위치를 부모의 어디쯤에 위치시킬지를 결정
            - baselineAligned 속성 : 크기가 다른 위젯들을 보기 좋게 정렬
                - true, false 값을 가짐

            