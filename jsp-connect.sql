create table member(
name varchar2(30),
userid varchar2(30) primary key,
pwd varchar2(10),
email varchar2(30),
phone char(13),
admin number(1) default 0
);
ALTER TABLE member MODIFY name VARCHAR2(50);


select * from member;

insert into member values('¿Ãº“πÃ', 'somi', '1234', 'gmd@naver.com', '010-2362-5157',0);
insert into member values('«œªÛ»£', 'sang12','1234','ha12@naver.com', '010-5269-8888',1);
insert into member values('±Ë¿±Ω¬', 'light', '1234','you1004@naver.com', '010-999-8282',0);
insert into member values('¿Ã¿±Ω¬', 'lee', '1234','you1005@naver.com', '010-999-8255',0);
insert into member values('∞≠«œ¥√', 'keg', '1234','you1006@naver.com', '010-999-8266',0);

select *from member;
commit;

select name, userid from member;

select * from member
where userid = 'somi';

select phone from member
where userid = 'somi';

delete from member
where userid = 'light';

commit;

delete from member
where userid = 'test1';



update member set 
pwd='1234', email='test@test.com', phone='010-1111-2222', admin=1
where userid = 'somi';

commit;
select * from member;

select * from member where userid ='somi';
