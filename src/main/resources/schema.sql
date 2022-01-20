create table customers (
                         id int not null primary key auto_increment,
                         name varchar(255) not null,
                         surname varchar(255) not null,
                         age int,
                         phone_number int not null,
                         check ( age > 0 )
);
create table orders1 (
                           id int not null primary key auto_increment,
                           date datetime not null,
                           customer_id int not null,
                           product_name varchar(255) not null,
                           amount int not null,
                           foreign key (id) references customers (id),
                           check ( amount > 0 )
);
