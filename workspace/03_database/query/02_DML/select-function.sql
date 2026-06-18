select name, email, CONCAT(name, ' (', email, ')') as member_info
from member;

select email, LENGTH('hello'), LENGTH('안녕하세요'), LENGTH(email) as email_length
from member;

select content , REPLACE(content, '안녕하세요', 'Hi!') as replaced_content
from post 
where content like '%안녕하세요%';

select title, SUBSTRING(title , 1, 10) as review
from post;

select content, CONCAT(SUBSTRING(content , 1, 10), '...') as review
from post;

select email, LOWER(email) as email_lower, UPPER(email) as email_upper
from member;

select email, TRIM(email) as trimmed_email
from member;

select NOW() as current_datetime;

select id, title, created_at, DATE_FORMAT(created_at, '%Y년 %m월 %d일 %H시 %i분 %s초') as  write_date
from post;

select CURDATE() as curr_date;

select id, title, created_at
from post
where created_at >= CURDATE();

select id, name, created_at, NOW(), DATE_SUB(CURDATE(), interval 7 day) as before_7days
from member
where created_at >= DATE_SUB(NOW(), interval 7 DAY);

select *
from member
where created_at <= DATE_SUB(NOW(), interval 1 MONTH);

select member_id, count(*) as total_count
from post
where member_id = 3;

select member_id, count(*) as total_counts, sum(view_count) as total_views, avg(view_count) as avg_views
from post
where member_id = 3;

select name, IFNULL(phone, '미등록') as phone
from member

select name, coalesce(phone, email, '연락처 없음') as contact
from member;

select name, IF(phone is null, '연락처 없음', '연락처 있음') as phone_status
from member;

select 
	name,
	created_at,
	CASE
		WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 YEAR) THEN '우수 회원'
		WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 MONTH) THEN '일반 회원'
		ELSE '신규 회원'
	END AS member_grade
from member;
	
