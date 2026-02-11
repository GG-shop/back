# 2
CREATE TABLE tbl_member_oauth
(
    id              BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    provider        enum('threetier', 'kakao') not null, -- 'kakao', 'naver', 'google'
    oauth_member_id BIGINT UNSIGNED NOT NULL,
    constraint fk_member_oauth_member_id foreign key (oauth_member_id) references tbl_member (id)
);
DROP TABLE tbl_member_oauth;
SET foreign_key_checks = 1;