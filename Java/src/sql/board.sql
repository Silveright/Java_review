drop table board cascade constraints purge; --제약조건이 있는 경우 제약조건을 삭제한다.
											--부모 테이블인 경우 자식에 대한 제약 조건도 삭제된다.

CREATE table board(
	BOARD_NUM         NUMBER(5),         --글 번호(기본 키)
	BOARD_NAME        VARCHAR2(30),   --작성자
	BOARD_PASS          VARCHAR2(30),   --비밀번호
	BOARD_SUBJECT      VARCHAR2(300),  --제목
	BOARD_CONTENT    VARCHAR2(4000), --내용
	BOARD_FILE            VARCHAR2(50),   --첨부될 파일 명(시스템에 저장되는 파일명)
	BOARD_ORIGINAL    VARCHAR2(50),   --첨부될 파일 명(시스템에 저장된 파일의 원래 파일명)
	BOARD_RE_REF         NUMBER(5),      --답변 글 작성시 참조되는 글의 번호
	BOARD_RE_LEV         NUMBER(5),      --답변 글의 깊이(원문 글:0, 답변:1, 답변의 답변2)
	BOARD_RE_SEQ         NUMBER(5),     --답변 글의 순서(원문 글 기준으로 보여주는 순서)
	BOARD_READCOUNT NUMBER(5),      --글의 조회수
	BOARD_DATE DATE,                         --글의 작성 날짜
	PRIMARY KEY(BOARD_NUM)
);

select * from board;

3. 글 번호는 시퀀스를 사용한다.
		   시퀀스 이름 : board_seq
		   시작값:1 증가값:1
drop sequence board_seq;
create sequence board_seq;

4.테이블 조회와 같이 원문글이 저장되도록 INSERT문을 작성한다.
	 	  조건1) 원문글의 경우 BOARD_RE_REF 컬럼의 값은 원문 글 번호와 같습니다.                   
          조건2) BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT 값은 모두 0 입니다.
          조건3) BOARD_DATE는 시스템 날짜입니다.
          조건4) BOARD_FILE, BOARD_ORIGINAL는 null로 처리합니다.
          조건5) 비밀번호 삽입은 하지만 조회 시 제외합니다.

insert into board
		(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,     
 		BOARD_CONTENT ,BOARD_RE_REF,     
		BOARD_RE_LEV, BOARD_RE_SEQ, BOARD_READCOUNT,
		BOARD_DATE)
  values(board_seq.nextval, 'admin', '1', 'JSP 공부는 재미있어요',
		'열심히 해봐요', board_seq.nextval,
		0,0,0,
		sysdate);
		
select * from board;

SELECT * FROM BOARD
   ORDER BY BOARD_RE_REF DESC, 
   BOARD_RE_SEQ ASC;


select rownum rnum,BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, 
	   BOARD_CONTENT,BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
	   BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE 
from (SELECT * FROM BOARD
      ORDER BY BOARD_RE_REF DESC, 
      BOARD_RE_SEQ ASC)
where rownum <= 10


select *
from (select rownum rnum,BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, 
	   BOARD_CONTENT,BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
	   BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE 
from (SELECT * FROM BOARD
      ORDER BY BOARD_RE_REF DESC, 
      BOARD_RE_SEQ ASC)
where rnum<=40)
