SELECT *
FROM MEMBER
WHERE created_at = (SELECT MIN(created_at) FROM MEMBER);

select *
from member
where id in (1, 2);

select id, title, (select count(*) from reply where post_id = post.id) as reply_count
from post;

