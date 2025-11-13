create table member(
name varchar2(10),
userid varchar2(10) primary key,
pwd varchar2(10),
email varchar2(30),
phone char(13),
admin number(1) default 0
);

select * from member;

insert into member values('ÀÌ¼Ò¹Ì', 'somi', '1234', 'gmd@naver.com', '010-2362-5157',0);
insert into member values('ÇÏ»óÈ£', 'sang12','1234','ha12@naver.com', '010-5269-8888',1);
insert into member values('±èÀ±½Â', 'light', '1234','you1004@naver.com', '010-999-8282',0);
insert into member values('ÀÌÀ±½Â', 'lee', '1234','you1005@naver.com', '010-999-8255',0);
insert into member values('°­ÇÏ´Ã', 'keg', '1234','you1006@naver.com', '010-999-8266',0);

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
where userid = 'waterdog';


