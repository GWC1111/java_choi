-- 1. 게시글 목록 조회 (작성자 이름, 댓글 수 포함, 최신 등록순 정렬)
-- 작성한지 24시간 이내의 게시글 제목 앞에 (New) 추가
-- 댓글이 3개 이상 달린 게시글 제목 앞에 (Best) 추가
SELECT 
    CASE 
        WHEN COUNT(r.id) >= 3 THEN CONCAT('(Best)', p.title)
        WHEN p.created_at >= DATE_SUB(NOW(), INTERVAL 1 DAY) THEN CONCAT('(NEW)', p.title)
        ELSE p.title
    END AS title,
    m.name, 
    COUNT(r.id) AS reply
FROM post p
INNER JOIN member m ON m.id = p.member_id
LEFT JOIN reply r ON p.id = r.post_id 
GROUP BY p.id, p.title, m.name
ORDER BY p.created_at DESC;

-- 2. 게시글 상세 조회 (게시글 제목, 내용, 작성자 이름, 이메일, 댓글 작성자 이름, 댓글 내용 조회)
SELECT 
p.title, p.content, m.name, m.email,
(SELECT name
FROM member 
WHERE r.member_id = id
) AS 'r.name', 
r.content 
FROM post p
INNER JOIN member m ON m.id = p.member_id
LEFT JOIN reply r ON p.id = r.post_id 


-- 3. 게시글 등록 (새로운 게시글 작성)
INSERT INTO post (member_id, title, content, created_at, view_count) VALUES
    (1, '회고시간입니다.', '오늘도 sql 공부를 열심히 하고 있습니다.', '2026-06-16 16:50:00', 30);

-- 4. 게시글 수정 (2번 게시글의 제목과 내용 변경)
UPDATE post
SET content = '자바 복습 어떻게 하나요?'
WHERE id = 2;


-- 5. 게시글 삭제 (3번에서 등록한 게시글 삭제)
DELETE 
FROM post
WHERE created_at = (SELECT MAX(created_at) FROM post);


-- 6. 게시글 검색 (제목 또는 내용에 '자바'가 포함된 게시글 조회)
SELECT p.title
FROM post p
WHERE p.title LIKE '%자바%' OR p.content LIKE '%자바%';


-- 7. 게시글 페이징 조회 (최신순으로 2페이지 분량의 게시글 10건 조회)
SELECT title
FROM post
ORDER BY created_at DESC
LIMIT 10;

SELECT title
FROM post
ORDER BY created_at DESC
LIMIT 10, 10;

