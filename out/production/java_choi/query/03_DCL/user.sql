create user 'user1'@'localhost'
	identified by '1111';

create user 'user2'@'%'
	identified by '2222';
create user 'board_app'@'board.likelion.net' identified by '1234';

grant select , insert on member to 'user1'@'localhost';

grant select on board_db.* to 'user1'@'localhost';