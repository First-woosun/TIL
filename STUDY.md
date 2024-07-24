## 2024-07-16
- Github 다시 잡기
    - git이란?
        - version control system
            - 프로그램을 개선해 나감에 있어 발생할 수 있는 변수에 대응하기 위한 시스템
        - centralize version control (중앙 집중화 버전 관리 시스템)
            - 서버에 저장된 파일을 copy해서 수정(update) 후 commit
            - 동시성 제어를 위해 copy 후 commit되기 전까지 해당 파일을 lock
            - 문제점 -> 원본이 하나
        - distributed version control (main server repository)
            - 각각의 작업자가 pull을 통해 파일을 받아오고 push를 통해 서버에 저장
            - 작업자가 여러명이므로 변경사항을 반영하는 merge 절차가 필요
            - 서비스에 장애가 발생해도 각각의 작업자가 원본을 갖고 있기 때문에 빠르게 복구 가능함
            - 여러개의 원본 파일에 각각 작업을 진행 -> 빠른 작업 속도
        - Git -> distributed version control
    
    - 저장소 만들기와 commit
        - git 기본 명령어 
            - git init -> 저장소 생성
            - git add <<filename>> -> 저장소에 파일 추가
            - git commit -m <<"메세지 내용">> -> 저장소에 변경내용 반영
            - git status -> 저장소의 상태 확인
            - git log -> git 변동 내역 확인 (log를 통한 롤백 작업 가능)
            - git config --global user.<name, email> -> 사용자 이름과 계정 등록
    
    - Branch
        - 분기점 생성
        - 별도의 branch와 master branch가 존재
        - 뱔도의 branch를 master branch와 합치는 것 -> merge(병합)
        - 명령어
            - git branch -> branch확인 (*가 있는 branch가 현재 작업중인 branch)
            - git branch <name> -> branch 생성
            - git checkout <name> -> 작업할 branch 변경
            - git merge <branchname> -> 해당 branch의 변경 내용을 현재 branch에 반영 (병합)
            - git branch -d <name> -> branch 삭제
    
    - merge와 충돌 해결
        - master와 개별 branch 둘 다 내용이 변경되었을 경우 발생
        - 충돌이 발생한 파일의 내용을 수정하여 해결
        - gitk -> git log를 GUI로 표시 (작관적으로 확인 가능)

    - 원격 저장소 생성, github
        - distibuted version control
        - github
            - repository 생성하기 (README 파일도 생성)
            - gitignore -> 소스코드를 제외한 부가적인 파일은 무시
            license -> 오픈소스에서 유명한 license 지정(license 정책에 따라 제약을 걸 수 있음)
            - github clone 생성
                - git clone <url> -> gitub에서 가져온 repository의 clone을 생성
            - github에 반영
                - git push
    
    - 원격 저장소와 PR(pull request)
        - 원격 저장소 관련 명령어 
            - git clone -> 원격 저장소의 내용을 복제
            - git push -> 원격 저장소에 반영
            - git pull -> 원격 저장소에 있는 내용 가져오기
            - git fetch -> 원격 저장소의 변경 내용만 가져오기
        - 다른 사람의 github를 가져와서 수정

