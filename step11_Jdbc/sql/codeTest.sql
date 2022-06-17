USE scott;

SELECT * FROM emp;
SELECT * FROM dept;

DESC dept;
DESC emp;

SELECT * FROM dept WHERE dname = "ACCOUNTING";

SELECT * 
FROM emp e  JOIN dept d 
ON e.deptno = d.deptno
WHERE dname = 'ACCOUNTING';

