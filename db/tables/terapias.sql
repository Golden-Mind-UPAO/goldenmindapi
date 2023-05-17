-- Table: public.terapias

-- DROP TABLE IF EXISTS public.terapias;

CREATE TABLE IF NOT EXISTS public.terapias
(
    id_terapia bigint NOT NULL DEFAULT nextval('terapias_id_terapia_seq'::regclass),
    description character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre_seccion1 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre_seccion2 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre_seccion3 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre_terapia character varying(255) COLLATE pg_catalog."default" NOT NULL,
    reto1seccion1 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    reto1seccion2 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    reto1seccion3 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    reto2seccion1 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    reto2seccion2 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    reto2seccion3 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT terapias_pkey PRIMARY KEY (id_terapia)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.terapias
    OWNER to postgres;