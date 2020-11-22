CREATE TABLE STUDENT
(
SNAME VARCHAR2(20),
GRADELEVEL NUMBER(1),
S_ID NUMBER(5),
COURSE VARCHAR2(60),
BALANCE NUMBER(10)
)

ALTER TABLE STUDENT MODIFY(GRADELEVEL VARCHAR2(60));

select * from STUDENT;

create sequence s_seq;
start with 1;
increment by 1;
nocache;

select s_seq.nextval from dual;

insert into student (s_id) values (s_seq.nextval);

delete from student;
