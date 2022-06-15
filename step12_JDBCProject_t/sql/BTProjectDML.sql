-- insert
insert into donor values('donor1', '헌혈1', 12, 'M', 'A-', '봉사');
insert into donor values('donor2', '헌혈2', 67, 'F', 'B-', '검사');
insert into donor values('donor3', '헌혈3', 35, 'F', 'O-', '봉사');

insert into recipient values('recipient1', '수혈1', 23, 'F', 'A-', '사고');
insert into recipient values('recipient2', '수혈2', 21, 'F', 'B-', '사고');
insert into recipient values('recipient3', '수혈3', 3, 'M', 'O-', '질병');

insert into bt_project values('A-', 'bt1', 'donor1', 'recipient1', 'A-형간의 수혈');
insert into bt_project values('B-', 'bt2', 'donor2', 'recipient2', 'B-형간의 수혈');
insert into bt_project values('O-', 'bt3', 'donor3', 'recipient3', 'O-형간의 수혈');

commit;
