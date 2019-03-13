INSERT INTO CATEGORY
SELECT
  *
FROM
  CSVREAD(
    'C:\eclipse\data\category.txt'
    , 'id' || char (9) || 'category_name'
    , 'UTF-8'
    , char (9)
  );

INSERT INTO GENRE
SELECT
  *
FROM
  CSVREAD(
    'C:\eclipse\data\genre.txt'
    , 'id' || char (9) || 'category_id' || char (9) || 'genre_name'
    , 'UTF-8'
    , char (9)
  );

INSERT INTO QUESTION
SELECT
  *
FROM
  CSVREAD(
    'C:\eclipse\data\question.txt'
    , 'id' || char (9) || 'genre_id' || char (9) || 'question_text'
    , 'UTF-8'
    , char (9)
  );

INSERT INTO CHOICE
SELECT
  *
FROM
  CSVREAD(
    'C:\eclipse\data\choice.txt'
    , 'id' || char (9) || 'question_id' || char (9) || 'is_correct' || char (9) || 'choice_text'
    , 'UTF-8'
    , char (9)
  );
