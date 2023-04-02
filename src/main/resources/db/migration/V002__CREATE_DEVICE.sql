create table device
(
    id          int auto_increment         not null,
    iot_id      varchar(32)                not null,
    dev_name    varchar(64)                not null,
    user_id     varchar(32)                not null,
    dev_type    varchar(32)                not null,
    status      set ('enabled','disabled') not null,
    dev_secret  varchar(128)               not null,
    description varchar(256)               not null,
    create_time datetime                   not null,
    primary key (id)
);