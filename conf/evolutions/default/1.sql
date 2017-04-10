# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table article (
  id                            bigint not null,
  title                         varchar(255),
  body                          TEXT,
  constraint pk_article primary key (id)
);
create sequence article_seq;


# --- !Downs

drop table if exists article;
drop sequence if exists article_seq;

