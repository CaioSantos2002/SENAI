mysql
-u root -p
show databases;
drop database teste;
create database teste;
show databases;
use teste;
create table exemplo
(
    id int not null
    auto_increment,
    nome varchar
    (30) not null,
    idade int not null,
    curso varchar
    (20) not null,
    periodo int not null,
    primary key
    (id));
show tables;
describe exemplo;
    insert into exemplo
        (nome,idade,curso,periodo)
    values('Caio Santos', '17', 'Tec desenvolvimento de sistemas', '1');
    select *
    from exemplo;
    insert into exemplo
        (nome,idade,curso,periodo)
    values
        ('Ronaldo Fenomeno', '22', 'Dentista', '1'),
        ('Maria Joaquina', '18', 'Letras', '1'),
        ('Cirilo', '18', 'Direito', '1');
    select *
    from exemplo;
    Update exemplo set nome = "Beltrano" where id = 4;
    select *
    from exemplo;
    delete from exemplo where id = '3';
    select *
    from exemplo;
    drop table exemplo;
    select *
    from exemplo;
    drop database teste;
    show databases;