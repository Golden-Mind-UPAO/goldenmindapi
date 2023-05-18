-- Table: public.pacientes

-- DROP TABLE IF EXISTS public.pacientes;

CREATE TABLE IF NOT EXISTS public.pacientes
(
    id_paciente bigint NOT NULL DEFAULT nextval('pacientes_id_paciente_seq'::regclass),
    correo_paciente character varying(255) COLLATE pg_catalog."default" NOT NULL,
    edad_paciente integer NOT NULL,
    genero_paciente character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre_paciente character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre_usuario character varying(255) COLLATE pg_catalog."default" NOT NULL,
    password_usuario character varying(255) COLLATE pg_catalog."default" NOT NULL,
    telefono_paciente integer NOT NULL,
    CONSTRAINT pacientes_pkey PRIMARY KEY (id_paciente)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.pacientes
    OWNER to postgres;