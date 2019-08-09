CREATE TABLE authors (
    id int not null primary key,
    name varchar
);

CREATE TABLE books (
    id int not null primary key,
    name varchar,
    isbn varchar,
    author_id integer references authors(id)
);
