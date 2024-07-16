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
