create table book (
    id bigint auto_increment primary key,
    title varchar(256),
    author_id bigint
);

create table author (
    id bigint auto_increment primary key,
    name varchar(256),
    address varchar(100)
)
