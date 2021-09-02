# Spring4
개쩌누!!!! 이게 되네 ㅋㅋ
## Board

### Notice
about 공지사항

   글번호, 글 제목, 글 내용, 작성자, 작성일, 조회수
	1   ,   A,      A   ,   A  ,  오늘,   0
	2   ,   A,      A   ,   A  ,  오늘,   0
	
1. OracleDB에 테이블 생성
	NOTICE(Table명)
	
	NUM(글번호)
	TITLE(글제목)
	CONTENTS(글내용)
	WRITER(작성자)
	REGDATE(등록일/REGISTERDATE)
	HITS(조회수)

noticeDAO noticeController noticeService
2. Notice Sequence
3. 기능
	1) List
		/notice/list
		/WEB-INF/views/board/list.jsp
	2) 상세보기
		/notice/select?num=   // 상세보기는 parameter도 넘겨줘야함
		/WEB-INF/view/board/select.jsp
	3) 글쓰기
	4) 삭제
	5) 수정