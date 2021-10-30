drop table if exists role_details cascade;
create table role_details ( role_name varchar(255) not null, role_description varchar(255), primary key (role_name));