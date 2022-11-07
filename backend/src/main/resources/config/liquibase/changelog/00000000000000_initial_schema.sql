CREATE EXTENSION unaccent;

CREATE OR REPLACE FUNCTION public.f_unaccent(text)
  RETURNS text AS
$func$
SELECT public.unaccent('public.unaccent', $1)  -- schema-qualify function and dictionary
$func$  LANGUAGE sql IMMUTABLE PARALLEL SAFE STRICT;


CREATE SEQUENCE public.sequence_generator
    START WITH 1050
	INCREMENT BY 50;