--liquibase formatted sql
--changeset codecentric-docs:release_1.create_tables.sql

CREATE TABLE Customer
(
  id uuid NOT NULL,
  name VARCHAR(35),
  surname VARCHAR(35),
  CONSTRAINT sampletable_pkey PRIMARY KEY (id)
);
ALTER TABLE Customer
  OWNER TO admin;

--rollback DROP TABLE SampleTable;