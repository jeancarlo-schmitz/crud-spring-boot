CREATE SCHEMA IF NOT EXISTS car;

CREATE TYPE car.category_type as enum('AVENTUREIRO_COMPACTO', 'HATCH_SUBCOMPACTO');

CREATE TABLE car.car
(
    id               bigserial                               NOT NULL,
    id_brand         bigint                                  NOT NULL,
    name 			 text 									 NOT NULL,
    category_type    car.category_type        				 NOT NULL DEFAULT 'AVENTUREIRO_COMPACTO',
    year_fabrication bigint 								 NOT NULL,
    chassi 			 text 									 NOT NULL,
    created_at       timestamptz                             NOT NULL DEFAULT now(),
    updated_at       timestamptz                             NOT NULL ,
    deleted          bool                                    NOT NULL DEFAULT false,
    CONSTRAINT pk_car PRIMARY KEY (id),
    CONSTRAINT fk_car_id_brand FOREIGN KEY (id_brand) REFERENCES car.brand (id)
);

CREATE INDEX ik_car_id_brand ON car.car (id_brand);