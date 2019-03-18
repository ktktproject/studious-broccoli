drop table if exists category;
drop table if exists choice;
drop table if exists genre;
drop table if exists question;

-- カテゴリーマスター
--* RestoreFromTempTable
create table category (
  id integer not null
  , category_name character varying not null
  , constraint category_PKC primary key (id)
) ;

-- 選択肢マスター
--* RestoreFromTempTable
create table choice (
  id integer not null
  , question_id integer not null
  , is_correct integer not null
  , choice_text character varying not null
  , constraint choice_PKC primary key (id)
) ;

-- ジャンルマスター
--* RestoreFromTempTable
create table genre (
  id integer not null
  , category_id integer not null
  , genre_name character varying not null
  , constraint genre_PKC primary key (id)
) ;

-- 問題文マスター
--* RestoreFromTempTable
create table question (
  id integer not null
  , genre_id integer not null
  , question_text character varying not null
  , constraint question_PKC primary key (id)
) ;

comment on table category is 'カテゴリーマスター';
comment on column category.id is 'ID';
comment on column category.category_name is 'カテゴリー名';

comment on table choice is '選択肢マスター';
comment on column choice.id is 'ID';
comment on column choice.question_id is '問題文ID';
comment on column choice.is_correct is '正解可否';
comment on column choice.choice_text is '選択肢';

comment on table genre is 'ジャンルマスター';
comment on column genre.id is 'ID';
comment on column genre.category_id is 'カテゴリーID';
comment on column genre.genre_name is 'ジャンル名';

comment on table question is '問題文マスター';
comment on column question.id is 'ID';
comment on column question.genre_id is 'ジャンルID';
comment on column question.question_text is '問題文';

