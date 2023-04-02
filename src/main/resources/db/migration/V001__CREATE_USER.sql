CREATE table user (
    id int not null auto_increment,
    user_id varchar(32) not null,
    pwd varchar(32) not null,
    user_name varchar(64) not null,
    user_secret varchar(128) not null,
    avatar varchar(255),
    primary key (id)
);