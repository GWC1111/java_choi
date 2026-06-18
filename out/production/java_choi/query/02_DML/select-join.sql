select * from post;

select post.id, member_id, title, view_count, member.id, member.name, member.email
from post p
inner join member on post.member_id = member.id;

select reply.id, reply.content, reply.member_id, reply.post_id, member.name, post.title
from reply
inner join member on reply.member_id = member.id
inner join post on reply.post_id = post.id;

select m.id as member_id, m.name, p.title
from member m
left join post p on m.id = p.member_id
union
select m.id as member_id, m.name, p.title
from member m
right join post p on m.id = p.member_id;

select m1.name 회원명, m1.recommender_id, ifnull(m2.name, '-') 추천인명
from member m1
left join member m2 on m1.recommender_id = m2.id;