## 2024-07-18
- 프레임워크 공부
    - 프레임워크란?
        - 정의
            - 틀(Frame)을 가지고 일(Work)하다.
            - 제공된 일정한 요소와 틀, 규약을 가지고 무언가를 만드는 것.
            - SW에서 "프로그램을 개발하기 위해 사용되는 툴을 제공하는 프로그램"
    - 프레임워크의 종류
        - 자바 -> Spring, Struct, 전자정부 프레임워크 등...
        - 자바 스크립트 -> AngularJS, React, Polymer, Ember 등...
        - 프론트엔드 -> BootStrap, Faoundation, MDL 등...
    - 장단점
        - 장점
            - 기본적인 틀이 존재하기에 시간도 절약되며 훨씬 빨리 만들 수 있어 효율적이다.
            - 미리 정해진 체계적인 툴이 있기 때문에 다른사람이 봐도 유지보수가 쉽다.
        - 단점
            - 기본적인 툴의 사용방법을 익혀야하기 때문에 오랜 시간을 두고 학습해야 함.
            - 프레임워크를 개발자가 제시한 구조를 벗어나지 못해 자유도가 낮음.
    
    - Spring, SpringBoot
        - Spring이란?
            - 엔터프라이즈용 Java 애플리케이션 개발을 편하게 할 수 있게 해주는 오픈소스 경량급 애플리케이션 프레임워크
                - 애플리케이션 프레임워크?
                    - 애플리케이션을 개발하는 데에 있어 필요한 모든 업무 분야 및 모든 기술과 관련된 코드들의 뼈대 제공
            - 특징
                - POJO (Plain Old Java Object) 프로그래밍 지향
                    - 순수 자바만을 통해 생성한 객체를 사용
                    - 외부 기술을 사용하지 않기 때문에 기술이나 규약의 변화에 얽매이지 않고 유연하게 대응 가능
                - IoC/DI (Inversion of Control / Dependency Injection)
                    - A인스턴스가 B인스턴스의 메소드를 호출할 때 A는 B와 의존관계 형성
                    - 만약 A인스턴스가 B인스턴스의 메서드가 아닌 C인스턴스의 메서드를 호출하게 코드를 수정할 경우 A인스턴스를 갖는 모든 파일을 수정해야함, 이는 많은 시간ㄷ과 비용이 소요 됨.
                    - Spring을 사용하면 이러한 수정 과정을 Spring이 대신 해줌
                    - 의존 관계를 맺어주는 것을 IoC, C를 A의 생성자에 주입해주는 것이 DI
                - AOP (Aspect Oriented Programing, 관심 지향 프로그래밍)
                    - 애플리케이션 개발은 크게 공통 관심 사항과 핵심 관심 사항으로 분류
                        - 핵심 관심 사항 -> 애플리케이션의 핵심 기능에 관련된 관심 사항
                        - 공통 관심 사항 -> 핵심 관심 사항에 공통적으로 적용되는 관심 사항
                    - 공통 관심 사항은 중복되는 코드들이 존재할 수 있음.
                    - 코드 수정 시 모든 중복 코드를 찾아 일일이 수정해줘야 함 (귀찮음)
                    - 이 문제 해결을 위해 공통 관심 사항과 관련된 기등을들 별도의 객체로 분리
                    - 애플리케이션 전반에 적용되는 공통 기능을 비즈니스 로직에서 분리 하는 것.
                - PSA (Portable Service Abstraction, 일관된 서비스 추상화)
                    - 특정 기술과 관련된 서비스를 추상화하여 일관된 방식으로 사용할 수 있도록 제작된 인터페이스 제공
                    - EX. DB 관련하여 MySQL로 개발했는데 다른 DB서비스로 변경해야 할 경우 이에 대응할 수 있도록 인터페이스가 마련되어있음
        - SpringBoot란?
            - Spring을 사용하기 위해선 먼저 여러가지 사항들을 설정해줘야 함 -> 이 과정이 복잡함.
            - 이 설정을 간편하게 할 수 있도록 해주는 별도의 프레임워크가 SpringBoot임

## 2024-07-24 
- 인프런 Git강의
    - git이란?
        - 코드 변경점을 기록하는 장치
    - github란?
        - 프로그램을 온라인에 코드를 백업하고 공유하는 온라인 백업 저장소
    - 필수 linux 명령어
        - linux 명령어를 사용하기 위해 git bash로 진행
        - pwd -> 현재 디렉토리 출력
        - ls -> 현재 디렉토리에 있는 것들 목록 출력
        - ls -a -> 숨김 팡리도 모두 출력
        - cd -> 현재 디렉토리 이동
    - git 필수 명령어
        - git init -> git을 본격적으로 시작하기 위해 초기 세팅, 프로젝트 시작 딱 한번만 입력하면 됨, .git 파일 생성, 정확한 디렉토리에서 진행
        - git add -> "git add 파일명"으로 사용, 저장 할 파일 지정
        - git commit -> "git commit -m 메세지 작성"으로 사용, 지정된 파일을 저장
        - git status
        - git log -> commit 내역 확인
        - git push
        - git clone
        - git pull
        - git branch
        - git checkout
        - git merge
    - github 업로드
        - git remote add origin https://github.com/First-woosun/github-practice2.git -> github 주소를 origin이라는 이름으로 저장
        - git branch -M main -> 브랜치 이름 변경
        - git push -u origin main -> 이 명령어를 입력해두면 git push만 입력해도 업로드 됨
    - 협업 하는 법(branch)
        - 브랜치 = 복사본
        - git branch 브랜치 이름 -> 브랜치 생성
        - git switch or git checkout -> 브랜치 이동 (switch를 권장)
        - git switch -c or git checkout -b -> 브랜치 한번에 생성 및 이동
    - 브랜치들 합치기
        - main에 합치는 이유
            - 메인 브랜치로 이동 후 메인에 작업한 브랜치 merge
        - git switch main, git merge login
    - pull request
        - 혼자 개발할 때는 merge를 써도 되지만 협업에서는 pull request를 사용함
        - github에서 코드의 변경사항을 적용하는 방법
    - 변경된 코드를 내 컴퓨터에 반영
        - git pull origin main
    - 전체 흐름 
        1. 브랜치 생성 및 이동 (git switch -c 브랜치 이름)
        2. 기능 개발 및 코드 저장 (git add ., git commit -m "")
        3. 코드 업로드 및 pull request 생성 (git push)
        4. github에서 merge 
        5. 내 로컬에도 반영 (git pull origin 브랜치 이름)
    - 실전 가이드
        - main 브랜치 -> 배포용 브랜치
        - dev 브랜치 -> 테스트 용 브랜치
        - 기능 브랜치 -> 기능 브랜치
        - 기능 브랜치에서 개발 후 dev 브랜치에서 테스트하고 main 브랜치에 반영하여 배포
    - 전체 순서
        1. 초기 세팅
            - 팀장 : 폴더를 생성하고 초기코드를 작성, git init add commit진행, github 레포지토리 생성, github 업로드
            - 
