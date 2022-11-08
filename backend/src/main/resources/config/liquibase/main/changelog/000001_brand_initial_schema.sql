CREATE SCHEMA IF NOT EXISTS car;

CREATE TABLE car.brand
(
    id               bigserial                               NOT NULL,
    name 			 text 									 NOT NULL,
    head_office 	 text,
    brand_ceo 	     text,
    is_active        bool                                    NOT NULL DEFAULT true,
    created_at       timestamptz                             NOT NULL DEFAULT now(),
    updated_at       timestamptz                             NOT NULL,
    deleted          bool                                    NOT NULL DEFAULT false,
    CONSTRAINT pk_brand PRIMARY KEY (id)
);