create if not exists table students(
    id          bigint autoincrement,
    firstname    varchar(30) not null,
    lastname     varchar(80) not null,
    address      varchar(255),
    mark         int,
    primary key (id)
);

insert into students (firstname, lastname, address,mark)
values
('Ozzy','Osbourne','Marston Green, Birmingham, England',100),
('Tony','Iommi','Birmingham, England',100),
('Geezer','Butler','Birmingham, England',100),
('Bill','Ward','Aston, Birmingham, England',100);