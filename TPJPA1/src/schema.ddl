
    create table Livre (
        id  serial not null,
        "Titre" varchar(255),
        primary key (id)
    );

    create table Personne (
        id  serial not null,
        firstname varchar(255),
        lastname varchar(255),
        id_livre int4,
        primary key (id)
    );

    alter table Personne 
        add constraint FK_6v4nmwsaj0jgruw939fmj7ww0 
        foreign key (id_livre) 
        references Livre;
