drop table board cascade constraints purge; --���������� �ִ� ��� ���������� �����Ѵ�.
											--�θ� ���̺��� ��� �ڽĿ� ���� ���� ���ǵ� �����ȴ�.

CREATE table board(
	BOARD_NUM         NUMBER(5),         --�� ��ȣ(�⺻ Ű)
	BOARD_NAME        VARCHAR2(30),   --�ۼ���
	BOARD_PASS          VARCHAR2(30),   --��й�ȣ
	BOARD_SUBJECT      VARCHAR2(300),  --����
	BOARD_CONTENT    VARCHAR2(4000), --����
	BOARD_FILE            VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����Ǵ� ���ϸ�)
	BOARD_ORIGINAL    VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����� ������ ���� ���ϸ�)
	BOARD_RE_REF         NUMBER(5),      --�亯 �� �ۼ��� �����Ǵ� ���� ��ȣ
	BOARD_RE_LEV         NUMBER(5),      --�亯 ���� ����(���� ��:0, �亯:1, �亯�� �亯2)
	BOARD_RE_SEQ         NUMBER(5),     --�亯 ���� ����(���� �� �������� �����ִ� ����)
	BOARD_READCOUNT NUMBER(5),      --���� ��ȸ��
	BOARD_DATE DATE,                         --���� �ۼ� ��¥
	PRIMARY KEY(BOARD_NUM)
);

select * from board;

3. �� ��ȣ�� �������� ����Ѵ�.
		   ������ �̸� : board_seq
		   ���۰�:1 ������:1
drop sequence board_seq;
create sequence board_seq;

4.���̺� ��ȸ�� ���� �������� ����ǵ��� INSERT���� �ۼ��Ѵ�.
	 	  ����1) �������� ��� BOARD_RE_REF �÷��� ���� ���� �� ��ȣ�� �����ϴ�.                   
          ����2) BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT ���� ��� 0 �Դϴ�.
          ����3) BOARD_DATE�� �ý��� ��¥�Դϴ�.
          ����4) BOARD_FILE, BOARD_ORIGINAL�� null�� ó���մϴ�.
          ����5) ��й�ȣ ������ ������ ��ȸ �� �����մϴ�.

insert into board
		(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,     
 		BOARD_CONTENT ,BOARD_RE_REF,     
		BOARD_RE_LEV, BOARD_RE_SEQ, BOARD_READCOUNT,
		BOARD_DATE)
  values(board_seq.nextval, 'admin', '1', 'JSP ���δ� ����־��',
		'������ �غ���', board_seq.nextval,
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