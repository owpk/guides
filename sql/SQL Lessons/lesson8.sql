CREATE TABLE public.apps (
	id bigint NULL GENERATED ALWAYS AS IDENTITY,
	"name" varchar NULL
	CONSTRAINT apps_pk PRIMARY KEY (id);
);

CREATE TABLE public.user_apps (
	id bigint NULL GENERATED ALWAYS AS IDENTITY,
	user_id bigint NULL,
	app_id bigint NULL,
	CONSTRAINT user_apps_pk PRIMARY KEY (id),
	CONSTRAINT user_apps_fk FOREIGN KEY (user_id) REFERENCES public.users(id),
	CONSTRAINT user_apps_fk_1 FOREIGN KEY (app_id) REFERENCES public.apps(id)
);

CREATE TABLE public.app_details (
	app_id bigint NULL,
	"size" bigint NULL,
	meta_data json NULL,
	CONSTRAINT app_details_fk FOREIGN KEY (app_id) REFERENCES public.apps(id)
);