# 깃
> 버전 관리 프로그램

- 이전 버전과 달라진 부분을 기록하고 되돌아가고 싶은 경우 달라진 부분을 복원할 수 있음
- 같은 파일을 여러명이 동시에 병렬로 개발이 가능함
- 파일마다 각각의 다른 버전을 보관할 수 있음

---
# 깃허브
> GIT을 지원하는 웹 호스팅 서비스(클라우드)의 한 종류

- 내 컴퓨터(로컬 저장소)에 있는 파일을 깃허브(원격 저장소)에 업로드할 수 있음



**깃과 깃허브는 다르다는 것을 머릿속에 각인해야 함!!!**

---

# GIT의 기본적인 용어들

- ### Repository
> 저장소. 각각의 히스토리, 태그, 소스를 branch에 따라 버전을 저장함. 저장소를 통해서 작업자가 변경한 모든 히스토리를 확인할 수 있음 </br>
> 원격 저장소는 remote

- ### Branch
> 프로젝트를 작업하기 위한 분기점. 각각의 분기점은 실제 사람으로 대치되는 것으로 이해할 수 있음

- ### Check Out
> 저장소에 특정 commit 이나 branch로 돌아가고 싶을 때 사용한다

- ### Commit
> 현재 변경된 작업 상태를 로컬 저장소에 저장하는 작업


- ### Push
> Commit을 마친 작업을 원격 저장소에 업로드 하는 작업


- ### Clone
> 원격 저장소에 있는 Repository를 로컬 저장소로 복제하는 작업 (Fork와 구분지어야 함)


- ### Pull Request
> 작업한 branch를 원격 저장소로 푸시하면 생성되는 것. 이러한 Pull Request를 받은 다른 개발자들은 코드를 검토하고 코드에 대한 의견이나 수정사항을 제안할 수 있다

- ### Fork
> 원격 저장소에 있는 Repository를 자신의 계정(자신의 원격 저장소)로 복제하는 작업

- ### Merge
> 각각의 branch 내용을 메인 branch에 가져와 병합하는 작업 </br>
> Merge할때 다음과 같은 상황에서는 충돌이 일어날 수 있다 </br>
> - 1. 같은 파일의 같은 라인을 수정한 경우
> - 2. 충돌이 발생하는 branch와 병합 하는 branch 사이에 기반 코드가 변경될 경우


- ### Pull
> 원격 저장소에 업로드된 내용을 본인의 로컬 저장소로 업데이트하는 작업


---

# MarkDown
- 텍스트 기반의 마크업 언어
- 특수기호와 문자를 이용해 매우 간단한 구조로 인해, 사용자는 보다 직관적이고 빠르게 컨텐츠를 인식할 수 있음.
- velog, 깃허브 등 여러 사이트에서 지원한다.

<br/>

**자세한 설명은 [마크다운 문법 정리](https://gist.github.com/ihoneymon/652be052a0727ad59601)를 참고할 것**



