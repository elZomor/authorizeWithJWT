create table role_group (
    id bigint not null,
    role varchar(255),
    primary key (id)
);


create table user (
    id bigint not null,
    password varchar(255),
    username varchar(255),
    primary key (id)
);

create table user_role (
    user_id bigint not null,
    role_id bigint not null,
    CONSTRAINT FK_USER_ID FOREIGN KEY (user_id) REFERENCES user (id),
    CONSTRAINT FK_ROLE_ID FOREIGN KEY (role_id) REFERENCES role_group (id)
);