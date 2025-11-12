create table member(
name varchar2(10),
userid varchar2(10) primary key,
pwd varchar2(10),
email varchar2(30),
phone char(13),
admin number(1) default 0
);

select * from member;

insert into member values('¿Ãº“πÃ', 'somi', '1234', 'gmd@naver.com', '010-2362-5157',0);
insert into member values('«œªÛ»£', 'sang12','1234','ha12@naver.com', '010-5269-8888',1);
insert into member values('±Ë¿±Ω¬', 'light', '1234','you1004@naver.com', '010-999-8282',0);


select *from member;
commit;

select name, userid from member;

select * from member
where userid = 'somi';

select phone from member
where userid = 'somi';

delete from member
where userid = 'light';




