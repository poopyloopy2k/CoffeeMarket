CREATE SEQUENCE IF NOT EXISTS coffee_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE coffee
(
    id       BIGINT       NOT NULL,
    type     VARCHAR(255) NOT NULL,
    disabled CHAR         NOT NULL,
    CONSTRAINT pk_coffee PRIMARY KEY (id)
);

ALTER TABLE coffee
    ADD CONSTRAINT uc_coffee_type UNIQUE (type);