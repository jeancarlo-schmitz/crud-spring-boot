CREATE SCHEMA IF NOT EXISTS car;

CREATE TABLE car.brand
(
    id               bigserial                               NOT NULL,
    name 			 text 									 NOT NULL,
    head_office 	 text,
    brand_ceo 	     text,
    is_active        bool                                    NOT NULL DEFAULT true,
    created_at       timestamptz                             NOT NULL DEFAULT now(),
    updated_at       timestamptz                             ,
    deleted          bool                                    NOT NULL DEFAULT false,
    CONSTRAINT pk_brand PRIMARY KEY (id)
);

CREATE INDEX ik_brand_id ON car.brand (id);

CREATE TABLE car.category_type
(
    id               bigserial                               NOT NULL,
    name 			 text 									 NOT NULL,
    deleted          bool                                    NOT NULL DEFAULT false,
    CONSTRAINT pk_category_type PRIMARY KEY (id)
);

CREATE INDEX ik_category_type_id ON car.category_type (id);

CREATE TABLE car.car
(
    id               bigserial                               NOT NULL,
    id_brand         bigint                                  NOT NULL,
    id_category_type bigint                                  NOT NULL,
    name 			 text 									 NOT NULL,
    year_fabrication bigint 								 NOT NULL,
    chassi 			 text 									 NOT NULL,
    created_at       timestamptz                             NOT NULL DEFAULT now(),
    updated_at       timestamptz                             ,
    deleted          bool                                    NOT NULL DEFAULT false,
    CONSTRAINT pk_car PRIMARY KEY (id),
    CONSTRAINT fk_car_id_brand FOREIGN KEY (id_brand) REFERENCES car.brand (id),
    CONSTRAINT fk_car_id_category_type FOREIGN KEY (id_category_type) REFERENCES car.category_type (id)
);

CREATE INDEX ik_car_id_brand ON car.car (id_brand);
CREATE INDEX ik_car_id_category_type ON car.car (id_category_type);