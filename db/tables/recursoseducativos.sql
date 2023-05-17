-- Table: public.recursoseducativos

-- DROP TABLE IF EXISTS public.recursoseducativos;

CREATE TABLE IF NOT EXISTS public.recursoseducativos
(
    id_recurso_educativo bigint NOT NULL DEFAULT nextval('recursoseducativos_id_recurso_educativo_seq'::regclass),
    autor character varying(255) COLLATE pg_catalog."default" NOT NULL,
    detalle_recurso character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre_recurso character varying(255) COLLATE pg_catalog."default" NOT NULL,
    tipo_recurso character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT recursoseducativos_pkey PRIMARY KEY (id_recurso_educativo)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.recursoseducativos
    OWNER to postgres;