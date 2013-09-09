# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table item (
  id                        bigint not null,
  name                      varchar(255),
  quantity                  bigint,
  constraint pk_item primary key (id))
;

create table location (
  id                        bigint not null,
  name                      varchar(255),
  details                   varchar(255),
  constraint pk_location primary key (id))
;


create table location_item (
  location_id                    bigint not null,
  item_id                        bigint not null,
  constraint pk_location_item primary key (location_id, item_id))
;
create sequence item_seq;

create sequence location_seq;




alter table location_item add constraint fk_location_item_location_01 foreign key (location_id) references location (id) on delete restrict on update restrict;

alter table location_item add constraint fk_location_item_item_02 foreign key (item_id) references item (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists item;

drop table if exists location;

drop table if exists location_item;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists item_seq;

drop sequence if exists location_seq;

