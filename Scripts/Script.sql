-- 마이바티스
CREATE SCHEMA JDBC_Mybatis;

-- 학생
CREATE TABLE student (
	stud_id INTEGER     NOT NULL COMMENT '학번',
	name    VARCHAR(50) NOT NULL COMMENT '성명',
	email   VARCHAR(40) NOT NULL COMMENT '메일',
	dob     DATE        NULL     COMMENT '입학일자'
)
COMMENT '학생';

-- 학생
ALTER TABLE student
	ADD CONSTRAINT PK_student 
		PRIMARY KEY (
			stud_id
		);
		
show tables;