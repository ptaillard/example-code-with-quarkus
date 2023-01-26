-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
insert into person (id, name, adr) values(nextval('hibernate_sequence'), 'Jane', 'Bath');
insert into person (id, name, adr) values(nextval('hibernate_sequence'), 'Arthur', 'Grenoble');
insert into person (id, name, adr) values(nextval('hibernate_sequence'), 'John', 'NYC');