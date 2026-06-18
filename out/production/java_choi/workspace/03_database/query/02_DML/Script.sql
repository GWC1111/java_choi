select member_id, COUNT(*)
from post
group by member_id;

select post_id, count(*) as reply_count
from reply
group by post_id 
order by reply_count desc;

select member_id, count(*) as post_count, sum(view_count) as total_views
from post
group by member_id;
